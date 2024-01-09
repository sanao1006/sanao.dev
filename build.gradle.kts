plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    kotlin("plugin.serialization") version "1.7.20"
}

group "dev.sanao"
version "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    maven {
        url = uri("https://repo.repsy.io/mvn/chrynan/public")
    }
}


@OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
kotlin {

    js(IR) {
        browser {
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                    useFirefox()
                }
            }
        }
        binaries.executable()
    }
    sourceSets {

        val jsMain by getting {
            dependencies {
                val serialization_version = "1.5.0"
                implementation(compose.web.core)
                implementation(compose.runtime)
                implementation(compose.ui)
                implementation(compose.foundation)
                implementation(kotlin("stdlib-js"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.6.4")
                implementation("io.insert-koin:koin-core-js:3.4.0")
                implementation("org.jetbrains:markdown-js:0.4.1")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$serialization_version")

            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

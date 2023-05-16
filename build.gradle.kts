import com.codingfeline.buildkonfig.compiler.FieldSpec.Type.STRING
import java.util.*

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    kotlin("plugin.serialization") version "1.7.20"
    id("com.codingfeline.buildkonfig") version "0.13.3"
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
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:$serialization_version")
                implementation("io.insert-koin:koin-core-js:3.4.0")
                implementation("org.jetbrains:markdown-js:0.4.1")
                implementation("app.softwork:routing-compose-js:0.2.10")
                implementation(npm("prismjs","1.29.0"))

            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}


fun getApiKey(): String {
    val properties = Properties()
    properties.load(project.rootProject.file("local.properties").inputStream())
    return properties.getProperty("API_KEY")
}

fun getSpaceId(): String {
    val properties = Properties()
    properties.load(project.rootProject.file("local.properties").inputStream())
    return properties.getProperty("SPACE_ID")
}

buildkonfig {
    packageName = "sanao.dev"
    defaultConfigs {
        buildConfigField(STRING, "API_KEY", getApiKey())
        buildConfigField(STRING, "SPACE_ID", getSpaceId() )
    }
}


import com.codingfeline.buildkonfig.compiler.FieldSpec.Type.STRING
import java.util.*

plugins {
    kotlin("multiplatform") version "1.7.20"
    id("org.jetbrains.compose")
    id("de.jensklingenberg.ktorfit") version "1.0.0"
    kotlin("plugin.serialization") version "1.7.20"
    id("com.codingfeline.buildkonfig") version "0.13.3"

}

configure<de.jensklingenberg.ktorfit.gradle.KtorfitGradleConfiguration> {
    version = "1.2.0"
}

group "dev.sanao"
version "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
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
                implementation("de.jensklingenberg.ktorfit:ktorfit-lib:1.2.0")
                implementation(kotlin("stdlib"))


            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}

compose.experimental{
    web.application {}
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
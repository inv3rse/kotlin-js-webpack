plugins {
    id("org.jetbrains.kotlin.js") version "1.4.0-rc"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(devNpm("file-loader", "6.0.0"))
}

kotlin {
    js {
        useCommonJs()
        browser {
            webpackTask {
                cssSupport.enabled = true
            }
            
            runTask {
                cssSupport.enabled = true
            }
            
            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
               }
            }
           }
        binaries.executable()
    }
}
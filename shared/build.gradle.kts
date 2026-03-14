plugins {
    alias(libs.plugins.kotlinMultiplatform)
    id("maven-publish")
}

group = "se.codesmart.zipcode-validator"
version = "1.0.0"

kotlin {
    jvm()

    js {
        outputModuleName = "zipcode-validator"
        browser()
        nodejs()
        binaries.library()
    }

    sourceSets {
        commonMain.dependencies {
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

publishing {
    repositories {
        mavenLocal()
    }
}
plugins {
    alias(libs.plugins.kotlinMultiplatform)
    id("maven-publish")
}

group = "se.codesmart.zipcode-validator"
version = "1.0.3"

kotlin {
    jvm()

    js {
        outputModuleName = "@supernovan/zipcode-validator"
        browser()
        nodejs()
        binaries.library()

        compilations.all {
            packageJson {
                customField("description", "A simple zipcode validator")
                customField("repository", "https://github.com/supernovan/zipcode-validator")
                customField("license", "MIT")
                customField("author", "Supernovan")
            }
        }
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

tasks.matching { it.name == "jsNodeProductionLibraryDistribution" }.configureEach {
    doLast {
        copy {
            from(file("README_NPM.md"))
            into(layout.buildDirectory.dir("dist/js/productionLibrary"))
            rename { "README.md" }
        }
    }
}
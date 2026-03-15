plugins {
    alias(libs.plugins.kotlinMultiplatform)
    id("maven-publish")
}

group = "se.kodasmart.zipcode-validator"
version = "1.0.5"

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

val copyNpmReadme by tasks.registering(Copy::class) {
    from(layout.projectDirectory.file("README_NPM.md"))
    into(rootProject.layout.buildDirectory.dir("js/packages/@supernovan/zipcode-validator"))
    rename { "README.md" }
}

tasks.matching { it.name.endsWith("jsNodeProductionLibraryDistribution") }.configureEach {
    finalizedBy(copyNpmReadme)
}
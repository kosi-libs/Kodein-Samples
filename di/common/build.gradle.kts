import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

val kodeinVersion: String by rootProject.extra

kotlin {
    targets {
        jvm() {
            tasks.withType<KotlinCompile> {
                kotlinOptions {
                    jvmTarget = "1.8"
                }
            }
        }
        js() {
            browser {}
            nodejs {}
        }
        macosX64("macos") { binaries.sharedLib() }
        linuxX64("linux"){ binaries.sharedLib() }
        mingwX64("mingw"){ binaries.sharedLib() }
    }

    sourceSets {
        getByName("commonMain").dependencies {
            implementation(kotlin("stdlib-common"))
            implementation("org.kodein.di:kodein-di-erased:$kodeinVersion")
        }
        getByName("jvmMain").dependencies {
            implementation(kotlin("stdlib-jdk8"))
        }
        getByName("jsMain").dependencies {
            implementation(kotlin("stdlib-js"))
        }
    }
}

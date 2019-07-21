import sun.tools.jar.resources.jar

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

val kodeinVersion: String by rootProject.extra

kotlin {
    targets {
        linuxX64 { binaries.executable() }
        macosX64 { binaries.executable() }
        mingwX64 { binaries.executable() }
    }

    sourceSets {
        getByName("commonMain").dependencies {
            implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
            implementation("org.kodein.di:kodein-di-erased:$kodeinVersion")
            implementation(project(":di:common"))
        }
    }
}

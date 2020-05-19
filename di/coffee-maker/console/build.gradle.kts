val kodeinVersion: String by rootProject.extra

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    targets {
        linuxX64 { binaries.executable() }
        macosX64 { binaries.executable() }
        mingwX64 { binaries.executable() }
    }

    sourceSets {
        getByName("commonMain").dependencies {
            implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
            implementation("org.kodein.di:kodein-di:$kodeinVersion")
            implementation(project(":di:coffee-maker:common"))
        }
    }
}

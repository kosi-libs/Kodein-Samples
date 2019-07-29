val kodeinVersion: String by rootProject.extra

plugins {
    id("org.jetbrains.kotlin.multiplatform")
}

repositories {
    jcenter()
    maven(url = "https://dl.bintray.com/kodein-framework/kodein-dev")
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
            implementation("org.kodein.di:kodein-di-erased:$kodeinVersion")
            implementation(project(":di:coffee-maker:common"))
        }
    }
}

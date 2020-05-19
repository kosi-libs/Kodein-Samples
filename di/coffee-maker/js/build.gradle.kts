val kodeinVersion: String by rootProject.extra

plugins {
    kotlin("js")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
    implementation("org.kodein.di:kodein-di:$kodeinVersion")
    implementation(project(":di:coffee-maker:common"))
}

kotlin {
    target {
        browser()
    }
}
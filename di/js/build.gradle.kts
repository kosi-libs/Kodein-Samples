plugins {
    kotlin("js")
}

val kodeinVersion: String by rootProject.extra

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
    implementation("org.kodein.di:kodein-di-erased:$kodeinVersion")
    implementation(project(":di:common"))
}

kotlin {
    target {
        browser()
    }
}
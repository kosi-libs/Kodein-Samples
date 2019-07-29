val kodeinVersion: String by rootProject.extra

plugins {
    kotlin("js")
}

repositories {
    jcenter()
    maven(url = "https://dl.bintray.com/kodein-framework/kodein-dev")
}

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
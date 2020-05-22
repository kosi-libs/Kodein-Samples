import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kodeinVersion: String by rootProject.extra

plugins {
    kotlin("jvm")
    application
}

application {
    mainClassName = "org.kodein.samples.di.tornadofx.KodeinApplication"
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("no.tornado:tornadofx:1.7.19")
    implementation("org.kodein.di:kodein-di-framework-tornadofx-jvm:$kodeinVersion")
}
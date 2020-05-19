import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktorVersion = "1.1.1"
val logbackVersion = "1.2.3"
val kodeinVersion: String by rootProject.extra

plugins {
    kotlin("jvm")
    application
}

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/ktor") }
}

application {
    mainClassName = "KodeinApplicationKt"
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    fun ktor(module: String = "", version: String = ktorVersion) = "io.ktor:ktor$module:$version"

    implementation(kotlin("stdlib-jdk8"))
    implementation(ktor())
    implementation(ktor("-server-netty"))
    implementation(ktor("-html-builder"))
    implementation("ch.qos.logback:logback-classic:$logbackVersion")

    implementation("org.kodein.di:kodein-di:$kodeinVersion")
    implementation("org.kodein.di:kodein-di-framework-ktor-server-jvm:$kodeinVersion")
}


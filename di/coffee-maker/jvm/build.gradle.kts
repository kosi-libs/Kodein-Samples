import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kodeinVersion: String by rootProject.extra

plugins {
    kotlin("jvm")
}

repositories {
    jcenter()
    maven(url = "https://dl.bintray.com/kodein-framework/kodein-dev")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.kodein.di:kodein-di-erased:$kodeinVersion")
    implementation(project(":di:coffee-maker:common"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "org.kodein.di.samples.JvmMainKt"
    }
    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
    }
}
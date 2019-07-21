import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

val kodeinVersion: String by rootProject.extra

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.kodein.di:kodein-di-erased:$kodeinVersion")
    implementation(project(":di:common"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "org.kodein.di.samples.JvmMainKt"
    }
    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
    }
}
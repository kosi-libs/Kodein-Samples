import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kodeinVersion: String by rootProject.extra

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

repositories {
    jcenter()
    google()
    maven(url = "https://dl.bintray.com/kodein-framework/kodein-dev")
}

android {
    compileSdkVersion(28)

    defaultConfig {
        applicationId = "kodein.samples"
        minSdkVersion(16)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    dexOptions {
        val travisBuild = System.getenv("TRAVIS") == "true"
        val preDexEnabled = System.getProperty("pre-dex", "true") == "true"
        preDexLibraries = preDexEnabled && !travisBuild
    }

    packagingOptions {
        exclude("META-INF/main.kotlin_module")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7")

    implementation("androidx.appcompat:appcompat:1.0.2")
    implementation("org.kodein.di:kodein-di-generic-jvm:$kodeinVersion")
    implementation("org.kodein.di:kodein-di-framework-android-x:$kodeinVersion")
    implementation(project(":di:common"))
}

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.2")
        classpath(kotlin("gradle-plugin", version = "1.4.21"))
    }
}

extra.set("kodeinVersion", "7.2.0")

allprojects {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        jcenter()
        maven(url = "https://dl.bintray.com/kodein-framework/kodein-dev")
    }
}
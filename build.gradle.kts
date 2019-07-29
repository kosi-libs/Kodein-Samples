buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0-rc01")
        classpath(kotlin("gradle-plugin", version = "1.3.41"))
    }
}

extra.set("kodeinVersion", "6.4.0-dev+")
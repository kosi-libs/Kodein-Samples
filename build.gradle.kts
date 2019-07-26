buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.3.41"))
        classpath("com.android.tools.build:gradle:3.5.0-rc01")
    }
}

    extra.set("kodeinVersion", "6.3.3")
}

allprojects {
    group = "org.kodein.samples"

    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        google()
    }
}
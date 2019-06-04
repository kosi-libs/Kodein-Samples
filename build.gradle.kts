buildscript {
    buildscript {
        repositories {
            mavenCentral()
        }

        dependencies {
            classpath(kotlin("gradle-plugin", version = "1.3.31"))
        }
    }

    extra.set("kodeinVersion", "6.3.0")
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
buildscript {
    buildscript {
        repositories {
            mavenCentral()
        }

        dependencies {
            classpath(kotlin("gradle-plugin", version = "1.3.41"))
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
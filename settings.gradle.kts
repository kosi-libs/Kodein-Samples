rootProject.name = "kodein-samples"

include(
    // Coffee-Maker project, based on Dagger's example
    ":di:coffee-maker:common",
    ":di:coffee-maker:android",
    ":di:coffee-maker:console",
    ":di:coffee-maker:js",
    ":di:coffee-maker:jvm",
    // standalone smples
    ":di:standalone:ktor",
    ":di:standalone:tornadofx"
)
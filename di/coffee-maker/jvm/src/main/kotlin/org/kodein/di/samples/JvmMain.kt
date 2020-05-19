package org.kodein.di.samples

import org.kodein.di.*

fun main() {
    KodeinMppApplication(
        DI {
            import(commonKodein)
            bind<CommonLogger>() with singleton { ConsoleLogger() }
        }
    )
}

class ConsoleLogger : CommonLogger {
    override fun log(msg: String) {
        println(msg)
    }
}
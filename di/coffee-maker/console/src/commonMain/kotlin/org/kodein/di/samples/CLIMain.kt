package org.kodein.di.samples

import org.kodein.di.DI
import org.kodein.di.*

fun runKodeinMppApplication() {
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
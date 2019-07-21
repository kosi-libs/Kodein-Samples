package org.kodein.di.samples

import org.kodein.di.Kodein
import org.kodein.di.erased.bind
import org.kodein.di.erased.singleton

fun main() {
    KodeinMppApplication(
        Kodein {
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
package org.kodein.di.samples

import org.kodein.di.*

fun main() {
    KodeinMppApplication(
        DI {
            import(commonKodein)
            bind<CommonLogger>() with singleton { JsLogger() }
        }
    )
}


class JsLogger : CommonLogger {
    override fun log(msg: String) {
        console.log(msg)
    }
}
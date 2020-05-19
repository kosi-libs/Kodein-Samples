package org.kodein.di.samples.coffee

import org.kodein.di.samples.CommonLogger
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

class ElectricHeater(private val log: CommonLogger) : Heater {
    private var heating: Boolean = false

    init {
        log.log("<Creating ElectricHeater>")
    }

    override fun on() {
        log.log("~ ~ ~ heating ~ ~ ~")
        this.heating = true
    }

    override fun off() {
        log.log(". . . cooling . . .")
        this.heating = false
    }

    override val isHot: Boolean get() = heating
}

val electricHeaterModule = DI.Module("Electric Heater") {
    bind<Heater>() with singleton { ElectricHeater(instance()) }
}
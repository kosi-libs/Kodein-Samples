package org.kodein.di.samples.coffee

import org.kodein.di.DI
import org.kodein.di.samples.CommonLogger
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton

class Thermosiphon(private val log: CommonLogger, private val heater: Heater) :
    Pump {

    init {
        log.log("<Creating Thermosiphon>")
    }

    override fun pumpWater() {
        if (heater.isHot)
            log.log("=> => pumping => =>")
        else
            log.log("!!! water is cold !!!")
    }
}

val thermosiphonModule = DI.Module("Thermosiphon") {
    bind<Pump>() with singleton {
        Thermosiphon(
            instance(),
            instance()
        )
    }
}

package org.kodein.di.samples.coffee

import org.kodein.di.samples.CommonLogger
import org.kodein.di.Kodein
import org.kodein.di.erased.bind
import org.kodein.di.erased.instance
import org.kodein.di.erased.singleton

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

val thermosiphonModule = Kodein.Module("Thermosiphon") {
    bind<Pump>() with singleton {
        Thermosiphon(
            instance(),
            instance()
        )
    }
}

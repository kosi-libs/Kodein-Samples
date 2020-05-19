package org.kodein.di.samples

import org.kodein.di.DI
import org.kodein.di.*
import org.kodein.di.samples.coffee.Coffee
import org.kodein.di.samples.coffee.Kettle
import org.kodein.di.samples.coffee.electricHeaterModule
import org.kodein.di.samples.coffee.thermosiphonModule

class KodeinMppApplication(override val di: DI) : DIAware {
    private val _kettle: Kettle<Coffee> by Instance(org.kodein.type.erased())
    private val _logger: CommonLogger by instance()

    init {
        val creator: String by constant()
        val maintainer: String by constant()
        _logger.log("Kodein-DI Demo by $creator and $maintainer")

        _kettle.brew()
    }
}

val commonKodein = DI.Module("MPP Kodein Module") {
    import(thermosiphonModule)
    import(electricHeaterModule)

    bind<Coffee>() with provider { Coffee(instance()) }

    bind<Kettle<*>>() with singleton { Kettle<Coffee>(instance(), instance(), instance(), provider()) }

    constant("creator") with "Salomon BRYS"
    constant("maintainer") with "Romain BOISSELLE"
}
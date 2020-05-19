package org.kodein.di.samples

import android.app.Activity
import android.app.Application
import org.kodein.di.bindings.WeakContextScope
import org.kodein.di.*
import org.kodein.di.android.x.androidXModule
import org.kodein.di.samples.coffee.Coffee
import org.kodein.di.samples.coffee.Kettle
import org.kodein.di.samples.coffee.electricHeaterModule

class DemoApplication : Application(), DIAware {

    override val di by DI.lazy {
        import(androidXModule(this@DemoApplication))

        bind() from instance(AndroidLogger())

        import(electricHeaterModule)

        bind<Coffee>() with provider { Coffee(instance()) }

        // this is bound in the scope of an activity so any retrieval using the same activity will return the same Kettle instance
        bind<Kettle<Coffee>>() with scoped(WeakContextScope.of<Activity>()).singleton { Kettle<Coffee>(instance(), instance(), instance(), provider()) }
    }

    override fun onCreate() {
        super.onCreate()
        val k = di
        println(k)
    }

}

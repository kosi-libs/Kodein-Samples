package org.kodein.di.samples

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*
import org.kodein.di.DI
import org.kodein.di.DIAware
import org.kodein.di.android.closestDI
import org.kodein.di.android.x.closestDI
import org.kodein.di.android.x.di
import org.kodein.di.instance
import org.kodein.di.samples.coffee.Coffee
import org.kodein.di.samples.coffee.Kettle

class MainFragment : Fragment(), DIAware {

    override val di: DI by di()

    // will be the same instance as the coffeeMaker in MainActivity
    val coffeeMaker: Kettle<Coffee> by instance()

    val log: AndroidLogger by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        log.log("onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onStart() {
        super.onStart()

        if (coffeeMaker != (requireActivity() as MainActivity).coffeeMaker) throw AssertionError()

        log.callback = {
            text.text = log.text
        }

        log.log("Starting to brew coffee using $coffeeMaker")

        Handler().postDelayed({
            coffeeMaker.brew()
        }, 3000)

        Handler().postDelayed({
            coffeeMaker.brew()
        }, 6000)
    }

    override fun onStop() {
        log.callback = null
        super.onStop()
    }
}

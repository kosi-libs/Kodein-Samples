package org.kodein.di.samples.coffee

interface Heater {
    fun on()
    fun off()
    val isHot: Boolean
}

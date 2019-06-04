package org.kodein.samples.di.tornadofx.person.model

import javafx.beans.property.SimpleBooleanProperty
import tornadofx.getValue
import tornadofx.setValue

class EditingState {
    val editingProperty = SimpleBooleanProperty(false)
    var editing by editingProperty
}
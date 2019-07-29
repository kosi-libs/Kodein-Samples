package org.kodein.samples.di.tornadofx

import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.*
import org.kodein.di.tornadofx.ComponentScope
import org.kodein.di.tornadofx.installTornadoSource
import org.kodein.samples.di.tornadofx.person.model.EditingState
import org.kodein.samples.di.tornadofx.person.model.Person
import org.kodein.samples.di.tornadofx.person.model.PersonRepository
import org.kodein.samples.di.tornadofx.person.model.PersonScope
import org.kodein.samples.di.tornadofx.person.view.PersonEditorView
import org.kodein.samples.di.tornadofx.person.view.PersonListView
import tornadofx.App
import tornadofx.View
import tornadofx.splitpane
import tornadofx.vbox

class KodeinApplication : App(MainView::class), KodeinAware {
    override val kodein: Kodein = Kodein {
        installTornadoSource()

        constant("test") with "MyApp"
        bind() from singleton { PersonRepository() }
        bind<PersonScope>() with factory { p: Person ->
            PersonScope(
                p
            )
        }
        bind<EditingState>() with scoped(ComponentScope).singleton { EditingState() }
    }
}

class MainView : View("Kodein TornadoFX") {
    override val root = splitpane() {
        minWidth = 1280.0
        minHeight = 720.0
        vbox {
            add(PersonListView::class)
        }
        vbox {
            add(PersonEditorView::class)
        }
    }
}
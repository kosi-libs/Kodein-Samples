package org.kodein.samples.di.tornadofx.person.controller

import javafx.beans.binding.Bindings
import org.kodein.di.instance
import org.kodein.di.on
import org.kodein.di.tornadofx.kodeinDI
import org.kodein.samples.di.tornadofx.person.model.Person
import org.kodein.samples.di.tornadofx.person.model.PersonScope
import org.kodein.samples.di.tornadofx.person.view.EditorTabFragment
import org.kodein.samples.di.tornadofx.person.view.PersonEditorView
import tornadofx.Controller
import tornadofx.closeableWhen
import tornadofx.plusAssign
import tornadofx.tab

class PersonEditorController : Controller() {
    val personEditorView: PersonEditorView by kodeinDI().instance()

    fun editPerson(person: Person) {
        val tp = personEditorView.tabPane

        val personScope: PersonScope by kodeinDI().instance(arg = person)
        val editor: EditorTabFragment by kodeinDI().on(personScope).instance()

        tp.tab(Bindings.concat(person.firstnameProperty, " ", person.lastnameProperty).valueSafe) {
            closeableWhen(editor.model.dirty.not())
            editor.tab = this
            this += editor
        }
    }
}
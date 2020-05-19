package org.kodein.samples.di.tornadofx.person.controller

import javafx.collections.ObservableList
import org.kodein.di.*
import org.kodein.di.tornadofx.kodeinDI
import org.kodein.samples.di.tornadofx.person.model.Person
import org.kodein.samples.di.tornadofx.person.model.PersonRepository
import tornadofx.Controller
import tornadofx.asObservable

class PersonListController : Controller(), DIAware {
    override val di: DI = kodeinDI()

    val personEditorController: PersonEditorController by instance()
    val personRepository: PersonRepository by instance()

    lateinit var personList: ObservableList<Person>

    init {
        updateList()
    }

    fun updateList() {
        personList = personRepository.findAll().asObservable()
    }

    fun save(person: Person) {
        personRepository.save(person)
        updateList()
    }

    fun editPerson(person: Person) {
        personEditorController.editPerson(person)
    }
}
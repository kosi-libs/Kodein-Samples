package org.kodein.samples.di.tornadofx.person.controller

import javafx.collections.ObservableList
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.instance
import org.kodein.di.tornadofx.kodein
import org.kodein.samples.di.tornadofx.person.model.Person
import org.kodein.samples.di.tornadofx.person.model.PersonRepository
import tornadofx.Controller
import tornadofx.asObservable

class PersonListController : Controller(), KodeinAware {
    override val kodein: Kodein = kodein()

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
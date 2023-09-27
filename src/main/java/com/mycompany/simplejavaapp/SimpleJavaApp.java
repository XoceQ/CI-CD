/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.simplejavaapp;

import com.mycompany.simplejavaapp.entities.Person;
import com.mycompany.simplejavaapp.entities.service.PersonService;

/**
 *
 * @author Janus
 */
public class SimpleJavaApp {

    public static void main(String[] args) {

        PersonService personService = new PersonService();
        Person person = new Person("Xavier", 30, "Calle 123, #22-1");

        personService.imprimirInformacion(person);
    }
}

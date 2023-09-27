/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simplejavaapp.entities.service;

import com.mycompany.simplejavaapp.entities.Person;

/**
 *
 * @author Janus
 */
public class PersonService {

    public void imprimirInformacion(Person person) {

        System.out.println("Nombre: " + person.getName());
        System.out.println("Edad: " + person.getAge());
        System.out.println("Dirección: " + person.getAddress());
    }

}

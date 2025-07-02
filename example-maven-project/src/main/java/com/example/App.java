package com.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import generated.Person;

public class App {
    public static void main(String[] args) throws JAXBException {
        // Create a Person object (adjust package if needed)
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);
        person.setEmail("alice@example.com");

        // Marshal to XML
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(person, System.out);
    }
}
package br.edu.catolica.service;

import br.edu.catolica.model.Contact;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeleteContactServiceTest {

    @Test
    public void deleteContactByNumber() {

        DeleteContactService deleteContactService = new DeleteContactService();

        Contact contact1 = new Contact("Teste1", "123456789");
        Contact contact2 = new Contact("Teste2", "987654321");

        List<Contact> listaAtual = new ArrayList<>();
        listaAtual.add(contact1);
        listaAtual.add(contact2);

        deleteContactService.deleteContactByNumber("123456789", listaAtual);


        assertEquals(listaAtual.size(), 1);

    }

    @Test
    public void deleteContactByName() {

        DeleteContactService deleteContactService = new DeleteContactService();

        Contact contact1 = new Contact("Teste1", "123456789");
        Contact contact2 = new Contact("Teste2", "987654321");

        List<Contact> listaAtual = new ArrayList<>();
        listaAtual.add(contact1);
        listaAtual.add(contact2);

        deleteContactService.deleteContactByName("Teste2", listaAtual);


        assertEquals(listaAtual.size(), 1);


    }
}
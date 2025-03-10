package br.edu.catolica.controller;

import br.edu.catolica.model.Contact;
import br.edu.catolica.service.ListContactService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListContactControllerTest {

    @Test
    public void handleShowContactByName() {

        Contact contact1 = new Contact("Teste1", "123456789");
        Contact contact2 = new Contact("Teste2", "987654321");

        List<Contact> listaAtual = new ArrayList<>();
        listaAtual.add(contact1);
        listaAtual.add(contact2);

        ListContactController contactController = new ListContactController(listaAtual);

        contactController.handleShowContact("123456789", "Teste");

    }

    @Test
    public void handleShowTotalOfContacts() {
        Contact contact1 = new Contact("Teste1", "123456789");
        Contact contact2 = new Contact("Teste2", "987654321");

        List<Contact> listaAtual = new ArrayList<>();
        listaAtual.add(contact1);
        listaAtual.add(contact2);

        ListContactController contactController = new ListContactController(listaAtual);

        String  total = contactController.handleShowTotalOfContacts();
        String esperado = "Total de contatos:"+ 2;
        assertEquals(esperado,total);
    }
}
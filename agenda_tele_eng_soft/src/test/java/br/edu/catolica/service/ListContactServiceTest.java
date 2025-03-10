package br.edu.catolica.service;

import br.edu.catolica.model.Contact;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListContactServiceTest {

    @Test
    public void showContactByName() {

        ListContactService contactService = new ListContactService();

        Contact contact1 = new Contact("Teste1", "123456789");
        Contact contact2 = new Contact("Teste2", "987654321");
        List<Contact> listaAtual = new ArrayList<>();
        listaAtual.add(contact1);
        listaAtual.add(contact2);

        Contact showedContact = contactService.showContactByName("Teste1", listaAtual);

        assertEquals(showedContact, contact1);


    }

    @Test
    public void showContactByNumber() {
        ListContactService contactService = new ListContactService();

        Contact contact1 = new Contact("Teste1", "123456789");
        Contact contact2 = new Contact("Teste2", "987654321");
        List<Contact> listaAtual = new ArrayList<>();
        listaAtual.add(contact1);
        listaAtual.add(contact2);

        Contact showedContact = contactService.showContactByNumber("987654321", listaAtual);

        assertEquals(showedContact, contact2);
    }

    @Test
    public void totalOfContacts() {
        ListContactService contactService = new ListContactService();

        Contact contact1 = new Contact("Teste1", "123456789");
        Contact contact2 = new Contact("Teste2", "987654321");
        List<Contact> listaAtual = new ArrayList<>();
        listaAtual.add(contact1);
        listaAtual.add(contact2);

        int qtd = contactService.totalOfContacts(listaAtual);

        assertEquals(qtd, 2);

    }
}
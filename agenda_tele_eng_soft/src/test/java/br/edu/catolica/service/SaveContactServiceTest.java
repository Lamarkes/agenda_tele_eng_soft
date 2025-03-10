package br.edu.catolica.service;

import br.edu.catolica.model.Contact;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SaveContactServiceTest {

    @Test
    public void saveContact() {
        SaveContactService saveContactService = new SaveContactService();

        List<Contact> contacts = new ArrayList<>();

        saveContactService.saveContact("Teste1", "123456789", contacts);

        assertEquals(1, contacts.size());

    }
}
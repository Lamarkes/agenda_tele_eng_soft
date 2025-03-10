package br.edu.catolica.controller;

import br.edu.catolica.model.Contact;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SaveContactControllerTest {

    @Test
    public void handleSaveContact() {
        String nome = "Teste1";
        String numero = "123456789";

        List<Contact> contatos = new ArrayList<>();

        SaveContactController saveContactController = new SaveContactController(contatos);

        saveContactController.handleSaveContact(nome, numero);

        assertEquals(1, contatos.size());
    }
}
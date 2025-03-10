package br.edu.catolica.controller;

import br.edu.catolica.model.Contact;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DeleteContactControllerTest {

    @Test
    public void handleDeleteContactByNome() {


        Contact contact1 = new Contact("Teste1", "123456789");
        Contact contact2 = new Contact("Teste2", "987654321");

        List<Contact> listaAtual = new ArrayList<>();
        DeleteContactController controller = new DeleteContactController(listaAtual);
        listaAtual.add(contact1);
        listaAtual.add(contact2);

        controller.handleDeleteContact("Teste1", "nome");

        assertEquals(1, listaAtual.size());
    }

    @Test
    public void handleDeleteContactByNumero() {

        Contact contact1 = new Contact("Teste1", "123456789");
        Contact contact2 = new Contact("Teste2", "987654321");

        List<Contact> listaAtual = new ArrayList<>();
        DeleteContactController controller = new DeleteContactController(listaAtual);
        listaAtual.add(contact1);
        listaAtual.add(contact2);

        controller.handleDeleteContact("987654321", "numero");

        assertEquals(1, listaAtual.size());
    }
}
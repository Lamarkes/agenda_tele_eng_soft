package br.edu.catolica.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void getName() {
        Contact contact = new Contact("Teste", "");

        String nomeEsperado = "Teste";

        assertEquals(contact.getName(), nomeEsperado);
    }

    @Test
    public void setName() {

        Contact contact = new Contact();
        contact.setName("Teste");

        String nomeEsperado = "Teste";

        assertEquals(contact.getName(), nomeEsperado);
    }

    @Test
    public void getNumber() {

        Contact contact = new Contact("", "123456789");
        String numeroEsperado = "123456789";

        assertEquals(contact.getNumber(), numeroEsperado);
    }

    @Test
    public void setNumber() {

        Contact contact = new Contact();
        contact.setNumber("123456789");

        String numeroEsperado = "123456789";

        assertEquals(contact.getNumber(), numeroEsperado);
    }

    @Test
    public void testToString() {

        Contact contact = new Contact("Teste", "123456789");

        String toStringEsperado = "Contato{" +
                "nome='" + contact.getName() + '\'' +
                ", numero='" + contact.getNumber() + '\'' +
                '}';

        assertEquals(contact.toString(), toStringEsperado);
    }
}
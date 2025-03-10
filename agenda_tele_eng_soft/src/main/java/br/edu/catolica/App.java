package br.edu.catolica;


import br.edu.catolica.controller.DeleteContactController;
import br.edu.catolica.controller.ListContactController;
import br.edu.catolica.controller.SaveContactController;
import br.edu.catolica.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Contact> listOfContacts = new ArrayList<>();

        SaveContactController saveContactController = new SaveContactController(listOfContacts);
        ListContactController listContactController = new ListContactController(listOfContacts);
        DeleteContactController deleteContactController = new DeleteContactController(listOfContacts);

        saveContactController.handleSaveContact("Erlon", "999909409");
        saveContactController.handleSaveContact("Lucas", "999909410");
        saveContactController.handleSaveContact("Davina", "999909411");
        saveContactController.handleSaveContact("Valesca", "999909412");
        saveContactController.handleSaveContact("Mony", "999909413");
        saveContactController.handleSaveContact("Yuri", "999909414");

        listContactController.handleShowAllContacts();

        listContactController.handleShowTotalOfContacts();

        listContactController.handleShowContact("Erlon", "nome");
        listContactController.handleShowContact("999909410", "numero");

        deleteContactController.handleDeleteContact("Mony", "nome");

        listContactController.handleShowTotalOfContacts();

        deleteContactController.handleDeleteContact("999909412", "numero");
        listContactController.handleShowTotalOfContacts();

        listContactController.handleShowAllContacts();
    }
}


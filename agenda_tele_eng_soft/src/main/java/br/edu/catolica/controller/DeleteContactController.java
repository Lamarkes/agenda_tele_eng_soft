package br.edu.catolica.controller;


import br.edu.catolica.model.Contact;
import br.edu.catolica.service.DeleteContactService;

import java.util.List;

public class DeleteContactController {
    private List<Contact> listOfContacts;
    private DeleteContactService deleteContactService = new DeleteContactService();

    public DeleteContactController(List<Contact> listOfContacts) {
        this.listOfContacts = listOfContacts;
    }

    public void handleDeleteContact(String contact, String token){
        switch (token.toLowerCase()){
            case "nome":
                deleteContactService.deleteContactByName(contact, listOfContacts);
                break;
            case "numero":
                deleteContactService.deleteContactByNumber(contact, listOfContacts);
                break;
            default:
                break;
        }
    }
}

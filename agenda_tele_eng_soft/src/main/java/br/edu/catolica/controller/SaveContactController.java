package br.edu.catolica.controller;


import br.edu.catolica.model.Contact;
import br.edu.catolica.service.SaveContactService;

import java.util.List;

public class SaveContactController {
    private List<Contact> listOfContacts;
    private SaveContactService saveContactService = new SaveContactService();

    public SaveContactController(List<Contact> listOfContacts) {
        this.listOfContacts = listOfContacts;
    }

    private boolean isValidContact(String value, int minLen){
        return value.length() >= minLen;
    }

    public void handleSaveContact(String name, String number){
        if (isValidContact(name, 1) && isValidContact(number, 9)){
            this.saveContactService.saveContact(name, number, listOfContacts);
        }else{
            System.out.println("Dados invalidos:\n" +
                    "O nome precisa ter 1 ou mais caracteres e" +
                    "o numero precisa ter 9 ou mais caracteres");
        }
    }
}

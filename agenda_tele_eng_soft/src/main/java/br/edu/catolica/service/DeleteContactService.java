package br.edu.catolica.service;


import br.edu.catolica.model.Contact;

import java.util.List;

public class DeleteContactService {
    public void deleteContactByNumber(String number, List<Contact> listOfContacts){
        try {
            listOfContacts.removeIf(contact -> contact.getNumber().equals(number));
        }catch (Exception e){
            System.err.print(e);
        }
    }

    public void deleteContactByName(String name, List<Contact> listOfContacts){
        try {
            listOfContacts.removeIf(contato -> contato.getName().equals(name));
        }catch (Exception e){
            System.err.print(e);
        }
    }
}

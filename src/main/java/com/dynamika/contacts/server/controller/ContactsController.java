package com.dynamika.contacts.server.controller;

import com.dynamika.contacts.server.entity.Contact;
import com.dynamika.contacts.server.repository.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

    @Autowired
    private ContactsRepository contactsRepository;

    @RequestMapping
    public @ResponseBody List<Contact> getContacts()
    {
        List<Contact> contacts = contactsRepository.findAll();
        return contacts;
    }
}

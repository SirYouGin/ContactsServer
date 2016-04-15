package com.dynamika.contacts.server.service;


import com.dynamika.contacts.server.entity.Contact;
import com.dynamika.contacts.server.repository.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactsServiceImpl implements ContactsService {

    @Autowired
    private ContactsRepository contactsRepository;

    public List<Contact> getAll() {
        return contactsRepository.findAll();
    }

    public Contact getByID(long id) {
        return contactsRepository.getOne(id);
    }

    public void remove(long id) {
        contactsRepository.delete(id);
    }

    public Contact save(Contact contact) {
        return contactsRepository.saveAndFlush(contact);
    }
}


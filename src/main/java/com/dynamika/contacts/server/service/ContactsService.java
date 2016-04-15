package com.dynamika.contacts.server.service;

import com.dynamika.contacts.server.entity.Contact;

import java.util.List;


public interface ContactsService {

    List<Contact> getAll();
    Contact getByID(long id);
    void remove(long id);
    Contact save(Contact contact);
}

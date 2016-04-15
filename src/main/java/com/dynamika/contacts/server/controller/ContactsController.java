package com.dynamika.contacts.server.controller;

import com.dynamika.contacts.server.entity.Contact;
import com.dynamika.contacts.server.repository.ContactsRepository;
import com.dynamika.contacts.server.service.ContactsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ContactsController {

    @Autowired
    private ContactsService service;

    @RequestMapping(value="/contacts")
    @ResponseBody
    public List<Contact> getAllContacts()
    {
        return service.getAll();

    }

    @RequestMapping(value="/contacts/{id}")
    @ResponseBody
    public Contact getContact(@PathVariable("id") long id)
    {
        return service.getByID(id);

    }

    @RequestMapping(value = "/contacts", method = RequestMethod.POST)
    @ResponseBody
    public Contact save(@RequestBody Contact contact)
    {
        return service.save(contact);

    }

    @RequestMapping(value="/contacts/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteContact(@PathVariable("id") long id)
    {
        service.remove(id);

    }

    @RequestMapping(value="/contacts/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Contact updateContact(@RequestBody Contact contact)
    {
        return service.save(contact);

    }
}

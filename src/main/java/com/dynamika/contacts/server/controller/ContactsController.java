package com.dynamika.contacts.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/contacts")
public class ContactsController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody String getContacts(ModelMap model)
    {
        return "ContactsList";
    }
}

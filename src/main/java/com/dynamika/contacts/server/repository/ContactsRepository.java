package com.dynamika.contacts.server.repository;

import com.dynamika.contacts.server.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactsRepository extends JpaRepository<Contact, Long> {
}

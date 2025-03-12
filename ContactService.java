package com.example.fashion.service;

import com.example.fashion.entity.Contact;
import jakarta.persistence.Id;

import java.util.List;

public interface ContactService {
Contact saveContact (Contact contact);
List<Contact> getAllContacts();
Contact getByID(Long ID);
void deleteContact(Long Id);

}

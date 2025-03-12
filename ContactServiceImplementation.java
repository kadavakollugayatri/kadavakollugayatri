package com.example.fashion.service;

import com.example.fashion.entity.Contact;
import com.example.fashion.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImplementation implements ContactService {
    @Autowired
    private final ContactRepository contactRepository;

    public ContactServiceImplementation(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact getByID(Long ID) {
        Optional<Contact> contact=contactRepository.findById(ID);
        return contact.orElse(null);
    }

    @Override
    public void deleteContact(Long Id) {
        contactRepository.deleteById(Id);

    }
}

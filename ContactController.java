package com.example.fashion.controller;

import com.example.fashion.entity.Contact;
import com.example.fashion.service.ContactService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/contact")

public class ContactController {
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {

    this.contactService = contactService;
    }
@PostMapping("/submit")
    public Contact submitContact(@RequestBody Contact contact)
{
    return contactService.saveContact(contact);
}
@GetMapping("/all")
    public List<Contact> getAllContacts(){

    return contactService.getAllContacts();
}
@GetMapping("/{id}")
    public Contact getByContactId(@PathVariable("id") Long id){

    return contactService.getByID(id);
}
@DeleteMapping("/{id}")
    public String deleteByContactId(@PathVariable("id") Long id){
    contactService.deleteContact(id);
    return "Contact Deleted Successfully";
}
}

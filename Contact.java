package com.example.fashion.entity;


import jakarta.persistence.*;

@Entity
@Table(name="Contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String email;
    private String message;

    public Contact(){
    }
//    */ constructor without ID */
//    public Contact(String name,String email,String message){
//        this.name=name;
//        this.email=email;
//        this.message=message;
//    }
//    */ constructor with ID */
    public Contact(Long id, String name,String email,String message){
        this.Id=id;
        this.name=name;
        this.email=email;
        this.message=message;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

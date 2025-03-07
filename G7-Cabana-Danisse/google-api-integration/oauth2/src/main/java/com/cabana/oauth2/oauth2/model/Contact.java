package com.cabana.oauth2.oauth2.model;

public class Contact {
    private String id;
    private String name;
    private String email;
    private String phone;

    // Constructor
    public Contact() {}

    public Contact(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getter and Setter for ID
    public String getId() {
        return id;
    }

    public void setId(String id) {  // <-- This method is missing in your code
        this.id = id;
    }

    // Getters and setters for other fields
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
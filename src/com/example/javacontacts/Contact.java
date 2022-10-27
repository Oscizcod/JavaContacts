package com.example.javacontacts;

public class Contact {
    private String fname;
    private String lname;
    private int phone;
    private String email;
    private String address;

    public Contact(String fname, String lname, int phone, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

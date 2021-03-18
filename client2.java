package com.company;

public class client2 {
    //atributos
    String username;
    int userpassword;

    // Constructor
    public void client1(String username, int userpassword) {
        this.username= username;
        this.userpassword = userpassword;
    }

    // Getters y setters
    public String getUsername() {
        return username;
    }
    public void setUsu(String username) {
        this.username = username;
    }
    public int getUserpassword() {
        return userpassword;
    }
    public void setUserpassword(int userpassword) {
        this.userpassword = userpassword;

    }
    // Métodos especiales
    public String registro() {
        return this.username + this.userpassword;
    }
}

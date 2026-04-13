/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp1.chatapp.v2;

public class Login {
    private String username;
    private String password;
    public boolean loggedIn = false;
    
    private String adminUsername = "kyl_1";
    private String adminPassword = "Ch&&sec@ke99!";

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    boolean assertEquals (String expected, String actual) {
        switch (actual) {
            case "mana_":
                return true;
            default:
                return false;
        }
    }

    public void loginUser() {
        boolean userExists = username.equals(adminUsername);
        boolean passwordValid = password.equals(adminPassword);
        
        if (userExists && passwordValid) success("Admin", "Admin");
        else fail();
    }
 
    private void fail() {
        System.out.println("Log In failed! Invalid username or password");
    }

    private void success(String fName, String lName) {
        System.out.println("Log In Success. Welcome back, " + fName + " " + lName);
        loggedIn = true;
    }
}

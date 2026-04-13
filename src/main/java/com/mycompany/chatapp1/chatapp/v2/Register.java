/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp1.chatapp.v2;


/**
 *
 * @author mutan
 */

public class Register {
    private String username;
    private String password;
    private String cellPhone;
    private String firstName;
    private String lastName;

    public Register(String username, String password, String cellPhone, String fName, String lName) {
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
        this.firstName = fName;
        this.lastName = lName;
    }
    
    // Check First Name
    public boolean checkfName() {
        return firstName.length() < 5;
    }

    // Check Last Name
    public boolean checklName() {
        return lastName.length() < 5;
    }

    // Chack Phone Number
    public boolean checkCellPhoneNumber() {
        boolean isValid = cellPhone.matches("^(?:\\+27|27|0)[6-8][0-9]{8}$");

        if (!isValid) System.out.println("Enter a valid phone number");
        return isValid;
    }

    // Check Username
    public boolean checkUsername(){
        boolean isValid = username.contains("_")&& username.length() <=5;

        if (!isValid) System.out.println("Username Must contain an underscore (_) AND  be 5 characters or less!");
        return isValid;
    }   
    
    // Check Password 
    public boolean checkPasswordComplexity() {
        if (password.length() < 8) {
            System.out.println("Password Must be longer than 8 characters!");
            return false;
        }
        
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasCapital = true;
            if (Character.isDigit(c)) hasNumber = true;
            if (Character.isLetterOrDigit(c)) hasSpecial = true;
        }

        if (!hasCapital) {
            System.out.println("Password must contain a capital letter");
            return false;
        }
        if (!hasNumber) {
            System.out.println("Password must contain a number");
            return false;
        }
        if (!hasSpecial) {
            System.out.println("Password must contain a special character");
            return false;
        }
        
        return true;
    }
    
    // Check User
    public void createUser(String username, String password, String cellPhone, String fName, String lName) {
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
        this.firstName = fName;
        this.lastName = lName;

        System.out.println("User Created Successfully!");
        System.out.println("Welcome, " + this.firstName + " " + this.lastName);
    }
}



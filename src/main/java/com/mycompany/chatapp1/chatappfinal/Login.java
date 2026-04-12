/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp1.chatappfinal;

/**
 *
 * @author mutan
 */
public class Login {
    private final String userName;
    private final String password;
    private final String cellPhone;
    private final String firstName;
    private final String lastName;

    public Login(String firstName, String lastName, String userName, String password, String cellPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.cellPhone = cellPhone;
    }
    
    // Check Username
    public boolean checkUserName(){
        return userName.contains("_")&& userName.length() <=5;
    }    
    
    // Check Password 
    public boolean checkPasswordComplexity() {
        if (password.length() < 8) return false;
        
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasCapital = true;
            if (Character.isDigit(c)) hasNumber = true;
            if (Character.isLetterOrDigit(c)) hasSpecial = true;
        }
        
        return hasCapital && hasNumber && hasSpecial;
    }
    
    // Chack Phone Number
    public boolean checkCellPhoneNumber() {
        return cellPhone.matches("^(?: \\+27|27|0)[6-8][0-9]8");
    }
    
    // Check Uuser
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted!" +
                    "Please ensure that your username contains an underscore (_) and is no more than five characters long.";
        }
        if (!checkPasswordComplexity()) {
            return "Password must have:"+
                    "8 characters or more" + 
                    "A capital letter" + 
                    "A number" +
                    "A special character.";
        } 
        if(!checkCellPhoneNumber()){
            return"Cell number must:" +
                    "Contain an international code." +
                    "Be at least 10 digits long.";
        }
        
        return ( """
                 Username successfully added.
                 Password successfully captured.
                 Cell phone number successfully added.""");
        
    }
    
    // Login user
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return this.userName.equals(enteredUsername)&& this.password.equals (enteredPassword);
    }
    
    // Login Status
    public String getLoginStatus(String enteredUsername, String enteredPassword) {
        if(loginUser(enteredUsername, enteredPassword)) {
            return "Welcome " + firstName + " " + lastName +
                    " it is great to see you again.";
        } else{
            return "Username or password incorrect, please try again.";
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp1.chatapp.v2;
import java.util.Scanner;

/**
 *
 * @author mutan
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to ChatApp! Type \"L\" to login or \"R\" to register.");
        String input = scanner.nextLine().toLowerCase();
        
        switch (input.toLowerCase()) {
            case "l":
                TestLogin();
                break;
            case "r":
                TestRegister();
                break;
            default:
                System.out.println("Invalid input! you entered: " + input);
                break;
        }
    }
    
    public static void TestLogin() {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        
        System.out.println("Enter username");
        username = scanner.nextLine();
        
        System.out.println("Enter password");
        password = scanner.nextLine();
        
        Login loginSession = new Login(username, password);
        loginSession.loginUser();
        
        while (!loginSession.loggedIn) {
            System.out.println(username + " " + password);

            System.out.println("Enter username");
            username = scanner.nextLine();

            System.out.println("Enter password");
            password = scanner.nextLine();

            loginSession = new Login(username, password);
            loginSession.loginUser();
        }
    }
    
    public static void TestRegister() {
        Scanner scanner = new Scanner(System.in);
        String fName, lName, username, password, phoneNumber;
        
        System.out.println("Enter first name");
        fName = scanner.nextLine();
        
        System.out.println("Enter last name");
        lName = scanner.nextLine();
        
        System.out.println("Enter last Cell Number");
        phoneNumber = scanner.nextLine();

        System.out.println("Enter Username");
        username = scanner.nextLine();

        System.out.println("Enter Password");
        password = scanner.nextLine();

        Register registerSession = new Register(username, password, phoneNumber, fName, lName);
        
        while (!registerSession.checkCellPhoneNumber()) {
            phoneNumber = scanner.nextLine();
            registerSession = new Register(username, password, phoneNumber, fName, lName);
        }
        
        while (!registerSession.checkUsername()) {
            username = scanner.nextLine();
            registerSession = new Register(username, password, phoneNumber, fName, lName);
        }
        
        while (!registerSession.checkPasswordComplexity()) {
            password = scanner.nextLine();
            registerSession = new Register(username, password, phoneNumber, fName, lName);
        }
        
        registerSession.createUser(username, password, phoneNumber, fName, lName);
    }
}

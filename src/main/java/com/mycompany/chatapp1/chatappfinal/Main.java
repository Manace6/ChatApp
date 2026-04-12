package com.mycompany.chatapp1.chatappfinal;
import java.util.Scanner;

/**
 *
 * @author mutan
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName, lName, username, password, phoneNumber;
        
        System.out.println("Enter firt name");
        fName = scanner.nextLine();
        
        System.out.println("Enter last name");
        lName = scanner.nextLine();
        
        System.out.println("Enter phone number");
        phoneNumber = scanner.nextLine();
        
        System.out.println("Enter username");
        username = scanner.nextLine();
        
        System.out.println("Enter password");
        password = scanner.nextLine();
        
        Login user;
        user = new Login(fName, lName, username, password, phoneNumber);
        
        System.out.println(user.registerUser());
    }
    
    public  void Test() {
        
    }
}

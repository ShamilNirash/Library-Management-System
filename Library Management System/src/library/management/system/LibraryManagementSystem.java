/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library.management.system;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LibraryManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Welcome to Library Management System");
        System.out.println("1. Login");
        System.out.println("2. SignUp");
        int number=scanner.nextInt();
        System.out.println(number);
        System.out.println("SS");
    }
    
}

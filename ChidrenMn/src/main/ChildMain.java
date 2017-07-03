/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.ChildDAO;
import java.util.Scanner;

/**
 *
 * @author Quay
 */
public class ChildMain {
    public static void main(String[] args) {
        ChildDAO dao = new ChildDAO();
        for(int i = 0; i<2;i++){
            System.out.println("Child "+(i+1)+"!");
            dao.create();
        } 
        System.out.println("Update child's age");
        System.out.println("Enter new age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        dao.update(age);
        dao.readByMaxAge();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        dao.readByName(name);
        
    }
}

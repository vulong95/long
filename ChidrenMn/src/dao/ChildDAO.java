/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bus.ChildInterface;
import dto.Child;
import java.util.Scanner;

/**
 *
 * @author Quay
 */
public class ChildDAO implements ChildInterface {

    Child[] c = new Child[20];
    int n;

    public ChildDAO() {
        for (int i = 0; i < 20; i++) {
            c[i] = new Child();
        }
        n = 0;
    }

    @Override
    public boolean create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Code: ");
        int code = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Room: ");
        String room = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.println("Successful Add Child!");
        if (find(code) == -1) {
            c[n] = new Child(code, name, room, age);
            n++;
            return true;
        } else {
            return false;
        }
    }

    public int find(int code) {
        for (int i = 0; i < n; i++) {
            if (c[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(int age) {
        System.out.println("Enter Code: ");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();

        if (find(code) == -1) {
            System.out.println("Can not find this child.");
        } else {
            c[find(code)].age = age;
            System.out.println("Update age success.");
        }
    }

    @Override
    public void readByMaxAge() {
        int max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (c[i].age > max) {
                max = c[i].age;
                index = i;
            }
        }
        System.out.println("Information of child who have the maximum age:");
        c[index].display();
    }

    @Override
    public void readByName(String Name) {
        int i = 0;
        for (Child child : c) {
            if (child.getName().endsWith(Name)) {
                child.display();
            }
            i++;
        }
        if (i == 0) {
            System.out.println("Khong tim thay.");
        }
    }
//    @Override
//    public void readByName(String name) {
//        for (int i = 0; i < n; i++) {
//            if (c[i].getName().indexOf(name, 0) != -1) {
//                c[i].display();
//            }
//        }
//    }
}

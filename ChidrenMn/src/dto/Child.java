/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Quay
 */
public class Child {

    private int code;
    private String name;
    public String room;
    public int age;

    public Child() {
    }

    public Child(int code, String name, String room, int age) {
        this.code = code;
        this.name = name;
        this.room = room;
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Code=" + this.code + "," + "Name=" + this.name + "," + "Room=" + this.room + "," + "Age=" + this.age);
    }
}

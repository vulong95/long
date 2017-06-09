/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.RoomDAO;
import entity.Room;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class RoomTest {

    public static void main(String[] args) {
        RoomDAO roomD = new RoomDAO();
        System.out.println(" -- CO CAU QUAN LY KHACH SAN -- ");
        System.out.println("Nhap Thong Tin Phong! ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            Room r = new Room();
            System.out.println("Thong tin phong thu " + (i + 1) + "!");
            System.out.println("Room code: ");
            sc = new Scanner(System.in);
            r.setCode(sc.nextLine());
            System.out.println("Price: ");
            r.setPrice(sc.nextInt());
            r.setStatus(true);
            if (roomD.create(r) == true) {
                System.out.println("Dang ki phong thanh cong! ");
            } else {
                System.out.println(" -- Het Phong --");
                break;
            }
        }
        System.out.println("Nhap Code Phong Muon Tra!");
        sc = new Scanner(System.in);
        String code = sc.nextLine();

        if (roomD.readBycode(code) == -1) {
            System.out.println("Phong Chua Dang Ki!");

        } else {
            System.out.println("Tra Phong Thanh Cong!");
        }
        System.out.println("So Phong Con Trong: "+roomD.count());
        System.out.println("Tong Tien Cac Phong: "+roomD.total());
    }
}

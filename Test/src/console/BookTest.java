/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import entity.Book;
import dao.BookDAO;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BookTest {

    public static void main(String[] args) {
        BookDAO bookD = new BookDAO();
        System.out.println("HE THONG QUAN LY THU VIEN");
        System.out.println("Nhap Thong Tin Sach");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            Book b = new Book();
            System.out.println("Thong Tin Sach Thu " + (i + 1) + ":");
            System.out.println("Ten Sach: ");
            sc = new Scanner(System.in);
            b.setName(sc.nextLine());
            int code = -1;

            do {
                try {
                    sc = new Scanner(System.in);
                    System.out.println("Code: ");
                    code = sc.nextInt();

                } catch (Exception ex) {
                    System.out.println("Vui Long Nhap Dung Code!");
                }
            } while (code == -1);
            b.setCode(code);
            int quantity = -1;
            do {
                try {
                    sc = new Scanner(System.in);
                    System.out.println("Quantity: ");
                    quantity = sc.nextInt();

                } catch (Exception ex) {
                    System.out.println("Vui Long Nhap Dung Quantity!");
                }
            } while (quantity == -1);
            b.setQuantity(quantity);
            int price = -1;
            do {
                try {
                    sc = new Scanner(System.in);
                    System.out.println("Price: ");
                    price = sc.nextInt();

                } catch (Exception ex) {
                    System.out.println("Vui Long Nhap Dung Price!");
                }
            } while (price == -1);
            b.setPrice(price);
            if(bookD.add(b)==true){
                System.out.println("Dang Ki Sach Thanh Cong!");
                
            }else {
                System.out.println("Sach Da Duoc Dang Ki!");
                break;
            }
            
        }
        System.out.println("Nhap Ten Sach: ");
            sc =new Scanner(System.in);
            String Name = sc.nextLine();
            System.out.println("Total: "+bookD.getCost(Name));
    }
}

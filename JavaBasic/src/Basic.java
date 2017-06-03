
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Basic {
    
    public static void main(String[] args) {
        int a, b;
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        
        
        b = sc.nextInt();
        System.out.println("Tong: " +(a+b));
    }
}


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
public class Q06 {

    public static void main(String[] args) {
        int a, b, c, max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Nhap c: ");
        c = sc.nextInt();

        if (max < a) {
            max = a;
        }
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("So lon nhat la: " + max);
    }
}

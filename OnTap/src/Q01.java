
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
public class Q01 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        if (a > b && b > c) {
            System.out.println("Max: " + a + "Min: " + b);
        }
        if (a > b && c > b) {
            System.out.println("Max: " + a + "Min: " + c);

        }

        if (b > a && a > c) {
            System.out.println("Max: " + b + "Min: " + c);
        }
        if (b > a && c > a) {
            System.out.println("Max: " + b + "Min: " + a);
        }
        if (c > a && a > b) {
            System.out.println("Max: " + c + "Min: " + b);
        }
        if (c > b && b > a) {
            System.out.println("Max: " + c + "Min: " + a);
        }
    }
}

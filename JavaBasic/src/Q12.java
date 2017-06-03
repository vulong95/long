
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Quay
 */
public class Q12 {

    public static void main(String[] args) {
        float a, b;
        char p;
        System.out.println("Nhap a: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        System.out.println("Nhap b: ");
        b = sc.nextFloat();
        System.out.println("Nhap (+,-,*,/): ");
        sc = new Scanner(System.in);
        String s = sc.nextLine();
        p = s.charAt(0);
        System.out.println(" " + p);
        switch (p) {
            case '+':
                System.out.println("a+b = " + (a + b));
                break;
            case '-':
                System.out.println("a-b = " + (a - b));
                break;
            case '*':
                System.out.println("a* = " + (a * b));
                break;
            case '/':
                System.out.println("a/b = " + (a / b));
                break;
            default:
                System.out.println("Nhap sai 'p'!");
                break;

        }
    }
}

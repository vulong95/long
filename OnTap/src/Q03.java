
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
public class Q03 {

    public static void main(String[] args) {
        float a;
        int tam = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextFloat();
        float gia1 = a * 550;
        if (a <= 100) {
            System.out.println("Total: " + gia1);
        }
        float gia2 = (100 * 550) + ((a - 100) * 900);
        if (a > 100 && a < 150) {
            System.out.println("Total: " + gia2);
        }
        float gia3 = (100 * 550) + (50 * 900) + ((a - 150) * 1210);
        if (a > 150 && a < 200) {
            System.out.println("Total: " + gia3);
        }
        float gia4 = (100 * 550) + (50 * 900) + (1210 * 50) + ((a - 200) * 1340);
        if (a > 200 && a < 300) {
            System.out.println("Total: " + gia4);
        }
        float gia5 = (100 * 550) + (50 * 900) + (1210 * 50) + (100 * 1340) + ((a - 300) * 1400);
        if (a > 300) {
            System.out.println("Total: " + gia5);
        }
    }
}

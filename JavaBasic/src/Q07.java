
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
public class Q07 {

    public static void main(String[] args) {
        int a = 1;
        Scanner sc = new Scanner(System.in);
        boolean kq = false;
        do {
            if ((a < 0 || a > 100)) {
                System.out.println("Nhap sai nhap tu 1 den 100");
            }
            System.out.println("Nhap diem trung binh: ");
            a = sc.nextInt();

        } while (a < 0 || a > 100);
        if (a > 90) {
            System.out.println("Gioi");
        }
        if (a >= 65 || a < 80) {
            System.out.println("Kha");
        }
        if (a >= 35 || a < 65) {
            System.out.println("TB");
        }
        if (a < 35) {
            System.out.println("Kem");
        }
    }
}

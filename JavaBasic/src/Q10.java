
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
public class Q10 {

    public static void main(String[] args) {
        int hour = 0;
        Scanner sc = new Scanner(System.in);

        boolean kq = false;
        do {
            if ((hour < 0 || hour > 24)) {
                System.out.println("Nhap Sai Gio!");
            }
            System.out.println("Nhap gio tu 0 den 24: ");
            hour = sc.nextInt();

        } while (hour < 0 || hour > 24);
        if (hour < 12) {

            System.out.println("Bay gio la: " + hour + "AM");
        }
        if (hour >= 12) {
            System.out.println("Bay gio la: " + (hour-12) + "PM");
        }

    }
}

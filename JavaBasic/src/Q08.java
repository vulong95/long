
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
public class Q08 {

    public static void main(String[] args) {
        int a;
        System.out.println("Nhap mot so bat ki: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println("So vua nhap chia het cho 2 va 3!");
        } else {
            System.out.println("So vua nhap khong chia het cho 2 vs 3!");
        }
    }
}

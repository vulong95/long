
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
public class Q09 {

    public static void main(String[] args) {
        int a;
        System.out.println("Nhap mot so bat ki: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 0) {
            System.out.println("So nhap vao la so am!");
        }
        if (a == 0) {
            System.out.println("So nhap vao la so 0!");
        }
        if (a > 0) {
            System.out.println("So nhap vao la so duong!");
        }
    }
}

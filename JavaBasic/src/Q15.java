
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
public class Q15 {

    public static void main(String[] args) {
        int a;
        System.out.println("Nhap mot so bat ki: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        int tam = a;
        for (int i = 1; i < a; i++) {
            tam = tam * i;
            System.out.println("Giai thua cua so do la: " + tam);
        }

    }
}

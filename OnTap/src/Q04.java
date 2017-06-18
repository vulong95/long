
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
public class Q04 {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        int tam = 0;
        
        for (int i = 2; i <= n; i++) {
            if (i % 2 != 0) {
                
                tam = tam+i;
                
                
            }
        }
        System.out.println("Sum: " + tam);
    }
}

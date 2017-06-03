
import java.util.Scanner;
import javax.sound.midi.SysexMessage;

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
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b:");
        b = sc.nextInt();
        //thuat toan hoan doi
        int tam;//a=10 b=5
        tam=a;//tam = 10,a=5,b=10
        a=b;
        b=tam;
        System.out.println("Doi gia tri cua a: "+a);
        System.out.println("Doi gia tri cua b: "+b);
    }
}

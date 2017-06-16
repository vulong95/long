/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import dao.TicketDAO;
import dto.TicketDTO;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TicketTest {

    public static void main(String[] args) {
        TicketDTO tk = new TicketDTO();
        TicketDTO test = new TicketDTO();
        TicketDAO dao = new TicketDAO();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Add"
                    + "\n2. Display total"
                    + "\n3. Read by name"
                    + "\n4. Display all"
                    + "\n5. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter code");
                    int code;
                    code = sc.nextInt();
                    System.out.println("Enter name");
                    String name = sc.next();
                    System.out.println("Enter quantity");
                    int quantity;
                    quantity = sc.nextInt();

                    System.out.println("Enter price");
                    float price;
                    price = sc.nextFloat();

                    tk.setCode(code);
                    tk.setName(name);
                    tk.setPrice(price);
                    tk.setQuantity(quantity);
                    System.out.println(dao.create(tk));
                    break;
                case 2:
                    System.out.println("Total cost");
                    dao.displayTotal();
                    break;
                case 3:
                    System.out.println("Enter name");
                    name = sc.next();
                    dao.readByName(name);
                    break;
                case 4:
                    System.out.println("Sorted list");
                    dao.readByAll();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}

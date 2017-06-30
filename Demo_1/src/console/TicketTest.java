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
        
        
        TicketDAO dao = new TicketDAO();
        Scanner sc = new Scanner(System.in);

//        do {
//            System.out.println("1. Add"
//                    + "\n2. Display total"
//                    + "\n3. Read by name"
//                    + "\n4. Display all"
//                    + "\n5. Exit");
//            int choice = -1;
//            do {
//                try {
//                    sc = new Scanner(System.in);
//                    System.out.println("Enter choice: ");
//                    choice = sc.nextInt();
//                } catch (Exception ex) {
//                    System.out.println("Enter Choice Error!");
//                }
//            } while (choice == -1);
//
//            switch (choice) {
//                case 1:
                    String name;
                    for (int i = 0; i < 4; i++) {
                        
                        TicketDTO d = new TicketDTO();
                        System.out.println("Ticket " + (i + 1) + "!");
                        System.out.println("Enter name: ");
                        sc = new Scanner(System.in);
                        name = sc.nextLine();
                        d.setName(name);
                        
                        int code = -1;
                        do {
                            try {
                                sc = new Scanner(System.in);
                                System.out.println("Enter code: ");
                                code = sc.nextInt();
                            } catch (Exception ex) {
                                System.out.println("Enter Code Error!");
                            }
                        } while (code == -1);
                        d.setCode(code);

                        int quantity = -1;
                        do {
                            try {
                                sc = new Scanner(System.in);
                                System.out.println("Enter quantity: ");
                                quantity = sc.nextInt();
                            } catch (Exception ex) {
                                System.out.println("Enter Quantity Error!");
                            }
                        } while (quantity == -1);
                        d.setQuantity(quantity);

                        float price = -1;
                        do {
                            try {
                                sc = new Scanner(System.in);
                                System.out.println("Enter price: ");
                                price = sc.nextFloat();
                            } catch (Exception ex) {
                                System.out.println("Enter Price Error!");
                            }
                        } while (price == -1);
                        d.setPrice(price);
                        dao.create(d);
                    }
                        System.out.println("Successful Registration");
                        
                
//                    break;
//                case 2:
                    System.out.println("Total cost: ");
                    dao.displayTotal();
//                    break;
//                case 3:
                    System.out.println("Enter name: ");
                    sc = new Scanner(System.in);
                    name = sc.nextLine();
                    dao.readByName(name);
                    
//                    break;
//                case 4:
                    System.out.println("Sorted list: ");
//                    for(TicketDTO d:(dao.display())){
//                        System.out.println(d.toString());
//                    }
                    dao.readByAll();
//                    break;
//                case 5:
                    System.exit(0);
            }
//        } while (true);
//    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.TicketDTO;

/**
 *
 * @author Administrator
 */
public class TicketDAO {

    int max = 20;
    private TicketDTO ticket[] = new TicketDTO[max];
    private int len = 0;

    public TicketDAO() {

        for (int i = 0; i < max; i++) {
            ticket[i] = new TicketDTO();
        }
    }

    public TicketDTO create(TicketDTO d) {
        if ((len < 20) && (getPosition(d.getCode()) == -1)) {
            ticket[len] = d;

            return ticket[len++];
        }
        return null;
    }

    private int getPosition(int code) {
        for (int i = 0; i < len; i++) {
            if (ticket[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

//    public TicketDTO[] display(){
//        TicketDTO ticketD[]=new TicketDTO[len];
//        for (int i =0; i<len;i++){
//            ticketD[i]=ticket[i];
//        }
//        return ticketD;
//    }
//    public boolean create(TicketDTO d){
//        if(len>=20){
//            return false;
//        }else{
//            for(int i= 0;i<len;i++){
//                if(d.getName().equals(ticket[i].getName())){
//                    return false;
//                }
//            }
//            ticket[len]=d;
//            len++;
//            return true;
//        }
//    }
    private float getCost(TicketDTO f) {
        float cost = f.getPrice() * f.getQuantity();
        return cost;
    }

    public void displayTotal() {
        float total = 0;
        for (int i = 0; i < len; i++) {
            total += getCost(ticket[i]);
        }
        System.out.println(total);
    }

    public void readByName(String name) {
        TicketDTO[] find = new TicketDTO[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (ticket[i].getName().equals(name)) {
                find[count] = ticket[i];
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Unregistration Name");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(ticket[i].toString());
            }
        }

    }
//    public void readByName(String name) {
//        for (int i = 0; i < len; i++) {
//            if (ticket[i].getName().indexOf(name, 0) != -1) {
//                System.out.println(ticket[i].toString());
//            }
//        }
//    }

    public void readByAll() {
        TicketDTO[] sort = new TicketDTO[len];
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (getCost(ticket[i]) > getCost(ticket[j])) {
                    sort[i] = ticket[i];
                    ticket[i] = ticket[j];
                    ticket[j] = sort[i];
                }

            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(ticket[i].toString());
        }
        
    }

}

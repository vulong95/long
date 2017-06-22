/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import dto.TicketDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class TicketDAO {

    int max = 20;
    private List<TicketDTO> ticket;

    public TicketDAO() {
        ticket = new ArrayList<>(max);
    }

    public List<TicketDTO> readAll() {
        return ticket;
    }

    public TicketDTO create(TicketDTO d) {
        if ((ticket.size() < max) && (getPosition(d.getCode()) == -1)) {
            ticket.add(d);

            return d;
        }
        return null;
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
    private int getPosition(int code) {
        int index = 0;
        for (TicketDTO ti : ticket) {
            if (ti.getCode() == code) {
                return index;
            }
            index++;
        }
        return -1;
    }

    private float getCost(TicketDTO f) {
        float cost = f.getPrice() * f.getQuantity();
        return cost;
    }

    public void displayTotal() {
        float total = 0;
        for (TicketDTO ti : ticket) {
            total += getCost(ti);
        }
        System.out.println(total);
    }

    public void readByName(String name) {
        List<TicketDTO> find = new ArrayList<>(ticket.size());
        for (TicketDTO ti : ticket) {
            if (name.equals(ti.getName())) {
                find.add(ti);

            }

        }

        if (find.size() == 0) {
            System.out.println("tim ko ra");

        } else {
            for (TicketDTO ti : find) {
                System.out.println(ti.toString());
            }
        }
//    public void readByName(String name) {
//        for (int i = 0; i < len; i++) {
//            if (ticket[i].getName().indexOf(name, 0) != -1) {
//                System.out.println(ticket[i].toString());
//            }
//        }
    }
//sap xep sort

    public void readByAll() {

        Collections.sort(ticket);
        for (TicketDTO ti : ticket) {
            System.out.println(ti.toString());
        }
    }

}

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
    private TicketDTO ticket[] = new TicketDTO[20];
    private int len;

    public TicketDAO() {
        len = 0;
    }
    
    public TicketDTO create(TicketDTO d) {
        if ((len < 20) && (getPosition(d.getCode()) == -1)){
            ticket[len] = d;
            len++;
            return d;
        }
        return null;
    }
    
    private int getPosition(int code) {
        for(int i = 0; i < len; i++) {
            if(ticket[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }
    
    private float getCost(TicketDTO f) {
        float cost = f.getPrice() * f.getQuantity();
        return cost;
    }
    
    public void displayTotal() {
        float total = 0;
        for(int i = 0; i < len; i++) {
            total += getCost(ticket[i]);
        }
        System.out.println(total);
    }
    
    public void readByName(String name) {
        TicketDTO temp[] = new TicketDTO[len];
        int tempI = 0;
        for(int i = 0; i < len; i++) {
            if(ticket[i].getName().equals(name)) {
                temp[tempI] = ticket[i];
                tempI++;
            }
        }
        for(TicketDTO tk:temp) {
            System.out.println(tk.toString());
        }
    }
    
    public void readByAll() {
        TicketDTO temp[] = new TicketDTO[len];
        for(int i = 0; i < len - 1; i++) {
            for(int j = 0; j < len; j++) {
                if(getCost(ticket[i]) > getCost(ticket[j])) {
                    TicketDTO tempT = ticket[i];
                    ticket[i] = ticket[j];
                    ticket[j]= tempT;
                }
            }
        }
        for(int i = 0; i < len; i++) {
            temp[i] = ticket[i];
        }
        for(TicketDTO tk:temp) {
            System.out.println(tk.toString());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class TicketDTO implements Serializable, Comparable<TicketDTO>{

    private int code;
    private String name;
    private int quantity;
    private float price;

    public TicketDTO() {
    }

    public TicketDTO(int code, String name, int quantity, float price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

   
   
    
    @Override
    public String toString() {
        
        return "TicketDTO{Name= "+name+", Code= "+code+", Quantity= "+quantity+", Pice= "+price+"}";
         
               
    }

    @Override
    public int compareTo(TicketDTO o) {
        int value;
        value = this.name.compareTo(o.name);
        return value;
    }
    
}

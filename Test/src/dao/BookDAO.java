/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bus.BookUtil;
import entity.Book;

/**
 *
 * @author Administrator
 */
public class BookDAO implements BookUtil {

    int max = 50;
    public Book book[] = new Book[max];
    int n = 0;

    public BookDAO() {
        for (int i = 0; i < 50; i++) {
            book[i] = new Book();
        }
    }

    @Override
    public boolean add(Book b) {
        if (n >= 50) {
            return false;
        } else {
            for (int i = 0; i < n; i++) {
                if (b.getName().equals(book[i].getName())) {
                    return false;
                }
            }
            book[n] = b;
            n++;
            return true;
        }

    }

    @Override
    public int indexOf(int code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getCost(String sName) {
        int totalPrice = 0;
        for(int i=0;i<n;i++){
            totalPrice =(int) (book[i].getQuantity()*book[i].getPrice());
        }
        return totalPrice;
    }

    @Override
    public void readByAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void readByMaxOty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

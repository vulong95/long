/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Room;

/**
 *
 * @author Administrator
 */
public class RoomDAO implements RoomBus {

    int max = 10;
    public Room room[] = new Room[max];
    int count = 0;

    public RoomDAO() {
        for (int i = 0; i < 10; i++) {
            room[i] = new Room();
        }
    }

    @Override
    public boolean create(Room r) {
        if (count >= 10) {
            return false;
        } else {
            for (int i = 0; i < count; i++) {
                if (r.getCode().equals(room[i].getCode())) {
                    return false;
                }
            }
            room[count] = r;
            count++;
            return true;
        }

    }

    @Override
    public boolean update(String code) {
        return false;

    }

    @Override
    public int readBycode(String code) {
        for (int i = 0; i < count; i++) {
            if (room[i].getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int count() {
        return max - count;
    }

    @Override
    public int total() {
        int totalPrice = 0;
        for (int i = 0; i < count; i++) {
            totalPrice += room[i].getPrice();
        }
        return totalPrice;
    }

    @Override
    public void display(boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

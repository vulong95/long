/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author Quay
 */
public interface ChildInterface {

    public boolean create();

    public void update(int age);

    public void readByMaxAge();

    public void readByName(String name);

}

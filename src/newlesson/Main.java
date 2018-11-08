/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newlesson;

/**
 *
 * @author sarkhanrasullu
 */
public class Main {

    public static void main(String[] args) throws Exception {
        User u = new User();
        u.name = "test";
        u.password = "test";
        
        FileUtility.writeObjectToFile(u, "test.obj");

        User u2 =(User) FileUtility.readFileDeserialize("test.obj");
        
        
        System.out.println(u.hashCode());
        System.out.println(u2.hashCode());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map;

/**
 *
 * @author 2386636
 */
import java.util.*;
import java.util.Map;

public class Map {

    public static void main(String[] args) {
        
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        map.put(5,"Orange");
        
        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        
        
    }
    
}

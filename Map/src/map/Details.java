/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map;

/**
 *
 * @author 2386636
 */
import java.util.*;
import java.util.Map;

public class Details {
    public static void main(String[] args){
        //This is how to declare Hashmap
        HashMap<Integer,String> hmap = new HashMap<>();
        hmap.put(12,"Chaitanya");
        hmap.put(2,"Rahul");
        hmap.put(7,"Singh");
        hmap.put(49,"Ajeet");
        hmap.put(3,"Anuj");
        
        //Display content usig Iterator
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("key is: "+mentry.getKey()+" & Value is: ");
            System.out.println(mentry.getValue());
        }
        //Get values based on key
        String var = hmap.get(2);
        System.out.println("Value at index 2 is: "+var);
        //Remove values basd on key
        hmap.remove(3);
        hmap.putIfAbsent(103, "Gaurav");
        System.out.println("Map key and values after removal and adding : ");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()){
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.println("Key is: "+mentry2.getKey()+" & Value is: ");
        }
    
        
                
    }
}

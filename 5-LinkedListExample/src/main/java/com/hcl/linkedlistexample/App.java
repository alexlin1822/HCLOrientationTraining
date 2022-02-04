package com.hcl.linkedlistexample;

import java.util.*;


/**
 * linkedlist example
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        
        // Use addLast() to add the item to the end
        cars.addLast("Mazda");
        System.out.println(cars);
        
        cars.addFirst("Mazda");
        System.out.println(cars);
        
        cars.removeLast();
        System.out.println(cars);
        
        cars.removeFirst();
        System.out.println(cars);
        
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
    }
}

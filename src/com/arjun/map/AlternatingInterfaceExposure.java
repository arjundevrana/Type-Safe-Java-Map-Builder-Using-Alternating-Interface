package com.arjun.map;

import java.util.Map;

public class AlternatingInterfaceExposure {

    public static void main(String[] args) {
        // Use the type safe builder
        Map<Integer, String> map = Maps.builder()
                .key(1)                 // The key type is decided here for all following keys
                .value("One")           // The value type is decided here for all following values
                .key(2)                 // Must be the same or extend the first key type
                .value("Two")           // Must be the same type or extend the first value type
                .key(10).value("Zehn'") // And so on...
                .build();               // Creates the map!
        // Create an empty map
        Map<String, Integer> map2 = Maps.builder()
                .build();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        if(map2.isEmpty()){
           System.out.println("This map object is empty and not have any value!"); 
        }else{
            System.out.println("Error in empty map cration!"); 
        }
    }

}

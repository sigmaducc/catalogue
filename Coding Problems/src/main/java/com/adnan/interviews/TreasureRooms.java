package com.adnan.interviews;
/*

You are with your friends in a castle, where there are multiple rooms named after flowers. Some of the rooms contain treasures - we call them the treasure rooms. 

Each room contains a single instruction that tells you which room to go to next.

 *** instructions_1 and treasure_rooms_1 *** 

 lily* ---------      daisy  sunflower
               |        |     |
               v        v     v
 jasmin --> tulip*      violet* ----> rose* -->
            ^    |      ^             ^       |
            |    |      |             |       |
            ------    iris            ---------

* denotes a treasure room, e.g., rose is a treasure room, but jasmin isn't.

This is given as a list of pairs of (source_room, destination_room)

instructions_1 = [ 
    ["jasmin", "tulip"],
    ["lily", "tulip"],
    ["tulip", "tulip"], 
    ["rose", "rose"],
    ["violet", "rose"], 
    ["sunflower", "violet"],
    ["daisy", "violet"],
    ["iris", "violet"]
]

treasure_rooms_1 = ["lily", "tulip", "violet", "rose"]

Write a function that takes two parameters as input:
* a list of instructions represented as pairs of (source_room, destination_room), and
* a list containing the treasure rooms,

and returns a collection of all the rooms that satisfy the following two conditions:
* at least two *other* rooms have instructions pointing to this room
* this room's instruction immediately points to a treasure room 

filter_rooms(instructions_1, treasure_rooms_1) => ["tulip", "violet"]
* tulip can be accessed from rooms lily and jasmin. Tulip's instruction points to a treasure room (tulip itself)
* violet can be accessed from daisy, sunflower and iris. Violet's instruction points to a treasure room (rose)

Additional inputs

treasure_rooms_2 = ["lily", "jasmin", "violet"]  

filter_rooms(instructions_1, treasure_rooms_2) => []
* none of the rooms reachable from tulip or violet are treasure rooms

 *** instructions_2 and treasure_rooms_3 *** 

 lily ---------          --------
              |          |      |
              v          v      |
 jasmin --> tulip ---> violet*--^  

instructions_2 = [ 
    ["jasmin", "tulip"],
    ["lily", "tulip"],
    ["tulip", "violet"],
    ["violet", "violet"]       
]

treasure_rooms_3 = ["violet"]

filter_rooms(instructions_2, treasure_rooms_3) => ["tulip"]
* tulip can be accessed from rooms lily and jasmin. Tulip's instruction points to a treasure room (violet)

All the test cases: 
filter_rooms(instructions_1, treasure_rooms_1)    => ["tulip", "violet"]
filter_rooms(instructions_1, treasure_rooms_2)    => [] 
filter_rooms(instructions_2, treasure_rooms_3)    => ["tulip"]

Complexity Analysis variables:
T: number of treasure rooms
I: number of instructions given
*/


import java.io.*;
import java.util.*;

public class TreasureRooms {
  public static void main(String[] argv) {
      String[][] instructions_1 = {
        {"jasmin", "tulip"},
        {"lily", "tulip"},
        {"tulip", "tulip"},
        {"rose", "rose"},
        {"violet", "rose"},
        {"sunflower", "violet"},
        {"daisy", "violet"},
        {"iris", "violet"}
      };

      String[][] instructions_2 = {
        {"jasmin", "tulip"},
        {"lily", "tulip"},
        {"tulip", "violet"},
        {"violet", "violet"}
      };

      String[] treasure_rooms_1 = {"lily", "tulip", "violet", "rose"};
      String[] treasure_rooms_2 = {"lily", "jasmin", "violet"};
      String[] treasure_rooms_3 = {"violet"};
      
      
      filter_rooms(instructions_1, treasure_rooms_1);
      filter_rooms(instructions_1, treasure_rooms_2);
      filter_rooms(instructions_2, treasure_rooms_3);
  }
  
  public static List<String> filter_rooms(String[][] instructions, String[] treasure_rooms) {
    List<String> output = new ArrayList<String>();
    Map<String, Integer> map = new HashMap<String, Integer>(); 
    
    // O(instructions * treasure_rooms)
    for(int i = 0; i < instructions.length; i++) {
      String source = instructions[i][0]; 
      String dest = instructions[i][1]; 
      if(source != dest) {
        if(map.containsKey(dest)) {
          map.put(dest, map.get(dest) + 1);
        } else {
          map.put(dest, 1);
        }
      }
    }

    for (Map.Entry<String, Integer> entry: map.entrySet()) {
       String key = entry.getKey();
       Integer count = entry.getValue();
       
       for(int i = 0; i < treasure_rooms.length; i++) {
         for(int j = 0; j < instructions.length; j++) {
          String source = instructions[j][0]; 
          String dest = instructions[j][1]; 
          
          if(source == key && dest == treasure_rooms[i] && count >= 2) {
            output.add(key);
          }
         }
       }
    }
    
    System.out.println(output);
    
    return output;
  }
}
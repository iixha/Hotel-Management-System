/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

/**
 *this class for who booking Restaurant
 * @author Owner
*/

import java.util.*;
public class Resturant {
    //   Data Members

    private static TreeSet<Visitor> arrayVisitor;
    public static int capacity = 5;
    public static String [][] menu = {  
        {"Dish Number: " , "      Dish Name:               ","   ", "Calories(cal):   ",  "         Price(SR):"},     
        {"    1","             INSALATA DI CESARE SALAD   ","       ","730","                     "  ,"74"},
        {"    2","             MIMOSA SALAD               ","       ","506","                     ","103"},    
        {"    3","             MARGHERITA PIZZA   ","               ","1051","                    " ,"86"},
        {"    4","             PEPPERONI PIZZA    ","               ","1195","                    ","97"},
        {"    5","             TORTELLI DI MARGO PASTA    ","       ","841","                     ","110"},
        {"    6","             RAVIOLI DI POLLO PASTA    ","        ","845","                     " ,"109"},
        {"    7","             TERAMISO DESSERT   ","               ","529","                     ","63"},
        {"    8","             TORTINO DESSERT     " ,"              ","815","                     ","85"},
        {"    9","             PINA COLADA DRINK         ","        ","380","                     ","40"},
        {"    10","            APPLE JUICE SPARKLING      " ,"       ","130","                     ","32"}
     };
     
//     constructors:
     /**
     *Constructs a new restaurant
     * Constructs a list containing the elements of the specified collection,
     * in the order they are returned by the collection's iterator.
     */
    public Resturant(){{Resturant.arrayVisitor = new TreeSet<>();}}
    
   /**
    *Constructs a new restaurant
     * the collection whose elements are to be placed into this list
     * @param arrayVisitor
     */
    public Resturant(TreeSet<Visitor> arrayVisitor) {
        if(capacity == 0){System.out.println("Sorry we don't have avilable reservation in our Resturant now!");}
        else{
        Resturant.arrayVisitor = new TreeSet<>();
        Resturant.arrayVisitor = arrayVisitor;
        }
    }
   
//  setter and getter
    /**
     *set the arrayVisitor attribute
     * @param arrayVisitor of restaurant
     */
    public void setArrayVisitor(TreeSet<Visitor> arrayVisitor) {
        Resturant.arrayVisitor = arrayVisitor;
    }
    
    /**
     *set the capacity attribute
     * @param capacity of the restaurant
     */
    public static void setCapacity(int capacity) {
        Resturant.capacity = capacity;
    }
    
    /**
     *returns capacity attribute
     * @return capacity attribute
     */
    public static int getCapacity() {
        return capacity;
    }
    
    /**
     * static method
     * if the Capacity of restaurant equal 0 we don't have available reservation 
     */
    public static boolean uppdateCapacity(){
        if(capacity == 0){
        return true;
        }
        else
        capacity--;
       return false;
    }
    
    /**
     *Returns the Arrayvisirot at the specified position in this list.
     * @return Arrayvisirot
     */
  public TreeSet<Visitor> getArrayvisirot() {
        return arrayVisitor;
    }
    
   //other methods:
  
    /**
     * static method to add new visitor
     * @param visitor to arrayVisitor in restaurant
     */
  public static void addVisitor(Visitor visitor){     
        arrayVisitor.add(visitor);      
  }
  
    /**
     * to print menu
     */
   public void showMenu(){
        System.out.println(" \t \t \t \t \t << THE MENUE >>               "); 
          System.out.println();
        for (String[] menu1 : menu) {
            for (String menu11 : menu1) {
                System.out.print(menu11 + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________________________________________");
      
  }
    @Override
    public String toString(){
        String str= "";
        for(Visitor i:arrayVisitor){
        str+=""+i+"\n";}
         
         return str;
    }  

}

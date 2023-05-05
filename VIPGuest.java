/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.util.Scanner;
 /**
 * sub class extends Guest for who is booking VIPGuest
 * @author Owner
 */
public class VIPGuest extends Guest {
   //Data Members
    private double price;
    private double breakfastPrice;
    Scanner input = new Scanner(System.in);
    //Constructors:
    
    /**
    *Constructs a new VIPGuest
    */
    public VIPGuest(){
        System.out.println("Hello our guest, we appreciate your coming and booking in our hotel❣\n️");
    }
    
     /**
     *Constructs a new VIPGuest
     * @param id take ID number from user and this is the first parameter to VIPGuest
     * @param name take name from user and this is the second parameter to VIPGuest
     * @param mobilPhone take mobilePhone number from user and this is the third parameter to VIPGuest
     */
    public VIPGuest(long id, String name, long mobilPhone) {
       super(id, name, mobilPhone);
       System.out.println("Hello our guest, we appreciate your coming and booking in our hotel❣️\n");
    }
    //Setter & getter Methods: 
    /**
    *returns the number of price
    * @return number of price
    */
    public double getPrice() {
        return price;
    }
    
    /**
     *set the price attribute
     * @param price attribute
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
    /**
    *returns the price of breakFast
    * @return price of breakFast
    */
    public double getBreakfastPrice() {
        return breakfastPrice;
    }
    
    /**
    *set the breakfastPrice attribute
    * @param breakfastPrice attribute
    */
    public void setBreakfastPrice(double breakfastPrice) {
        this.breakfastPrice = breakfastPrice;
    }
    
    //other Methods:
    
    /**
    *show breakfast details
    */
    @Override
    public void breakfastService() { 
        System.out.print("  How many persons will reseve in breakfast? "); 
        int numberOfper = input.nextInt(); 
        System.out.println(""); 
        System.out.println("        we have these breakfast timings you can come with any time\n");  
        System.out.println("        ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ️"); 
        System.out.println("        ☕️ from :  to      Type of Breakfast ☕️");  
        System.out.println("        ☕️ 6h   :  8h      Arabic Breakfast  ☕️");  
        System.out.println("        ☕️ 8h   : 10h      French Breakfast  ☕️");  
        System.out.println("        ☕️ 10h  : 12h      Turkish Breakfast ☕️");  
        System.out.println("        ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️  ️ "); 
        if(numberOfper > 3) breakfastPrice = (60*(numberOfper-3));  
        price += breakfastPrice; 
    }
     
    
    /**
    * this method about free service which takes the number of boat 
    * passengers if they are more then 7 we well not allow to reserve in this service 
    */
    @Override
    public void boatTrip() { 
        System.out.print("\n  How many person will get on the boat(7 or less)? "); 
        int boatpassengers = input.nextInt(); 
        if (boatpassengers > 7) { 
            throw new ArithmeticException("\nSorry the number of people more than 7, you will enter again"); 
        } else { 
            System.out.println("\t\t--------------------------------------------------------------"); 
            System.out.println("\t\t  We are waiting you at the coast from 6:00AM to 6:00 PM "); 
            System.out.println("\t\t--------------------------------------------------------------"); 
        }          
    }
    
    /**
    * void method to print Bill information
    */
    @Override
    public void showBill() {
        System.out.println(super.toString());
        System.out.println("Service:");
        System.out.print("Breakfast: ");
        if(breakfastPrice !=0) System.out.println(breakfastPrice+" SR");
        else System.out.println("For FREE");
        System.out.println("Boat Trip: For FREE");
    }
    
    /**
    *returns a string representation of this VIPGuest.
    * @return VIPGuest
    */
    @Override
    public String toString() {   
        return "\t\t<<VIP Guest>>\n{" + super.toString() +"}";
    }
}
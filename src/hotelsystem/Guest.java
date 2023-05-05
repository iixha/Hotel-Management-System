/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;

import java.util.Scanner;

/**
 * this class abstract class to get information from guest who is booking in our hotel
 * @author Owner
 */
public abstract class Guest {
 //Data Members
 Scanner in = new Scanner(System.in); 
    private long ID;  
    private String name;    
    private long mobilePhone;  
    //Constructors
    /**
     *Default Constructs a new guest
     */
    public Guest(){} 
    
     /**
     * Constructs a new guest
     * @param ID take ID number from user and this is the first parameter to guest
     * @param name take name from user and this is the second parameter to guest
     * @param mobilePhone take mobilePhone from user and this is the third parameter to guest
     */
    public Guest(long ID, String name, long mobilePhone) {  
        this.ID = ID;  
        this.name = name;  
        this.mobilePhone = mobilePhone; 
    }  
    //Setter & Getter Methods
    
    /**
     * returns the number of mobilePhone
     * @return mobilePhone
     */ 
    public long getMobilePhone() {  
        return mobilePhone;  
    }
    
    /**
     *set the number of mobilePhone attribute
     * @param mobilePhone set the number of mobilePhone attribute
     */  
    public void setMobilePhone(long mobilePhone) {  
        this.mobilePhone = mobilePhone;  
    }
    
  /**
   *returns the number of ID 
   * @return ID attribute
   */
    public long getID() {  
        return ID;  
    }
    
    /**
     *set the ID attribute
     * @param ID attribute
     */  
    public void setID(long ID) {  
        this.ID = ID;  
    }  
    /**
     *returns the name 
     * @return name attribute
     */
    public String getName() {  
        return name;  
    }
    
    /**
     *set the name attribute
     * @param name attribute
     */
    public void setName(String name) {  
        this.name = name;  
    }  
    //Other Methods:
    
    /**
     *this is method to print welcome phrases 
     */
    public static void guestCalss(){   
        System.out.println("\t\t⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕"); 
        System.out.println("\t\t\tHello our guest\n\t\t⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕⁕\n\n • Vip Room  price is : 1500 SR enter A\n\n • Normal Room price is : 600 SR enter B\n\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");  
        System.out.print("  Please Enter A or B:"); 
    }  
    
     /**
     *returns a string representation of this guest.
     * @return print name + ID + mobilePhone
     */
    @Override
    public String toString() {
        return  "name: " + name +"\tID:" + ID +"\t MobilePhone: +966 " + mobilePhone ;
    }
   //Abstract Methods
   public abstract void showBill();  
   public abstract void boatTrip();
   public abstract void breakfastService(); 
}



    


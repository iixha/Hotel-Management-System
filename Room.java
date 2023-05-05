/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem;
/**
 * this class show server in room 
 * @author Owner
*/
public class Room  {
    //  Data members    
    private int number_Room ; 
    private int checkInDay; 
    private int checkoutDay;  
    private Guest guestlnfo ; 
    private boolean statusRoom;
    private int numberOfDays;
    private double originalPrice;
    private static int counter = 0;
    private char guestType;    
    //Constructors:
    
    /**
     *Constructs a new room
     * if statusRoom equals false then numberofRoom and counter increase;
     */
    public Room(){
    statusRoom = false;
    number_Room = counter++;               
    } 
    /**
    *Constructs a new room
    * @param guestlnfo take guestlnfo from guest class and this is the first parameter to room
    * @param checkInDay take date of checkInDay from user and this is the second parameter to room
    * @param checkoutDay take date of checkOutDay from user this is the third parameter to room
    */
    public Room( Guest guestlnfo,int checkInDay, int checkoutDay) {       
        number_Room = counter++;
        this.guestlnfo = guestlnfo; 
        this.checkInDay = checkInDay; 
        this.checkoutDay = checkoutDay;   
        statusRoom = true;       
    } 
    //Setter & getter Methods:
    
    /**
    *returns the number of days
    * @return number of days
    */
    public int getNumberofDays() {
        return numberOfDays;
    }
    
    /**
     *set the gustInfo attribute
     * @param guestlnfo attribute
     */
    public void setGuestlnfo(Guest guestlnfo) {
        this.guestlnfo = guestlnfo;
    }
    
    /**
     *set the number of checkInDay attribute
     * @param checkInDay attribute
     */
    public void setCheckInDay(int checkInDay) { 
        this.checkInDay = checkInDay; 
    }
    /**
     *returns the checkin date 
     * @return checkin date 
     */
    public int getCheckInDay() {
        return checkInDay;
    }
    
    /**
    *set the number of checkoutDay attribute
    * @param outDay attribute
    */
    public void setCheckoutDay(int outDay) { 
        checkoutDay = outDay; 
    } 
        
  
    
    /**
     *returns the number of room 
     * @return number of room 
     */
    public int getNumber_Room() {
        return number_Room;
    }
    
    /**
     *set the number_room attribute
     * @param number_Room attribute
     */
    public void setNumber_Room(int number_Room) {
        this.number_Room = number_Room;
    }
    
    /**
     *returns the number of days
     * @return number of days
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }

    /**
    *set the numberOfDay attribute
    * @param numberOfDays attribute
    */
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
    
    /**
    *returns the gustType
    * @return gustType attribute
    */
    public char getGuestType() {
        return guestType;
    }
    
    /**
    *set the gustType attribute
    * @param guestType attribute
    */
    public void setGuestType(char guestType) {
        this.guestType = guestType;
    }
    
    /**
    *returns the gustInfo
    * @return gustInfo attribute
    */
    public Guest getGuestlnfo() {
        return guestlnfo;
    }
    
    /**
    *returns the number of checkoutDay
    * @return checkoutDay attribute
    */
    public int getCheckoutDay() { 
        return checkoutDay; 
    }
    
    /**
    *returns the number of room
    * @return number of room
    */
    public int getNumberRoom() { 
        return number_Room; 
    } 
    
    /**
    *returns the StatusRoom
    * @return StatusRoom
    */
    public boolean getStatusRoom() { 
        return statusRoom; 
    }
    
    /**
    *returns the Original Price depending to the type of room 
    * @return OriginalPrice
    */
    public double getOriginalPrice() {
        return originalPrice;
    }
    
  
    /**
     *set the statusRoom attribute
     * @param statusRoom attribute
     */
    public void setStatusRoom(boolean statusRoom) {
        this.statusRoom = statusRoom;
    }
    /**
     *set the originalPrice attribute
     * @param originalPrice attribute
     */
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
        
    
    //Other Methods:
    
    /**
    * void method 
    * this method to calculate numberOfDays attribute
    */
    public void calculateNumberOfDays() {
        numberOfDays = checkoutDay - checkInDay ;
    }
    
    /**
    * this method to checkType of guest
    * @return price of type after checking the type of guest VIP or Normal 
    */
    public double checkType(){   
      if (guestlnfo instanceof VIPGuest){
          guestType ='V';
         return 1500;
      }
      else {
          guestType = 'N';
          return 600;
    }}
    
    /**
    * void method to extension of Reservation if the guest who wants to extend
    * @param numberOfDays the guest who wants to extend
    */
    public void extensionOfReservation(int numberOfDays){
        this.numberOfDays += numberOfDays;
    }
    
    /**
     * void method to new booking
     * @param guestlnfo 
     * @param inDay
     * @param outDay
     */
  public void booking (Guest guestlnfo, int inDay, int outDay){  
    this.guestlnfo = guestlnfo;
    checkInDay = inDay;
    checkoutDay = outDay;
    statusRoom = true;
    originalPrice = checkType();
    calculateNumberOfDays();
    System.out.println("♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️");
    System.out.println("Your Room's Number: "+ number_Room);
    System.out.println("♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️♦️");
    }  
   
    /**
    *Compare 2 objects
    * @param obj of type Object
    * @return true if this object is the same as the obj argument; false otherwise.
    */
    @Override
    public boolean equals(Object obj) {
    Room room =(Room) obj;
    return (this.numberOfDays <= room.numberOfDays);                       
    }
    
    /**
     * void method to show WiFi name and Password
     * @param numberRoom of guest
     */
    public void ShowWifi(int numberRoom){ 
    String str = "slhzaR";
    System.out.println("📶📶📶📶📶📶📶📶📶📶📶📶📶");
    System.out.println("Network name: Hotel ");
    System.out.println ("Password: slhzaR#"+ number_Room  ); 
    System.out.println("📶📶📶📶📶📶📶📶📶📶📶📶📶");
    }
    
    /**
    *void method if statusRoom equals false then guestlnfo equals null that mean empty room 
    */  
    public void checkout(){
    statusRoom = false; 
    guestlnfo = null;      
    }
  
    /**
    *void method
    * for Bill information
    */
    public void showBill(){ 
    System.out.println("💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸");
    double p;
    guestlnfo.showBill();
    checkType();
    System.out.println("Number of days you have stayed in the hotel: "+ numberOfDays );  
      if(guestType == 'V') p = ((VIPGuest)guestlnfo).getPrice();
      else p = ((NormalGuest)guestlnfo).getPrice();
      System.out.println("Total Price:"+(((numberOfDays)*originalPrice)+ p));
      System.out.println("WE ARE WAITING YOU AGAIN ❤️❤️❤️!");
      System.out.println("💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸-💸");  
  } 
  
    /**
    *returns a string representation of this roomType.
    * @return NO.Room + guestlnfo + checkInDay + checkoutDay
    */
    @Override 
    public String toString() { 
        return  "NO.Room:" + number_Room +"\n" + guestlnfo+ "\ncheckInDay:" + checkInDay + "\tcheckoutDay:" + checkoutDay; 
    } 
}

      
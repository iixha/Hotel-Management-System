
package hotelsystem;
import java.util.Scanner;
/**
 *  sub class extends Guest for who is booking Normal guest
 * @author Owner
 */
public class NormalGuest extends Guest {
   //Data Members
   private double price;
   private double breakfastPrice;
   private boolean isBoatTrip ;
    /**
     *Declared new Normal guest
    * And taking input from the user
    * by using Scanner class
    */
   Scanner input = new Scanner(System.in);
   //Constructors:
   
   /**
    *Constructs a new normalGuest
    */
    public NormalGuest() {
    System.out.println("\"Hello our guest, we appreciate your coming and booking in our hotel❣️\n");
    }
    
    /**
     *Constructs a new normalGuest
     * @param ID take ID number from user and this is the first parameter to normalGuest
     * @param name take name from user and this is the second parameter to normalGuest
     * @param mobilePhone take mobilePhone number from user and this is the third parameter to normalGuest
     */
    public NormalGuest(long ID, String name, long mobilePhone) {
       super(ID , name, mobilePhone ); 
       System.out.println("\"Hello our guest, we appreciate your coming and booking in our hotel❣️\n");
    }
    //Setter & Getter Methods
    
    /**
     *returns the number of price 
     * @return price attribute
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
     *returns the price of breakfast
     * @return breakfast attribute
     */
    public double getBreakfastPrice() {
        return breakfastPrice;
    }

    /**
     *set the price of breakFast attribute
     * @param breakfastPrice attribute
     */
    public void setBreakfastPrice(double breakfastPrice) {
        this.breakfastPrice = breakfastPrice;
    }
    
    /**
     *returns the number of botTrip
     * @return number of botTrip
     */
    public boolean getIsBoatTrip() {
        return isBoatTrip;
    }

    /**
     * set the Boolean of boatTrip attribute
     * @param isBoatTrip attribute
     */
    public void setIsBoatTrip(boolean isBoatTrip) {
        this.isBoatTrip = isBoatTrip;
    }
    
    //Other Methods:
    /**
     *show breakfast details and calculate the breakfast price
     */
    @Override
    public void breakfastService() { 
        System.out.println("  Please note this service is not free\n"); 
        System.out.println("  How many persons will reseve in our breakfast? "); 
        int numberOfper = input.nextInt(); 
        System.out.println(""); 
        System.out.println("        we have these breakfast timings you can come with any time\n");  
        System.out.println("        ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ️"); 
        System.out.println("        ☕️ from :  to      Type of Breakfast ☕️");  
        System.out.println("        ☕️ 6h   :  8h      Arabic Breakfast  ☕️");  
        System.out.println("        ☕️ 8h   : 10h      French Breakfast  ☕️");  
        System.out.println("        ☕️ 10h  : 12h      Turkish Breakfast ☕️");  
        System.out.println("        ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️ ☕️☕️  ️ "); 
        breakfastPrice = (60*numberOfper); 
        price += breakfastPrice;         
    } 
    /**
    * this method about payment service take the number of boat passengers if
    * they are more then 7 we well not allow to reserve in this service  
    */
   @Override
    public void boatTrip() { 
        System.out.println("  Please note this service is not free\n"); 
        System.out.print("  How many person will get on the boat(7 or less)? "); 
        int boatpassengers = input.nextInt(); 
        if (boatpassengers > 7) { 
            throw new ArithmeticException("Sorry the number of people more than 7, you will enter again"); 
        } else { 
 
           System.out.println("\n\t\t--------------------------------------------------------------"); 
            System.out.println("\t\t  We are waiting you at the coast from 6:00AM to 6:00 PM "); 
            System.out.println("\t\t--------------------------------------------------------------"); 
        } 
         price += 350; 
         isBoatTrip = true; 
    }
    //Other Methods:  
    
    /**
    *Bill information
    * 
    */
    @Override
    public void showBill() {
        System.out.println(super.toString());
        System.out.println("Service :");
        if(price ==0 ) System.out.println("You don't reserve any additional service!");
        else{
        System.out.print("Breakfast: ");
        if(breakfastPrice !=0) System.out.println(breakfastPrice+" SR");
        else System.out.println("No breakfast service");
        System.out.println("Boat Trip: ");
        if(isBoatTrip == true )System.out.println("350 SR");
        else System.out.println("No boat trip service");
        }
    }
    //To string method:  
    /**
     *returns a string representation of this normalGuest.
     * @return normalGuest information of Guest
     */
    @Override
    public String toString() {  
        return "\t\t<<Normal Guest>>\n{" + super.toString() +"}";
    }   
}
    
    
    


    
    

    


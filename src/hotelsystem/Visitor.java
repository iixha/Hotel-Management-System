
package hotelsystem;
import java.util.ArrayList;
/**
 *this class to get info from visitor who reserve in our restaurant
 * @author Owner
 */
public class Visitor implements Comparable{
//  Data Members
    private String name;
    private long telNumber;
    private ArrayList <Dish> arrayDishes;
    private int reservationDate;
    private  int reservationNumber;
    private double totalPrice;
//  Constructors:
     /**
     *Constructs a new Visitor
     * Constructs an empty list with an initial capacity of ten
     */
    Visitor(){
        this.arrayDishes = new ArrayList<>();
         reservationNumber = Resturant.getCapacity();
         Resturant.uppdateCapacity();
    }
    /**
     *Constructs a new Visitor
     * @param name take name from user and  this is the first parameter to visitor
     * @param telNumber take tellNumber from user and this is the second parameter to visitor
     * @param resevationDate take resevationDate from class Restaurant and this is the third parameter to visitor
     */
    Visitor(String name, long telNumber, int resevationDate){
        this.name = name;
        this.telNumber = telNumber;
        this.reservationDate = resevationDate;    
        this.arrayDishes = new ArrayList<>();
        reservationNumber = Resturant.getCapacity();
        Resturant.uppdateCapacity();
    }
//  Setter & Getter Methods:
    
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
    
    /**
    *returns the number 
    * @return number attribute
    */
    public long getTelNumber() {
        return telNumber;
    }
    
    /**
    *set the telNumber attribute
    * @param telNumber attribute
    */
    public void setTelNumber(long telNumber) {
        this.telNumber = telNumber;
    }
    
    /**
    *returns the Date of reservation
    * @return reservationDate attribute
    */
    public int getReservationDate() {
        return reservationDate;
    }
    
    /**
    *set the ReservationDate attribute
    * @param reservationDate attribute
    */
    public void setReservationDate(int reservationDate) {
        this.reservationDate = reservationDate;
    }
    
    /**
    *returns the number of reservation
    * @return reservationNumber attribute
    */
    public int getReservationNumber() {
        return reservationNumber;
    }
    
    /**
    *set the ReservationNumber attribute
    * @param reservationNumber attribute
    */
    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }
    
    /**
    *Returns the ArrayDishes at the specified position in this list.
    * @return arrayDishes
    */
    public ArrayList<Dish> getArrayDishes() {
        return arrayDishes;
    }
    
    /**
    *set the arrayDishes attribute
    * @param arrayDishes attribute
    */
    public void setArrayDishes(ArrayList<Dish> arrayDishes) {
        this.arrayDishes = arrayDishes;
    }
    
    /**
    *returns the total price
    * @return totalPrice
    */
    public double getTotalPrice() {
        return totalPrice;
    }
    
    /**
    *set the totalPrice attribute
    * @param totalPrice attribute
    */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
//  Other Methods:
    
    /**
    *void method to add dish to arrayDishes
    * @param dish object
    */
    public void addDish( Dish dish ){
        arrayDishes.add(dish);        
    }
    
    /**
    * void method to print Bill information
    */
    public void showBill(){
        System.out.println("____________________________________________________________");
        System.out.println("                     <<Dish>>               <<Price>>");
        for(Dish d :arrayDishes){
            System.out.print(d);
            totalPrice += d.getDishPrice();
        }
        System.out.println("Total: "+ totalPrice + "\nReservation Number:" + reservationNumber);  
        System.out.println("Thank you for visiting, please don't be late we are waiting you❤️");
        System.out.println("_________________________________________________________________");

    }
    
    /**
    *returns a string representation of this visitor.
    * @return str
    */
    public String toString(){
        String str ="";
        str+= "Visitor Name: "+ name+ "\tReservation Number: " + reservationNumber + "\tDate: " + reservationDate+"\n\n";
        for(Dish d :arrayDishes){
            str += d;           
        }
        str+= "\n_________________________________________________________________";
        return str;
    }
    
    /**
    *compareTo between two object
    * @param o object
    * @return the ordered arrayVisitor depends on reavationDate
    */        
  @Override
    public int compareTo(Object o){
      Visitor v = (Visitor)o;
      if(this.reservationDate > v.reservationDate)return 1;
     else if(this.reservationDate < v.reservationDate)return -1;
      else return 0;
  }
}

    


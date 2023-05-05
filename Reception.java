

package hotelsystem;
/**
 *This is the main method which is very important for execution for a java program.
 * @author Owner
 */

import java.util.InputMismatchException;

import java.util.*; 
public class Reception { 
     public static void main(String args[]) throws InputMismatchException{ 
        Scanner input = new Scanner(System.in); 
       ArrayList <Room> Recepion = new ArrayList<>(); 
       Room compare = new Room(); 
       compare.setNumberOfDays(3); 
       for(int i=0; i<3; i++){ 
           Room room = new Room(); 
           Recepion.add(room); 
       } 
       Resturant resturant = new Resturant(); 
        String name; 
        long mobileNumber; 
        boolean repeate = true; 
        System.out.printf("%10s \t⋞ Welcome in our Hotel and Resturant website ⋟%10s %n"," "," \n\n"); 
        do{ 
            System.out.print("•  What do you want to do?\n\n1. Booking(Hotel or Resturant)\n\n2. Hotel Services and checkout\n\nDear our guest Enter 1 or 2 : "); 
             int choise =input.nextInt(); 
                 System.out.println(""); 
            switch(choise){ 
                case 1: 
                    System.out.print(" 1. Hotel Booking \n\n 2. Resturant Booking\n\n Please Enter 1 or 2: "); 
                    int choice = input.nextInt();              
                    System.out.print(" \n Enter your full name: "); 
                          input.nextLine(); 
                    name = input.nextLine(); 
                    System.out.println(""); 
                    System.out.print(" Enter your mobile number ☎️: "); 
                    mobileNumber = input.nextLong(); 
                    System.out.println("\n"); 
                    switch(choice){ 
                        case 1: 
                            Guest.guestCalss(); 
                            char guestCalss =  input.next().toUpperCase().charAt(0);                             
                            System.out.print("\n•  What is your National ID? "); 
                            long Id = input.nextLong(); 
                                System.out.println(""); 
                            System.out.println("Dear our Guest you must note that the reservation in the Hotel only valid in this month\n"); 
                            System.out.print("•  What is the date of Checkin? "); 
                            int inDay = input.nextInt(); 
                                System.out.println(""); 
                            System.out.print("•  What is the date of Checkout? "); 
                            int outDay = input.nextInt(); 
                                System.out.println(""); 
                                try{ 
                                    validatetDate(inDay, outDay); 
                                } 
                                catch(Exception e){ 
                                    System.out.println(e); 
                                System.out.print("•  Enter checkin Date again: "); 
                                inDay = input.nextInt(); 
                                    System.out.println(""); 
                                System.out.print("•  Enter checkout Date again: "); 
                                outDay = input.nextInt(); 
                                    System.out.println(""); 
                                 
                            }  
                             
                            switch(guestCalss){ 
                                case'A': 
                                    VIPGuest vip = new VIPGuest(Id,name,mobileNumber ); 
                                    bookRoom(Recepion, vip, inDay, outDay); 
                                    break; 
                                case 'B':  
                                    NormalGuest normal = new NormalGuest(Id,name,mobileNumber ); 
                                    bookRoom(Recepion, normal, inDay, outDay); 
                                    break; 
                                    
                                default:  
                                     System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); 
                                    System.out.println("\t\t  You have entered invalid choice!!!");     
                                    System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); 
                            }                                                       
                            break; 
                        case 2:  
                            System.out.print("#  You must note that the date of your resevation must be in this month\n\n  Enter the date of your reservation: "); 
                        int date = input.nextInt(); 
                         if(resturant.uppdateCapacity()== false){ 
                        Visitor visitor = new Visitor(name, mobileNumber, date ); 
                        resturant.showMenu(); 
                        (new Dish()).showIngredients(); 
                        boolean flag = true; 
                        do{ 
                        System.out.print("•  Enter number of dishes you want to order please: ");  
                        int NOdishes = input.nextInt(); 
                            System.out.println(""); 
                        for(int i=1; i<= NOdishes; i++ ){ 
                            System.out.print("•  Enter the dish number "+ i+": "); 
                            int order; 
                            try{ 
                            order = input.nextInt();} 
                            catch(Exception e){ 
                            System.out.print("Invalid entry!\nPlease Enter again: "); 
                            order = input.nextInt();}      
                                System.out.println(""); 
                        Dish dish = new Dish(order); 
                        dish.setDishPrice(order); 
                        visitor.addDish(dish); 
                        } 
                            System.out.print("•  Mr./Ms."+visitor.getName() + "do you want to order another dishes? \n   Answer with yes or no: "); 
                            String answer = input.next(); 
                                System.out.println(""); 
                            if("no".equalsIgnoreCase(answer)) flag = false;                                                                                       
                        }while(flag);                         
                        Resturant.addVisitor(visitor); 
                        visitor.showBill();} 
                         else{ 
                                System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); 
                                System.out.println("\t\tSorry we don't have avilable reservation in our Resturant now!\n"); 
                                System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");} 
                        break; 
                         
                        default:{ 
                            System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); 
                            System.out.println("\t\tInvalid input\n");     
                            System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");} 
                         
                    } 
                    break; 
                case 2: 
                    System.out.print("•  Enter number of your room please: "); 
                       int numberRoom = input.nextInt(); 
                           System.out.println(""); 
                    System.out.print("•  What do you want to do?\n\n 1. Extension your Reservation\n\n 2. Hotel Services\n\n 3. Checkout\n\n Enter the number of service please: "); 
                    switch(input.nextInt()){ 
                        case 1: 
                                System.out.println(""); 
                            System.out.print("•  Enter number of days that you want to extend: "); 
                            int exDays = input.nextInt(); 
                                System.out.println(""); 
                            for(int i=0; i<Recepion.size(); i++){ 
                                if(Recepion.get(i).getNumberRoom()== numberRoom){Recepion.get(i).extensionOfReservation(exDays);} 
                            } 
                            break; 
                        case 2:  
                            System.out.print("•  what do you want to inquire about?\n\n 1. Breakfast\n\n 2. Boat Ttip\n\n 3. WiFi\n\n  Please Enter your choise: "); 
                            switch(input.nextInt()){ 
                                case 1: 
                                        System.out.println(""); 
                                    for(int i=0; i<Recepion.size(); i++){ 
                                if(Recepion.get(i).getNumberRoom()== numberRoom){Recepion.get(i).getGuestlnfo().breakfastService();}} 
                                    break; 
                                case 2: 
                                for(int i=0; i<Recepion.size(); i++){ 
                                if(Recepion.get(i).getNumberRoom()== numberRoom){ 
                                    try{ 
                                    Recepion.get(i).getGuestlnfo().boatTrip();} 
                                    catch(ArithmeticException e){ 
                                        System.out.println(e); 
                                    Recepion.get(i).getGuestlnfo().boatTrip(); 
                                    } 
                                }} 
                                    break;                                 
                                    case 3: 
                                        for(int i=0; i<Recepion.size(); i++){ 
                                if(Recepion.get(i).getNumberRoom()== numberRoom){Recepion.get(i).ShowWifi(numberRoom);}} 
                                    break; 
                                default:{ 
                                   System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); 
                                   System.out.println("\t\t Invalid input\n");    
                                   System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");} 
                            } 
                            break; 
                        case 3: 
                            for(int i=0; i<Recepion.size(); i++){ 
                                if(Recepion.get(i).getNumberRoom()== numberRoom){ 
                                    Recepion.get(i).showBill(); 
                                   if( compare.equals(Recepion.get(i))){ 
                                        System.out.println("\n\t\t********************************************************************************************************"); 
                                       System.out.println("\n\t\t  congratulations you are collecting 15 points and when you collect 50  points you win free night with us\n"); 
                                      System.out.println("\t\t**********************************************************************************************************"); 
                                   } 
                                    Recepion.get(i).checkout();    
                                    break; 
                                }} 
                            break; 
                        default:{ 
                               System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); 
                               System.out.println("\t\t Invalid input\n");    
                                System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");} 
                 
                    } 
          
                break;    
                default:  
                       System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); 
                       System.out.println("\t\t Invalid input\n"); 
                          System.out.println("\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"); 
            } 
                        
            System.out.print("\n\t\t ■  Is there another customer who wants to book or inquire? ");  
            String answer = input.next(); 
                System.out.println(""); 
            if("No".equalsIgnoreCase(answer)) repeate = false;


}while(repeate); 
        System.out.println(""); 
        System.out.println("        <<The List of Guest in this time and Visitors in resturant>>\n\n"); 
        for(Room r: Recepion){ 
            if(r.getStatusRoom()== true){System.out.println(r);             
            System.out.println("_________________________________________________________________\n\n"); 
        }} 
        System.out.println(resturant);        
    } 
    public static boolean validity(ArrayList <Room> array){ 
        for(int i=0; i<array.size(); i++){ 
           if( array.get(i).getStatusRoom() == false) 
               return false; 
        } 
        return true; 
    } 
    public static void bookRoom(ArrayList<Room> array, Guest guest, int in,int out){ 
        boolean flag = false; 
        for(int i=0; i<array.size(); i++){ 
            if(array.get(i).getStatusRoom()== false) {  
            array.get(i).booking(guest,in, out); 
            flag = true; 
            break;}}         
     if(flag == false)System.out.println("  Sorry we don't have availabe rooms\n ");                                             
    } 
    public static void validatetDate(int inDate,int chDate){ 
        if(chDate < inDate) 
            throw new ArithmeticException("  Invalid Dates!\n"); 
    }      
    public static void checkOrder(int order){ 
        if(order < 1 || order > 10) 
            throw new ArithmeticException("  This dish number doesn't exist in the menue!!\n"); 
    }    
}

package hotelsystem;
 /**
*
 * this class for show dishes and give number and price of dishes
 * @author  Owner
*/
public class Dish {
//  Data members 
    private int dishNumber; 
    private double dishPrice; 
    
    /**
     * default Constructs a new dish
     */
    public Dish(){}  
    
     /**
     *the number to be represented by the dish object.
     * Constructs to initialize
     * @param dishNumber of dish
     */
    public Dish(int dishNumber) { 
        this.dishNumber = dishNumber; 
    }
    
    /**
     *returns the number of dish
     * @return number of dish 
     */ 
    
    public int getDishNumber() {       
        return dishNumber; 
    }
    
     /**
     *set the number attribute 
     * @param dishNumber of dish
     */
    public void setDishNumber(int dishNumber) { 
        this.dishNumber = dishNumber; 
    }
    
    /**
    * returns the price of dish
    * @return dishPrice  
    */
    public double getDishPrice() { 
        return dishPrice; 
    }
    
    /**
    *set the price attribute
    * @param dishNumber price of dish
    */
    public void setDishPrice(int dishNumber) {    
      for(int row =1; row<Resturant.menu.length;row++){  
            if(row == dishNumber){  
               dishPrice = Integer.valueOf(Resturant.menu[row][5]);  
                 break;  
                }  
        }  
    }
    
    /**
    * to show Ingredients of dishes
    */
 public void showIngredients(){ 
 System.out.println("🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕 INGREDIENTS 🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕\n ");
 System.out.println("INSALATA DI CESARE SALAD: lettuce and parmesan cheese\n");
 System.out.println("MIMOSA SALAD: mozzarella-rocket-tuna-tomato-olives\n");
 System.out.println("MARGHERITA PIZZA: tomato-mozzarella-freash basil\n");
 System.out.println("PEPPERONI PIZZA: tomato-mozzarella-oregano and oepperoni\n"); 
 System.out.println("TORTELLI DI MARGO PASTA: mozzarella-spinach\n");
 System.out.println("RAVIOLI DI POLLO PASTA: mozzarella-cheackin\n");
 System.out.println("TERAMISO DESSERT: Vanilla-cream cheese-coffee-biscuit\n");
 System.out.println("TORTINO DESSERT: Chocolate cake with chocolate cream and vanilla ice cream\n");      
 System.out.println("PINA COLADA DRINK: Coconut milk with fresh pineapple\n"); 
 System.out.println("APPLE JUICE SPARKLING: Apple juice - sparkling\n"); 
                
     } 
 
    /**
     *returns a string representation of this dish.
     * @return str 
     */
    @Override 
    public String toString() {
    String str = "";
    for(int row=1; row < Resturant.menu.length; row++){
        if(dishNumber == row){
            str+= String.format("%-48s", Resturant.menu[row][1]);
            str+=Resturant.menu[row][5];      
        }
    }
    str+= "\n";
    return str;
          
     }   
    }



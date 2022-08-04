package Thursday;

public class Sandwich {

    //Properties of a sandwich
    String bread;
    String meat;
    String cheese;
    double price;
    int quantity;


    //outputs text of your order
    public void order() {
        if(meat != null) {
            System.out.println("You ordered a " + meat + " and " + cheese + " cheese sandwich on " + bread + " bread.");
        }
        else {
            System.out.println("You ordered a " + cheese + " cheese sandwich on " + bread + " bread.");
        }

    }

    //tells you how many sandwiches you bought
    public void amount() {
        if(quantity > 1) {
            System.out.println("You ordered " + quantity + " sandwiches.");
        }
        else {
            System.out.println("You ordered 1 sandwich.");
        }
    }

    //tells you the total price of your order
    public void total(){
         double total_price = quantity*price*1.06;
         System.out.println("Your total is " + total_price + ".");
    }

    // constructors to call sandwiches depending if ou want meat or not
    public Sandwich(String bread, String meat, String cheese, double price, int quantity){
         this.bread = bread;
         this.meat = meat;
         this.cheese= cheese;
         this.price = price;
         this.quantity = quantity;
    }

    public Sandwich(String bread, String cheese, double price, int quantity){
        this.bread = bread;
        this.cheese= cheese;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
        public boolean equals(Object obj) {

            if(!(obj instanceof Sandwich)) return false; // if our objects are not the same they are not equal
            Sandwich other = (Sandwich) obj; //casts to sandwich object
            if(!this.bread.equals(other.bread)) return false; //checks if bread is the same
            if(!this.meat.equals(other.meat)) return false; //checks if meats are the same
            if(!this.cheese.equals(other.cheese)) return false; // checks if cheese are the same
            if(this.price != other.price) return false; // checks if prices are the same
            if(this.quantity != other.quantity) return false; // cheese if you have the same amount
            return true;

    }
}

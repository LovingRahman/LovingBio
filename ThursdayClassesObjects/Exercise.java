package Thursday;

public class Exercise {
    public static void main(String[] args) {

        //define two sandwiches
        Sandwich ham_sandwich = new Sandwich("rye", "ham", "cheddar",4.89,2);
        Sandwich veggie_wich = new Sandwich("flat", "gouda", 3.59, 1);

        // output for the methods for ham sandwich
        ham_sandwich.order();
        ham_sandwich.amount();
        ham_sandwich.total();

        // output for the methods for veggie sandwich
        veggie_wich.order();
        veggie_wich.amount();
        veggie_wich.total();

        // checks if ham sandwich is equal to veggie sandwich
        System.out.println("Is a ham sandwich equal to a veggie sandwich: " + ham_sandwich.equals(veggie_wich));

        // checks if ham sandwich is equal to itself
        System.out.println("Is a ham sandwich equal to itself: " + ham_sandwich.equals(ham_sandwich));




    }
}

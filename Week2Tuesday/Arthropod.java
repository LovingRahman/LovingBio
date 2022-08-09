package Week2Tuesday;

public class Arthropod {

    private String name;
    private String diet;
    private String habitat;
    private int legs;
    private boolean flight;

    // defulat constructor
   public Arthropod(){
       this.name = null;
       this.diet = null;
       this.habitat = null;
       this.legs = 0;
       this.flight = false;
   }
    public Arthropod(String name, String diet, String habitat, int legs, boolean flight) {
        this.name = name;
        this.diet = diet;
        this.habitat = habitat;
        this.legs = legs;
        this.flight = flight;
    }
    // Don't know what the habitat is of the Arthropod
    public Arthropod(String name, String diet, int legs, boolean flight) {
        this.name = name;
        this.diet = diet;
        this.legs = legs;
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isFlight() {
        return flight;
    }

    public void setFlight(boolean flight) {
        this.flight = flight;
    }


    public void description(){

        System.out.println(name + " is a " + diet + " whose habitat is " + habitat + ". They have " + legs +" legs. Ability to fly? " + flight);

    }
}

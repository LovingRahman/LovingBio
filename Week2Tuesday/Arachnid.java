package Week2Tuesday;

public class Arachnid extends Arthropod{

    private String webtype;

    public Arachnid(String name, String diet, String habitat, int legs, boolean flight, String webtype){

        super(name,diet,habitat,legs,false);
        this.webtype = webtype;

    }


    public String getWebtype() {
        return webtype;
    }

    public void setWebtype(String webtype) {
        this.webtype = webtype;
    }

    @Override
    public void description(){

        System.out.println(getName() + " is a " + getDiet() + " whose habitat is " + getHabitat() + ". They have " + getLegs() +" legs. They make " + webtype + " type webs.");
    }
}

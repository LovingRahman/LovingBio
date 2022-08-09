package Week2Tuesday;

public class Exersise {

    public static void main(String[] args) {

        //test out constructor and method
        Arthropod ant = new Arthropod("Leafcutter ant", "fungivore", "forest", 6, false);
        ant.description();

        //test out overload constructor and method
        Arthropod beetle = new Arthropod("lady bug", "carnivore", 6,true);
        beetle.description();

        //test out Arachnid extension and override
        Arachnid spider = new Arachnid("Golden silk orbweaver", "carnivore","forest", 8, false, "orb");
        spider.description();




    }
}

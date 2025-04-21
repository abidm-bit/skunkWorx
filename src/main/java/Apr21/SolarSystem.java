package Apr21;

public class SolarSystem {



    private String name;
    private boolean planet;


    public void checkIfPlanet(String name,boolean tf){
        this.name=name;
        this.planet=tf;
        if (tf) { System.out.println(name + " iz a planet"); }
        else    System.out.println(name + " iz not a planet");
    }

    public SolarSystem(String name,boolean tf){
        checkIfPlanet(name,tf);
    }

    public static void main(String[] args) {
        new SolarSystem("Jupiter",true);
        new SolarSystem("Venus",true);
        new SolarSystem("Mercury",true);
        new SolarSystem("Pluto",false);
    }

}



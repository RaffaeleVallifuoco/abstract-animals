package it.java.abstractAnimals;

public class Cane extends Animali {

    protected String name;

    protected String verso;
    protected String dieta;

    public String getName() {
        return name;
    }

    public String getVerso() {
        return verso;
    }

    public String getDieta() {
        return dieta;
    }

    public Cane() {

        // String name = "Cane";
        // String verso = "Bauuuuuuuu";
        // String dieta = "Onnivoro";

        this.name = " Cane ";
        this.verso = "Bauuuuuuuuuuu";
        this.dieta = "Onnivoro";

    }

    /*
     * @Override
     * void dormi() {
     * 
     * }
     */

    @Override
    void verso() {

        // System.out.println("\n Io abbaio ( e forse mordo anche ). \n " + getVerso());

        System.out.println(String.format("\n Io abbaio (e forse mordo anche). \n %s ",
                getVerso()));

    }

    @Override
    void mangia() {

        System.out.println("\n Io mangio di tutto. Infatti ono  " + getDieta());

    }

    @Override
    void presentati() {

        System.out.println("\n Ciao, sono un " + getName());
    }

}

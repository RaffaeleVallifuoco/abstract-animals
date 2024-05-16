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
        this.verso = "BAUUUUUUUUUUUUU WOOFFF";
        this.dieta = "Onnivoro";

    }

    /*
     * @Override
     * void dormi() {
     * 
     * }
     */

    @Override
    protected void verso() {

        // System.out.println("\n Io abbaio ( e forse mordo anche ). \n " + getVerso());

        System.out.println(String.format("\n Io abbaio (e forse mordo anche). \n %s ",
                getVerso()));

    }

    @Override
    protected void mangia() {

        System.out.println("\n Io mangio di tutto. Infatti sono  " + getDieta());

    }

    @Override
    protected void presentati() {

        System.out.println("\n Ciao, sono un " + getName());
    }

    @Override

    public void faiVolare() {

        System.out.println("\n Io non volo :( ");

    }

}

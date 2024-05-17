package it.java.abstractAnimals;

public class Cane extends Animali implements Inuotante {

    public Cane() {

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

    public void nuota() {

        System.out.println("\n Sto nuotandoooooo ");

    }

}

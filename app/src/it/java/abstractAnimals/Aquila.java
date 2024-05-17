package it.java.abstractAnimals;

public class Aquila extends Animali implements IVolante {

    public Aquila() {

        this.name = " Aquila";
        this.verso = "KIAIIIIIIIII";
        this.dieta = "Carnivoro";

    }

    @Override
    protected void verso() {

        System.out.println(String.format("\n Io strido \n %s ", getVerso()));

    }

    @Override
    protected void mangia() {

        System.out.println("\n Io mangio volpi lepri e conigli. Sono " + getDieta());

    }

    @Override
    protected void presentati() {

        System.out.println("\n Ciao, sono un " + getName());
    }

    @Override

    public void vola() {

        System.out.println("\n Sto volandooooo ");

    }

}

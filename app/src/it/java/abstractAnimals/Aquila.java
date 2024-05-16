package it.java.abstractAnimals;

public class Aquila extends Animali {

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

    public void faiNuotare() {

        System.out.println("\n Io non nuoto :( ");

    }

}

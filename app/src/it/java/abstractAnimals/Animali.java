package it.java.abstractAnimals;

public abstract class Animali implements Special {

    // proprietà

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

    // costruttore

    public Animali() {

    }

    // metodi

    protected void dormi() {

        System.out.println(" \n Vado a nanna.... ciaooooo \n Zzzzzzzzzzzz \n\n\n ");

    }

    public void faiNuotare() {

        System.out.println("\n Io nuotoooooo");

    }

    public void faiVolare() {

        System.out.println("\n Io volooooooo)");

    }

    protected abstract void verso();

    protected abstract void mangia();

    protected abstract void presentati();

}

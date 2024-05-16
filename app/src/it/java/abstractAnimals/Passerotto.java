package it.java.abstractAnimals;

public class Passerotto extends Animali {

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

    public Passerotto() {

        this.name = " Der Himmel";
        this.verso = "SE E' POKER, CA**O DICO, BRISCOLA";
        this.dieta = "Vegano ma mi piacciono i vermi";

    }

    @Override
    protected void verso() {

        System.out.println(String.format("\n Io pigolo \n %s ", getVerso()));

    }

    @Override
    protected void mangia() {

        System.out.println("\n Io mangio frutta fresca e secca. Sono " + getDieta());

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

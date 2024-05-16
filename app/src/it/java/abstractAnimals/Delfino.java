package it.java.abstractAnimals;

public class Delfino extends Animali {

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

    public Delfino() {

        this.name = "Dufour";
        this.verso = "(sono anto senza corde vocali. Sorry :(  )";
        this.dieta = "Pescivoro";

    }

    @Override
    protected void verso() {

        System.out.println(String.format("\n Io sfiato \n %s ", getVerso()));

    }

    @Override
    protected void mangia() {

        System.out.println("\n Io mangio caramelle, pesci e molluschi. Sono " + getDieta());

    }

    @Override
    protected void presentati() {

        System.out.println("\n Ciao, sono un " + getName());
    }

    @Override

    public void faiVolare() {

        System.out.println("\n Salto molto in alto ma non so volare ");

    }

}

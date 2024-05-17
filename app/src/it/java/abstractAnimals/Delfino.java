package it.java.abstractAnimals;

public class Delfino extends Animali implements Inuotante {

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

    public void nuota() {

        System.out.println("\n Sto nuotandoooooo ");

    }

}

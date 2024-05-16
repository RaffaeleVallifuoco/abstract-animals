package it.java.abstractAnimals;

public class Main {
    public static void main(String[] args) {

        Animali cane = new Cane();

        cane.presentati();
        cane.verso();
        cane.mangia();
        cane.faiNuotare();
        cane.faiVolare();
        cane.dormi();

        Animali dufour = new Delfino();

        dufour.presentati();
        dufour.verso();
        dufour.mangia();
        dufour.faiNuotare();
        dufour.faiVolare();
        dufour.dormi();

        Animali passerottino = new Passerotto();

        passerottino.presentati();
        passerottino.verso();
        passerottino.mangia();
        passerottino.faiNuotare();
        passerottino.faiVolare();
        passerottino.dormi();

        Animali aquila = new Aquila();

        aquila.presentati();
        aquila.verso();
        aquila.mangia();
        aquila.faiNuotare();
        aquila.faiVolare();
        aquila.dormi();

    }

}

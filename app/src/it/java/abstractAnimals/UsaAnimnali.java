package it.java.abstractAnimals;

public class UsaAnimnali {

    public static void main(String[] args) {

        Inuotante cane = new Cane();
        faiNuotare(cane);

        Inuotante delfino = new Delfino();
        faiNuotare(delfino);

        IVolante aquila = new Aquila();
        faiVolare(aquila);

        IVolante passerottIVolante = new Passerotto();
        faiVolare(passerottIVolante);
    }

    public static void faiNuotare(Inuotante animale) {

        animale.nuota();
    }

    public static void faiVolare(IVolante animale) {

        animale.vola();

    }

}

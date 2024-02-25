package Exo1;

public class Fabrique extends Village {
    private static final int Capacite = 20;
    private static final int Pdv = 40;

    // Méthode pour créer un nouveau paysan
    public static Roturier creerPaysan() {
        return new Roturier(Capacite, Pdv);
    }

    // Méthode pour créer un nouveau village
    public static Village creerVillage() {
        return new Village();
    }
}

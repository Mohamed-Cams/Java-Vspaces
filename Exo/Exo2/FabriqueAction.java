package Exo2;

import java.util.ArrayList;
import java.util.List;

class FabriqueAction {
    private List<Action> liste;

    public FabriqueAction() {
        liste = new ArrayList<>();
        // Initialisez la liste avec toutes les actions possibles
        liste.add(new AchatPaysan());
        liste.add(new Impot());
        liste.add(new FinTour());
    }

    public boolean actionCorrecte(String nom) {
        for (Action action : liste) {
            if (action.nom.equals(nom)) {
                return true;
            }
        }
        return false;
    }

    public Action creer(String nom) {
        for (Action action : liste) {
            if (action.nom.equals(nom)) {
                return action;
            }
        }
        return null;
    }
}
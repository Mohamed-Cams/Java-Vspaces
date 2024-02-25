package Exo2;

import java.util.ArrayList;
import java.util.List;

abstract class Action {
    protected int cout;
    protected String nom;

    public Action(int cout, String nom) {
        this.cout = cout;
        this.nom = nom;
    }

    public abstract void action(Royaume r, Fabrique f);
}

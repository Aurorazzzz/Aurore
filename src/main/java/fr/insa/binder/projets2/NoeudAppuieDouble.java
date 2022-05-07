/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

/**
 *
 * @author Aurore
 */
public class NoeudAppuieDouble extends NoeudAppuie {

    public NoeudAppuieDouble(double nx, double ny, int id, Vecteur2D fc) {
        super(nx, ny, id, fc);
        this.setType(3);
    }

    public NoeudAppuieDouble(double nx, double ny, Vecteur2D fc) {
        super(nx, ny, fc);
        this.setType(3);

    }

    public NoeudAppuieDouble(double nx, double ny) {
        super(nx, ny);
        this.setType(3);

    }

    public NoeudAppuieDouble() {
        super();
        this.setType(3);

    }

    @Override
    public String toString() {
        return "Noeud Appuie Double : (" + this.getNx() + " ; " + this.getNy() + " ; " + this.getId() + " ; (" + this.getFc() + "))";
    }

}

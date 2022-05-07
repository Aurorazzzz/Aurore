/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

/**
 *
 * @author Aurore
 */
public abstract class NoeudAppuie extends Noeud {

    private Vecteur2D reac;

    public Vecteur2D getReac() {
        return this.reac;
    }

    public void setReac(Vecteur2D reac) {
        this.reac = reac;
    }

    public NoeudAppuie(double nx, double ny, int id, Vecteur2D fc) {
        super(nx, ny, id, fc);
    }

    public NoeudAppuie(double nx, double ny, Vecteur2D fc) {
        super(nx, ny, fc);
    }

    public NoeudAppuie(double nx, double ny) {
        super(nx, ny);
    }

    public NoeudAppuie() {
        super();
    }
}

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

    public NoeudAppuie(double nx, double ny, int id, Vecteur2D fc, Vecteur2D ter) {
        super(nx, ny, id, fc);
        this.setTer(ter);
    }

    public NoeudAppuie(double nx, double ny, int id, Vecteur2D fc) {
        super(nx, ny, id, fc);
    }

    public NoeudAppuie(double nx, double ny, Vecteur2D fc) {
        super(nx, ny, fc);
        this.setTer(new Vecteur2D(1, 0));
    }

    public NoeudAppuie(double nx, double ny) {
        super(nx, ny);
        this.setTer(new Vecteur2D(1, 0));
    }

    public NoeudAppuie() {
        super();
        this.setTer(new Vecteur2D(1, 0));
    }

//        public Vecteur2D Normale() {
//        Vecteur2D n = new Vecteur2D();
//        n.setVy(-this.getTer().getVx());
//        n.setVx(this.getTer().getVy()) ;
//        return n;
//    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

/**
 *
 * @author Aurore
 */
public class NoeudAppuieSimple extends NoeudAppuie {

    public NoeudAppuieSimple(double nx, double ny, int id, Vecteur2D fc) {
        super(nx, ny, id, fc);
        this.setType(2);
    }

    public NoeudAppuieSimple(double nx, double ny, Vecteur2D fc) {
        super(nx, ny, fc);
        this.setType(2);
    }

    public NoeudAppuieSimple(double nx, double ny) {
        super(nx, ny);
        this.setType(2);
    }

    public NoeudAppuieSimple() {
        super();
        this.setType(2);
    }

    @Override
    public String toString() {
        return "Noeud Appuie Simple : ((" + this.getNx() + " ; " + this.getNy() + ") ;  " + this.getId() + " ; (" + this.getFc() + ") ; Reaction sur X : " + this.getReacX() + " ; Reaction sur Y : " + this.getReacY() + ")";

    }

//    public static void main(String[] args) {
//        Noeud n = new NoeudAppuieSimple(0, 0);
//        Vecteur2D q = new Vecteur2D();
//        q = n.Normale();
//        System.out.println(q.toString());
//    }
}

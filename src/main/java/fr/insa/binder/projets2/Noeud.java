/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

import fr.insa.binder.projets2.utils.Lire;

/**
 *
 * @author Aurore
 */
public abstract class Noeud {

    private double nx;
    private double ny;
    private int id;
    private Vecteur2D fc;

    public double getNx() {
        return this.nx;
    }

    public void setNx(double nx) {
        this.nx = nx;
    }

    public double getNy() {
        return this.ny;
    }

    public void setNy(double ny) {
        this.ny = ny;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vecteur2D getFc() {
        return this.fc;
    }

    public void setFc(Vecteur2D fc) {
        this.fc = fc;
    }

    public Noeud(double nx, double ny, int id, Vecteur2D fc) {
        this.nx = nx;
        this.fc = fc;
        this.id = id;
        this.ny = ny;
    }

    public Noeud(double nx, double ny, Vecteur2D fc) {
        this (nx, ny, -1, fc); 
    }

    public Noeud(double nx, double ny) {
        this (nx, ny, -1, new Vecteur2D(0, 0));
    }
    
    public Noeud() {
        this (0, 0, -1, new Vecteur2D(0, 0));
    }

    @Override
    public String toString() {
        return "(" + this.nx + " ; " + this.ny + " ; " + this.id + " ; (" + this.fc + ")";
    }

    // Probleme
    public Noeud entreeNoeud() { 
        System.out.println("Enter 1 pour un NoeudSimple, 2 pour un NoeudAppuieSimple et 3 pour un NoeudAppuieDouble");
        int t = Lire.i();
        while (t < 1 && t>3){
            System.out.println("Entrer 1, 2 ou 3");
            t = Lire.i();
        } 
        double x = Lire.d();
        double y = Lire.d();
        Noeud n;
        if (t == 1){
//            n.fc = entreeVect();
             n = new NoeudSimple(x, y, -1, new Vecteur2D());    
       }
        if (t == 2){
//            new Vecteur2D fc = entreeVect();
             n = new NoeudAppuieSimple(x, y, -1, new Vecteur2D());    
       }
        else {
//            n.fc = entreeVect();
             n = new NoeudAppuieDouble(x, y, -1, new Vecteur2D());    
       }
    System.out.println(n.getClass());
    return n; 
    }
// public void Test(){
//        Noeud n2 = new NoeudSimple ();
//        n2 = entreeNoeud();
//        System.out.println(n2.toString());
//
//    }
//
//    public void main(String[] args) {
//       Test();
//    }
}
    

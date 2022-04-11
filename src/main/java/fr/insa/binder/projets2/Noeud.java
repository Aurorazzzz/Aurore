/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

import fr.insa.binder.projets2.utils.Lire;
import java.util.ArrayList;

/**
 *
 * @author Aurore
 */
public abstract class Noeud {

    private double nx;
    private double ny;
    private int id;
    private Vecteur2D fc;
    private ArrayList<Barre> bDep;
    private ArrayList<Barre> bArr;

    public ArrayList<Barre> getbDep() {
        return bDep;
    }

    public ArrayList<Barre> getbArr() {
        return bArr;
    }

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
        this.bArr = new ArrayList<>();
        this.bDep = new ArrayList<>();
//        this.bArr = new ArrayList<Barre> (); ?????
    }

    public Noeud(double nx, double ny, Vecteur2D fc) {
        this(nx, ny, -1, fc);
    }

    public Noeud(double nx, double ny) {
        this(nx, ny, -1, new Vecteur2D(0, 0));
    }

    public Noeud() {
        this(0, 0, -1, new Vecteur2D(0, 0));
    }

    @Override
    public String toString() {
        return "(" + this.nx + " ; " + this.ny + " ;  " + this.id + " ; (" + this.fc + ")";
    }

    public boolean egal(Noeud n) {
        if ((this.nx == n.nx) && (this.ny == n.ny)) {
            return true;
        } else {
            return false;
        }
    }

    // Probleme
    public Noeud entreeNoeud() {
        System.out.println("Enter 1 pour un NoeudSimple, 2 pour un NoeudAppuieSimple et 3 pour un NoeudAppuieDouble");
        int t = Lire.i();
        while (t < 1 && t > 3) {
            System.out.println("Entrer 1, 2 ou 3");
            t = Lire.i();
        }
        System.out.println("Entrer x");
        double x = Lire.d();
        System.out.println("Entrer y");
        double y = Lire.d();
        System.out.println("Entrer x Vecteur");
        long vx = Lire.l();
        System.out.println("Entrer y Vecteur");
        long vy = Lire.l();
        Noeud n;
        switch (t) {
            case 1: {
                n = new NoeudSimple(x, y, -1, new Vecteur2D(vx, vy));
                break;
            }

            case 2: {
                n = new NoeudAppuieSimple(x, y, -1, new Vecteur2D(vx, vy));
                break;
            }
            default: {
                n = new NoeudAppuieDouble(x, y, -1, new Vecteur2D(vx, vy));
            }
        }
        System.out.println(n.getClass());
        return n;
    }

    public void BarreIncidente() {
        System.out.println("Barre Arrivées :");
        int n = this.bArr.size();
        for (int i = 0; i < n; i++) {
            System.out.println(this.bArr.get(i));
        }
        System.out.println("Barre Depart :");
        int k = this.bDep.size();
        for (int i = 0; i < k; i++) {
            System.out.println(this.bDep.get(i));
        }
    }
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


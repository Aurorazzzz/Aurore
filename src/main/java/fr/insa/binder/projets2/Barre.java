/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

import static java.lang.Math.abs;
import static java.lang.Math.atan;
import static java.lang.Math.sin;
import static java.lang.Math.toDegrees;

/**
 *
 * @author Aurore
 */
public class Barre {

    //** tm = traction maximal, cm = compression maximal, ctm = cout au mètre
    private Noeud nd;
    private Noeud na;
    private double tm;
    private double cm;
    private double ctm;
    private int id;
    private int type;
    private double tens;
//    private Vecteur2D tens;
    

    /**
     * @return the nd
     */
    public Noeud getNd() {
        return nd;
    }

    /**
     * @param nd the nd to set
     */
    public void setNd(Noeud nd) {
        this.nd = nd;
        if (nd.getbDep().contains(this) == false) {
            nd.getbDep().add(this);
        }
    }

    /**
     * @return the na
     */
    public Noeud getNa() {
        return na;
    }

    /**
     * @param na the na to set
     */
    public void setNa(Noeud na) {
        this.na = na;
        if (na.getbDep().contains(this) == false) {
            na.getbArr().add(this);
        }
    }

    /**
     * @return the tm
     */
    public double getTm() {
        return tm;
    }

    /**
     * @param tm the tm to set
     */
    public void setTm(double tm) {
        this.tm = tm;
    }

    /**
     * @return the cm
     */
    public double getCm() {
        return cm;
    }

    /**
     * @param cm the cm to set
     */
    public void setCm(double cm) {
        this.cm = cm;
    }

    /**
     * @return the ctm
     */
    public double getCtm() {
        return ctm;
    }

    /**
     * @param ctm the ctm to set
     */
    public void setCtm(double ctm) {
        this.ctm = ctm;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public Barre(int id, Noeud nd, Noeud na, double tm, double cm, double ctm) {
        this.id = id;
        this.nd = nd;
        this.na = na;
        this.tm = tm;
        this.cm = cm;
        this.ctm = ctm;
        this.tens = 0;
        if (nd.getbDep().contains(this) == false) {
            nd.getbDep().add(this);
        }
        if (na.getbDep().contains(this) == false) {
            na.getbArr().add(this);
        }
        this.type = this.type();
    }

    public Barre(Noeud nd, Noeud na) {
        this(0, nd, na, 0, 0, 0);
    }

    public Barre() {
        this(0, new NoeudSimple(), new NoeudSimple(), 0, 0, 0);
    }

    @Override
    public String toString() {
        return "Barre : (" + this.id + " ; (" + this.nd + ") ;  (" + this.na + ") ; " + this.tm + " ; " + this.cm + " ; " + this.ctm + " ; Tension : " + this.tens+ ")";
    }

    public int type(){
        if ((this.na.getType() == 3 || this.na.getType() == 2) && (this.nd.getType() == 3 || this.nd.getType() == 2)){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public Noeud noeudOppose(Noeud n) {
        if (this.nd.egal(n) == true) {
            return this.na;
        } else if (this.na.egal(n) == true) {
            return this.nd;
        } else {
            System.out.println("Ce noeud ne fait pas parti de la barre");
            return n;
        }

    }

    public double angle(Noeud nd) {
        Noeud na = this.noeudOppose(nd);
        double x = na.getNx() - nd.getNx();
        double y = na.getNy() - nd.getNy();
        double ang = toDegrees(atan(abs(y / x)));
        if ((y >= 0) && (x >= 0)) {
            return ang;
        } else if ((y < 0) && (x > 0)) {
            return -ang;
        } else if ((y <= 0) && (x <= 0)) {
            return ang - 180;
        } else {
            return 180 - ang;
        }

    }
    
//        public double angle(Noeud nd) {
//        Noeud na = this.noeudOppose(nd);
//        double x = na.getNx() - nd.getNx();
//        double y = na.getNy() - nd.getNy();
//        double ang = toDegrees(atan(abs(y / x)));
//        if ((y >= 0) && (x >= 0)) {
//            return ang;
//        } else if ((y < 0) && (x > 0)) {
//            return -ang;
//        } else if ((y <= 0) && (x <= 0)) {
//            return ang - (Math.PI);
//        } else {
//            return (Math.PI) - ang;
//        }
//
//    }

    public static void main(String[] args) {
        Noeud nd = new NoeudSimple(0, 0);
        Noeud na = new NoeudSimple(5, 0);
        Barre b = new Barre(0, nd, na, 0, 0, 0);
        double d = b.angle(na);
        System.out.println(d);
        double ang = Math.toRadians(d);
        double cos = sin(ang);
        System.out.println(ang + "   " + cos);
        double z = na.coefyb(b);
        System.out.println(z);
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the tens
     */
    public double getTens() {
        return tens;
    }

    /**
     * @param tens the tens to set
     */
    public void setTens(double tens) {
        this.tens = tens;
    }
}

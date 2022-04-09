/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

import static java.lang.Math.abs;
import static java.lang.Math.atan;
import static java.lang.Math.toDegrees;

/**
 *
 * @author Aurore
 */
public class Barre {

    private Noeud nd;
    private Noeud na;
    private double tm;
    private double cm;
    private double ctm2;
    private int id;

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
     * @return the ctm2
     */
    public double getCtm2() {
        return ctm2;
    }

    /**
     * @param ctm2 the ctm2 to set
     */
    public void setCtm2(double ctm2) {
        this.ctm2 = ctm2;
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

    public Barre(int id, Noeud nd, Noeud na, double tm, double cm, double ctm2) {
        this.id = id;
        this.nd = nd;
        this.na = na;
        this.tm = tm;
        this.cm = cm;
        this.ctm2 = ctm2;
    }

    @Override
    public String toString() {
        return "Barre : (" + this.id + " ; (" + this.nd + ") ;  (" + this.na + ") ; " + this.tm + " ; " + this.cm + " ; " + this.ctm2 + ")";
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
    
    public double angle(Noeud nd){
        Noeud na = this.noeudOppose(nd);
        double x = na.getNx() - nd.getNx();
        double y = na.getNy() - nd.getNy();
        double ang = toDegrees(atan(abs(y/x)));
        if ((y >= 0)&&(x>=0)){
            return ang;
        }
        else if ((y < 0)&&(x>0)){
            return -ang;
        }
        else if ((y <= 0)&&(x <= 0)){
            return ang - 180;
        }
        else {
            return 180 - ang;
        }
                
    }
}

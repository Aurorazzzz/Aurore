/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Aurore
 */
public class Treillis {

    private ArrayList<Noeud> LN;
    private ArrayList<Barre> LB;

    public ArrayList<Noeud> getLN() {
        return LN;
    }

    public ArrayList<Barre> getLB() {
        return LB;
    }

    public void setLN(ArrayList<Noeud> LN) {
        this.LN = LN;
    }

    public void setLB(ArrayList<Barre> LB) {
        this.LB = LB;
    }

    public Treillis(ArrayList<Noeud> LN, ArrayList<Barre> LB) {
        this.LN = LN;
        this.LB = LB;
    }

    @Override
    public String toString() {
        return "Treillis{" + "LN=" + this.LN + ", LB=" + this.LB + '}';
    }

    public int maxIdNoeud() {
        if (this.LN == null) {
            return 0;
        } else {
            int n = this.LN.size();
            int max = this.LN.get(0).getId();
            for (int i = 0; i < n; i++) {
                if (this.LN.get(i).getId() > max) {
                    max = this.LN.get(i).getId();
                }
            }
            return max;
        }
    }
        public int maxIdBarre() {
        if (this.LB == null) {
            return 0;
        } else {
            int n = this.LB.size();
            int max = this.LB.get(0).getId();
            for (int i = 0; i < n; i++) {
                if (this.LB.get(i).getId() > max) {
                    max = this.LB.get(i).getId();
                }
            }
            return max;
        }
    }
    }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

/**
 *
 * @author Elève
 */
public class Matrice {

    private int c;
    private int l;
    private double[][] coef;

    public Matrice(int l, int c) {
        this.coef = new double[l][c];
        for (int i = 0; i < l; i++) {
            for (int k = 0; k < c; k++) {
                this.coef[i][k] = 0;
            }
        }
        this.c = c;
        this.l = l;
    }

    @Override
    public String toString() {
        for (int i = 0; i < l; i++) {
            for (int k = 0; k < c; k++) {
                System.out.print(String.format("%+4.2E", this.coef[i][k]));
            }
            System.out.println();
        }
        return "bof";
    }
    public static void main(String[] args) {
        Matrice m = new Matrice(4, 7);
        m.set (0, 0, 9);
        String s = m.toString();
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
    
    public double get(int i, int j){
        return this.coef [i][j];
    }
    
    public void set(int i, int j, double x){
        this.coef [i][j] = x;
    }
}

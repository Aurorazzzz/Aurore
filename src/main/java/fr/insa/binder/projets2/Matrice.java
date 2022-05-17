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
//
//    private int c;
//    private int l;
//    private double[][] coef;

//    public Matrice(int l, int c) {
//        this.coef = new double[l][c];
//        for (int i = 0; i < l; i++) {
//            for (int k = 0; k < c; k++) {
//                this.coef[i][k] = 0;
//            }
//        }
//        this.c = c;
//        this.l = l;
//    }
//
//    @Override
//    public String toString() {
//        for (int i = 0; i < l; i++) {
//            for (int k = 0; k < c; k++) {
//                System.out.print(String.format("%+4.2E", this.coef[i][k]) + "   ");
////                System.out.print("   " + this.coef[i][k]);
//            }
//            System.out.println();
//        }
//        return "bof";
//    }
//
////    public static void main(String[] args) {
////        Matrice m = new Matrice(4, 7);
////        m.set(0, 0, 9);
////        String s = m.toString();
////    }
//
//    public int getC() {
//        return c;
//    }
//
//    public void setC(int c) {
//        this.c = c;
//    }
//
//    public int getL() {
//        return l;
//    }
//
//    public void setL(int l) {
//        this.l = l;
//    }
//
//    public double get(int i, int j) {
//        return this.coef[i][j];
//    }
//
//    public void set(int i, int j, double x) {
//        this.coef[i][j] = x;
//    }
//
//    public static void main(String[] args) {
//        Matrice m = new Matrice(5, 5);
//        m.set(1, 1, 5);
//        m.set(0, 0, 9);
//
//        m.toString();
//
//    }
//    
    
    
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

        public static void main(String[] args) {
        //Matrice m = new Matrice(5, 5);
        //m.set(1, 1, 5);
        //m.set(0, 0, 9);
        double[][] coefs = {{1, 4, 1, 3,3}, {1, 2, -1, 4,-1}, {3, 1, 2, 1,9}};
        double[][] coefs2 = {{0, 1, 2, 1}, {3, 4, 5, 2}, {6, 7, 8, 3}};
        double[][] coefs3 = {{0, 1, 2, 1}, {3, -4, 5, 2}, {6, 7, -8, 3}};
        double[][] coefs4 = {{0.707, 0, 0, 1, 0, 0, 0},{-0.707, 0, -1, 0, 1, 0, 0},{0, 0.707, 0, 0, 0, 1, 0},{0, 0.707, 1, 0, 0, 0, 0},{-0.707, -0.707, 0, 0, 0, 0, 0},{0.707, -0.707, 0, 0, 0, 0, 1000}};
        Matrice mat = new Matrice(coefs4.length, coefs4[0].length);
        mat.setAll(coefs4);
        System.out.println("matrice :");
        System.out.println(mat.toString());
        mat.descenteDeGauss();
        System.out.println("matrice après descente de Gauss:");
        System.out.println(mat.toString());
        Matrice m = mat.remonteeGauss();
        System.out.println("matrice après remontée de Gauss:");
        System.out.println(mat.toString());


    }

    public Matrice remonteeGauss() {
        int rang = rang();
        for (int ligne = 0; ligne < rang; ligne++) {
            double coefDediv = coef[ligne][ligne];
            for (int col = ligne; col < c; col++) {
                double nouveauCoef = coef[ligne][col] / coefDediv;
                set(ligne, col, nouveauCoef);
            }
        }
        System.out.println(toString());
        transvectionRemontee(rang);
        System.out.println(toString());
        return this;
    }

    public void transvectionRemontee(int rang) {
        int nbLigne = l;
        int nbColonne = c;
        for (int liRef = rang - 1; liRef > 0; liRef--) {
            double[] ligneRef = coef[liRef];
            for (int liMod = liRef - 1; liMod >= 0; liMod--) {
                double[] ligneModif = coef[liMod];
                double coefDemult = ligneModif[liRef];
                for (int col = liMod; col < nbColonne; col++) {
                    double nouveauCoef = ligneModif[col] - coefDemult * ligneRef[col];
                    set(liMod, col, nouveauCoef);
                }
            }
        }
        System.out.println(toString());
    }

    public void descenteDeGauss() {

        for (int nbLigne = 0; nbLigne < coef.length; nbLigne++) {

            int li;
            li = lignePlusGrandPivot(nbLigne);
            permutLigne(li, nbLigne);
            System.out.println(toString());
            transvection(nbLigne);
            System.out.println(toString());
        }

    }


    public int rang() {
        int count = 0;
        for (int diagonale = 0; diagonale < coef.length; diagonale++) {
            if (coef[diagonale][diagonale] != 0)
                count++;
        }
        return count;
    }

    public int lignePlusGrandPivot(int col) {
        double max = coef[col][col];
        int plusGrandPivot = col;
        for (int ligne = col; ligne < coef.length; ligne++) {
            if (coef[ligne][col] > max) {
                max = coef[col][col];
                plusGrandPivot = ligne;
            }

        }
        return plusGrandPivot;
    }

    public void permutLigne(int li1, int li2) {
        double[] coefs1 = coef[li1];
        double[] coefs2 = coef[li2];
        int length = coefs1.length;
        for (int i = 0; i < length; i++) {
            double c1 = coefs1[i];
            double c2 = coefs2[i];
            set(li1, i, c2);
            set(li2, i, c1);

        }
    }

    public void transvection(int ligne) {
        int nbLigne = coef.length;
        int nbColonne = coef[0].length;

        double[] ligneRef = coef[ligne];
        for (int li = ligne + 1; li < nbLigne; li++) {
            double[] ligneModif = coef[li];
            double coefDemult = ligneModif[ligne] / ligneRef[ligne];
            for (int col = ligne; col < nbColonne; col++) {
                double nouveauCoef = ligneModif[col] - coefDemult * ligneRef[col];
                set(li, col, nouveauCoef);
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < l; i++) {
            s = s + "[";
            for (int k = 0; k < c; k++) {
                if (k != c - 1)
                    s += String.format("%+4.2E", coef[i][k]) + " ";
                else
                    s += String.format("%+4.2E", coef[i][k]);
            }
            s += "] \n";
        }
        return s;

    }

//    public static void main(String[] args) {
//        Matrice m = new Matrice(4, 7);
//        m.set(0, 0, 9);
//        String s = m.toString();
//    }

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

    public double get(int i, int j) {
        return this.coef[i][j];
    }

    public void set(int i, int j, double x) {
        this.coef[i][j] = x;
    }

    public void setAll(double[][] mat) {
        for (int ligne = 0; ligne < l; ligne++) {
            for (int colonne = 0; colonne < c; colonne++) {
                set(ligne, colonne, mat[ligne][colonne]);
            }
        }
    }
}

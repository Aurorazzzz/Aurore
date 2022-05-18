/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

//import static java.lang.Math.cos;
/**
 *
 * @author Aurore
 */
public class Test {

    public static void Treillis1() {

        Treillis T = new Treillis();
        Noeud n1 = new NoeudAppuieSimple(4, 0, new Vecteur2D(0, 0));
        Noeud n2 = new NoeudSimple(0, 0, new Vecteur2D(3, 4));
        Noeud n3 = new NoeudAppuieDouble(2, 0, new Vecteur2D(0, 0));
        Noeud n4 = new NoeudSimple(1, 2, new Vecteur2D(9, 7));
        Noeud n5 = new NoeudSimple(3, 2, new Vecteur2D(0, 0));
        Noeud n6 = new NoeudAppuieSimple(4, 0, new Vecteur2D(0, 0));
        T.ajouteNoeud(n1);
        T.ajouteNoeud(n2);
        T.ajouteNoeud(n3);
        T.ajouteNoeud(n4);
        T.ajouteNoeud(n5);
        T.ajouteNoeud(n6);
        Barre b1 = new Barre(n1, n3);
        Barre b2 = new Barre(n2, n3);
        Barre b3 = new Barre(n2, n4);
        Barre b4 = new Barre(n4, n3);
        Barre b5 = new Barre(n3, n5);
        Barre b6 = new Barre(n4, n5);
        Barre b7 = new Barre(n5, n1);
        Barre b8 = new Barre(n5, n1);
        T.ajouteBarre(b1);
        T.ajouteBarre(b2);
        T.ajouteBarre(b3);
        T.ajouteBarre(b4);
        T.ajouteBarre(b5);
        T.ajouteBarre(b6);
        T.ajouteBarre(b7);
        T.ajouteBarre(b8);
        Matrice m = T.defM();
        T.Affiche();
    }

    public static void Treillis2() {
        Treillis T = new Treillis();
        Noeud n1 = new NoeudAppuieSimple(4, 0, new Vecteur2D(0, 0));
        Noeud n2 = new NoeudAppuieSimple(0, 0, new Vecteur2D(3, 4));
        Noeud n3 = new NoeudAppuieSimple(2, 0, new Vecteur2D(0, 0));
        Noeud n4 = new NoeudSimple(1, 2, new Vecteur2D(9, 7));
        Noeud n5 = new NoeudSimple(3, 2, new Vecteur2D(0, 0));
        T.ajouteNoeud(n1);
        T.ajouteNoeud(n2);
        T.ajouteNoeud(n3);
        T.ajouteNoeud(n4);
        T.ajouteNoeud(n5);
        Barre b1 = new Barre(n1, n3);
        Barre b2 = new Barre(n2, n3);
        Barre b3 = new Barre(n2, n4);
        Barre b4 = new Barre(n4, n3);
        Barre b5 = new Barre(n3, n5);
        Barre b6 = new Barre(n4, n5);
        Barre b7 = new Barre(n5, n1);
        T.ajouteBarre(b1);
        T.ajouteBarre(b2);
        T.ajouteBarre(b3);
        T.ajouteBarre(b4);
        T.ajouteBarre(b5);
        T.ajouteBarre(b6);
        T.ajouteBarre(b7);
        Matrice m = T.defM();
        T.Affiche();

    }

    public static void Treillis4() {
        Treillis T = new Treillis();
        Noeud n1 = new NoeudAppuieDouble(0, 2, new Vecteur2D(0, 0));
        Noeud n2 = new NoeudAppuieSimple(0, 0, new Vecteur2D(0, 0));
        Vecteur2D v = new Vecteur2D(0, 1);
        n2.setTer(v);
        Noeud n3 = new NoeudSimple(1, 1, new Vecteur2D(0, -1000));
        T.ajouteNoeud(n1);
        T.ajouteNoeud(n2);
        T.ajouteNoeud(n3);
        Barre b1 = new Barre(n1, n2);
        Barre b2 = new Barre(n2, n3);
        Barre b3 = new Barre(n1, n3);
        T.ajouteBarre(b1);
        T.ajouteBarre(b2);
        T.ajouteBarre(b3);
        Matrice m = T.defM();
        T.Affiche();
    }

    public static void Treillis3() {
        Treillis T = new Treillis();
        Noeud n1 = new NoeudAppuieDouble(0, 0, new Vecteur2D(0, 0));
        Noeud n2 = new NoeudAppuieSimple(2, 0, new Vecteur2D(0, 0));
        Noeud n3 = new NoeudSimple(1, 1, new Vecteur2D(1000, 0));
        T.ajouteNoeud(n1);
        T.ajouteNoeud(n2);
        T.ajouteNoeud(n3);
        Barre b1 = new Barre(n1, n2);
        Barre b2 = new Barre(n2, n3);
        Barre b3 = new Barre(n1, n3);
        T.ajouteBarre(b1);
        T.ajouteBarre(b2);
        T.ajouteBarre(b3);
        Matrice m = T.defM();
        T.Affiche();
//        System.out.println("matrice :");
//        System.out.println(m.toString());
//        m.descenteDeGauss();
//        System.out.println("matrice après descente de Gauss:");
//        System.out.println(m.toString());
//        m = m.remonteeGauss();
//        System.out.println("matrice après remontée de Gauss:");
//        System.out.println(m.toString());

    }

    public static void Treillis5() {
        Treillis T = new Treillis();
        Noeud n1 = new NoeudAppuieDouble(0, 0, new Vecteur2D(0, 0));
        Noeud n2 = new NoeudSimple(2, 0, new Vecteur2D(0, -1000));
        Noeud n3 = new NoeudAppuieDouble(0, 2, new Vecteur2D(0, 0));
        Noeud n4 = new NoeudSimple(2, 2, new Vecteur2D(9, 7));
        Noeud n5 = new NoeudSimple(4, 2, new Vecteur2D(0, 0));
        T.ajouteNoeud(n1);
        T.ajouteNoeud(n2);
        T.ajouteNoeud(n3);
        T.ajouteNoeud(n4);
        T.ajouteNoeud(n5);
        Barre b1 = new Barre(n1, n2);
        Barre b2 = new Barre(n1, n4);
        Barre b3 = new Barre(n2, n4);
        Barre b4 = new Barre(n2, n5);
        Barre b5 = new Barre(n4, n5);
        Barre b6 = new Barre(n4, n3);
        T.ajouteBarre(b1);
        T.ajouteBarre(b2);
        T.ajouteBarre(b3);
        T.ajouteBarre(b4);
        T.ajouteBarre(b5);
        T.ajouteBarre(b6);
        Matrice m = T.defM();
        T.Affiche();
    }

    public static void Treillis6() {

        Treillis T = new Treillis();
        Noeud n1 = new NoeudAppuieDouble(0, 0, new Vecteur2D(0, 0));
        Noeud n2 = new NoeudSimple(2, 0, new Vecteur2D(0, -4000));
        Noeud n3 = new NoeudSimple(4, 0, new Vecteur2D(0, -5000));
        Noeud n4 = new NoeudSimple(6, 0, new Vecteur2D(0, -12000));
        Noeud n5 = new NoeudAppuieSimple(8, 0, new Vecteur2D(0, 0));
        Noeud n6 = new NoeudSimple(6, 2, new Vecteur2D(0, 0));
        Noeud n7 = new NoeudSimple(4, 2, new Vecteur2D(0, -6000));
        Noeud n8 = new NoeudSimple(2, 2, new Vecteur2D(0, 0));
        T.ajouteNoeud(n1);
        T.ajouteNoeud(n2);
        T.ajouteNoeud(n3);
        T.ajouteNoeud(n4);
        T.ajouteNoeud(n5);
        T.ajouteNoeud(n6);
        T.ajouteNoeud(n7);
        T.ajouteNoeud(n8);
        Barre b1 = new Barre(n1, n2);
        Barre b2 = new Barre(n1, n8);
        Barre b3 = new Barre(n2, n8);
        Barre b4 = new Barre(n2, n3);
        Barre b5 = new Barre(n8, n3);
        Barre b6 = new Barre(n8, n7);
        Barre b7 = new Barre(n7, n3);
        Barre b8 = new Barre(n7, n6);
        Barre b9 = new Barre(n3, n6);
        Barre b10 = new Barre(n6, n4);
        Barre b11 = new Barre(n3, n4);
        Barre b12 = new Barre(n5, n4);
        Barre b13 = new Barre(n5, n6);
        T.ajouteBarre(b1);
        T.ajouteBarre(b2);
        T.ajouteBarre(b3);
        T.ajouteBarre(b4);
        T.ajouteBarre(b5);
        T.ajouteBarre(b6);
        T.ajouteBarre(b7);
        T.ajouteBarre(b8);
        T.ajouteBarre(b9);
        T.ajouteBarre(b10);
        T.ajouteBarre(b11);
        T.ajouteBarre(b12);
        T.ajouteBarre(b13);
        Matrice m = T.defM();
        T.Affiche();

//        T.menuTexte();
    }

    public static void main(String[] args) {
//        Treillis2();
        Treillis3();
//        Treillis1();
        Treillis4();
//        Treillis5();
//          Treillis6();
//        T.menuTexte();
    }
}

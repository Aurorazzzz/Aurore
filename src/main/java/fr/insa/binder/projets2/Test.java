/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

import static java.lang.Math.cos;

/**
 *
 * @author Aurore
 */
public class Test {
//      public static void Test(){
//        Noeud n1 = new NoeudSimple (1, 2, 3, new Vecteur2D(0,0));
//        Noeud n2 = new NoeudSimple ();
//        System.out.println(n1.toString());
//        System.out.println(n2.toString());
//        n2 = entreeNoeud();
//
//    }

//        Noeud n2 = new NoeudSimple();
////       n2 = n2.entreeNoeud();
//        System.out.println(n2.toString());
//        Barre b2 = new Barre(1, new NoeudSimple(3, -5), new NoeudSimple(4, 0), 3, 56, 8);
//        System.out.println(b2.toString());
//        Noeud n = new NoeudSimple(3, -5);
//        n2 = b2.noeudOppose(new NoeudSimple());
//        System.out.println(n2.toString());
//        double ang = b2.angle(n);
//        System.out.println(ang);
//
//        Noeud n3 = new NoeudSimple(4, 0);
//        Barre b1 = new Barre(1, n2, n3, 5, 8, 2);
//        Barre b3 = new Barre(1, n3, n2, 5, 8, 1);
//        System.out.println("Barre incidentes de n2 :");
//        n2.BarreIncidente();
//        System.out.println("Barre incidentes de n3 :");
//        n3.BarreIncidente();
//
//        ArrayList<Noeud> A1 = new ArrayList<Noeud>();
//        A1.add(n2);
//        A1.add(n3);
//        ArrayList<Barre> A2 = new ArrayList<Barre>();
//        A2.add(b1);
//        A2.add(b3);
//
//        Treillis T = new Treillis(A1, A2);
    public static void main(String[] args) {
        Treillis T = new Treillis();
        Noeud n1 = new NoeudAppuieSimple(0, 0, new Vecteur2D(0, 0));
        Noeud n2 = new NoeudAppuieDouble(2, 0, new Vecteur2D(0, 0));
        Noeud n3 = new NoeudSimple(1, 1, new Vecteur2D(1000, 0));
        T.ajouteNoeud(n1);
        T.ajouteNoeud(n2);
        T.ajouteNoeud(n3);
        Barre b1 = new Barre(n1, n2);
        Barre b2 = new Barre(n2, n3);
        Barre b3 = new Barre(n1, n3);
        T.ajouteBarre(b3);
        T.ajouteBarre(b2);
        T.ajouteBarre(b1);
        T.Affiche();
//        double tt = cos(Math.PI);
//        double tb = cos(-Math.PI);
////        double tb = n1.coefxb(T.getTerrain().get(0));
//        System.out.println(tt);
//        System.out.println(tb);
//        double ang = b1.angle(n2);
//        System.out.println(ang);
//        String.valueOf(ang);

        Matrice m = T.defM();
//        T.menuTexte();
    }
}

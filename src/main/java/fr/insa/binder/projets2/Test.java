/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

import java.util.ArrayList;

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

    public static void main(String[] args) {
        Noeud n2 = new NoeudSimple();
//       n2 = n2.entreeNoeud();
        System.out.println(n2.toString());
        Barre b2 = new Barre(1, new NoeudSimple(3, -5), new NoeudSimple(4, 0), 3, 56, 8);
        System.out.println(b2.toString());
        Noeud n = new NoeudSimple(3, -5);
        n2 = b2.noeudOppose(new NoeudSimple());
        System.out.println(n2.toString());
        double ang = b2.angle(n);
        System.out.println(ang);

        Noeud n3 = new NoeudSimple(4, 0);
        Barre b1 = new Barre(1, n2, n3, 5, 8, 2);
        Barre b3 = new Barre(1, n3, n2, 5, 8, 1);
        System.out.println("Barre incidentes de n2 :");
        n2.BarreIncidente();
        System.out.println("Barre incidentes de n3 :");
        n3.BarreIncidente();

        ArrayList<Noeud> A1 = new ArrayList<Noeud>();
        A1.add(n2);
        A1.add(n3);
        ArrayList<Barre> A2 = new ArrayList<Barre>();
        A2.add(b1);
        A2.add(b3);

        Treillis T = new Treillis(A1, A2);

    }
}

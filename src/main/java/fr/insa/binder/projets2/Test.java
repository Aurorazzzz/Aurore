/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

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
    }
}

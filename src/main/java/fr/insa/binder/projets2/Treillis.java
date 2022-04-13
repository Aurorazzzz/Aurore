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

    public void Affiche() {
        System.out.println("Voici la liste des noeuds du treillis :");
        System.out.println("");
        for (Noeud noeud : this.LN) {
            System.out.println(noeud.toString());
        }
        System.out.println("Voici la liste des barres du treillis :");
        System.out.println("");
        for (Barre barre : this.LB) {
            System.out.println(barre.toString());
        }
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

    public void ajouteNoeud(Noeud n) {
        if (this.LN.contains(n) == true) {
            System.out.println("Le Noeud est déjà dans le treillis");
        } else {
            n.setId(this.maxIdNoeud() + 1);
            this.LN.add(n);
        }
    }

    public void ajouteBarre(Barre b) {
        if (this.LB.contains(b) == true) {
            System.out.println("La Barre est déjà dans le treillis");
        } else {
            if (this.LN.contains(b.getNd()) == false) {
                this.LN.add(b.getNd());
            }
            if (this.LN.contains(b.getNa()) == false) {
                this.LN.add(b.getNa());
            }
            b.setId(this.maxIdBarre() + 1);
            this.LB.add(b);
        }
    }

    public Noeud choisiNoeud() {
        System.out.println("Entrez le numero qui s'affiche devant le Noeud que vous voulez ajouter :");
        int i = 1;
        for (Noeud noeud : this.LN) {
            System.out.println(i + "   " + noeud.toString());
            i = i + 1;
        }
        int n = Lire.i();
        while ((n < 1) && (n >= 1)){
            System.out.println("Mauvais numero entré, resaissir");
            n = Lire.i();
        }
        return this.LN.get(n-1);
    }
    
        public Barre choisiBarre() {
        System.out.println("Entrez le numero qui s'affiche devant la Barre que vous voulez ajouter :");
        int i = 1;
        for (Barre barre : this.LB) {
            System.out.println(i + "   " + barre.toString());
            i = i + 1;
        }
        int n = Lire.i();
        while ((n < 1) && (n >= 1)){
            System.out.println("Mauvais numero entré, resaissir");
            n = Lire.i();
        }
        return this.LB.get(n-1);
    }

    public int choixTexte() {
        System.out.println("Tapez :");
        System.out.println("- 1 pour afficher le treillis");
        System.out.println("- 2 pour creer un nouveau noeud");
        System.out.println("- 3 pour creer une barre entre deux noeud");
        System.out.println("- 4 pour supprimer une barre");
        System.out.println("- 5 pour supprimer un noeud (toutes les barres adjacentes au noeud seront supprimées)");
        System.out.println("- 6 pour sortir");
        int n = Lire.i();
        while (n < 1 && n > 6) {
            System.out.println("Entrez 1, 2, 3, 4, 5 ou 6");
            n = Lire.i();
        }
        return n;
    }

    public void menuTexte() {
        boolean boo = false;
        while (boo == false) {
            int n = this.choixTexte();
            switch (n) {
                case 1: {
                    this.Affiche();
                }
                case 2: {
                    Noeud ns = new NoeudSimple();
                    ns = ns.entreeNoeud();
                    this.ajouteNoeud(ns);
                }
                case 3: {
                    Barre b = new Barre (1, this.choisiNoeud(), this.choisiNoeud(), 0, 0, 0);
                    this.ajouteBarre(b);
                }
                case 4: {
                    Barre b = new Barre();
                    boolean bool = this.LB.remove(b);
                }
                case 5:{
                    Noeud nss = new NoeudSimple();
                    this.LN.remove(nss);
                    nss.getbArr()
                }
            }
        }

    }
}

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

    public Treillis() {
        this.LN = new ArrayList<Noeud>();
        this.LB = new ArrayList<Barre>();
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
        System.out.println("");
        System.out.println("Voici la liste des barres du treillis :");
        System.out.println("");
        for (Barre barre : this.LB) {
            System.out.println(barre.toString());
        }
        System.out.println("");
    }

    public int maxIdNoeud() {
        if (this.LN.isEmpty()) {
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
        if (this.LB.isEmpty()) {
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
        if (this.contient(n) == true) {
            System.out.println("Le Noeud est déjà dans le treillis");
        } else {
            n.setId(this.maxIdNoeud() + 1);
            this.LN.add(n);
        }
    }

    public void ajouteBarre(Barre b) {
        if (this.contient(b) == true) {
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
        while ((n < 1) || (n >= i)) {
            System.out.println("Mauvais numero entré, resaissir");
            n = Lire.i();
        }
        return this.LN.get(n - 1);
    }

    public Barre choisiBarre() {
        System.out.println("Entrez le numero qui s'affiche devant la Barre que vous voulez ajouter :");
        int i = 1;
        for (Barre barre : this.LB) {
            System.out.println(i + "   " + barre.toString());
            i = i + 1;
        }
        int n = Lire.i();
        while ((n < 1) || (n >= i)) {
            System.out.println("Mauvais numero entré, resaissir");
            n = Lire.i();
        }
        return this.LB.get(n - 1);
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
        while (n < 1 || n > 6) {
            System.out.println("Entrez 1, 2, 3, 4, 5 ou 6");
            n = Lire.i();
        }
        return n;
    }

    public boolean contient(Noeud n) {
        int k = this.LN.size();
        int i = 0;
        boolean boo = false;
        while (boo == false && i < k) {
            boo = this.LN.get(i).egal(n);
            i = i + 1;
        }
        return boo;
    }

    public boolean contient(Barre b) {
        int k = this.LB.size();
        int i = 0;
        boolean boo = false;
        while (boo == false && i < k) {
            if ((b.getNa().egal(this.LB.get(i).getNa()) == true && b.getNd().egal(this.LB.get(i).getNd()) == true) || (b.getNa().egal(this.LB.get(i).getNd()) == true && b.getNd().egal(this.LB.get(i).getNa()))) {
                boo = true;
            }
            i = i + 1;
        }
        return boo;
    }

    public void menuTexte() {
        boolean boo = false;
        while (boo == false) {
            int n = this.choixTexte();
            switch (n) {
                case 1: {
                    System.out.println("Afficher Treillis");
                    this.Affiche();
                    break;
                }
                case 2: {
                    System.out.println("Nouveau noeud");
                    Noeud ns = new NoeudSimple();
                    ns = ns.entreeNoeud();
                    this.ajouteNoeud(ns);
                    break;
                }

                case 3: {
                    System.out.println("Nouvelle Barre");
                    Barre b = new Barre(1, this.choisiNoeud(), this.choisiNoeud(), 0, 0, 0);
                    this.ajouteBarre(b);
                    break;
                }
                case 4: {
                    System.out.println("Supprimer Barre");
                    Barre b = new Barre();
                    b = this.choisiBarre();
                    boolean bool = this.LB.remove(b);
                    break;
                }
                case 5: {
                    System.out.println("Supprimer Noeud");
                    Noeud nss = new NoeudSimple();
                    nss = this.choisiNoeud();
                    this.LN.remove(nss);
                    for (Barre barre : nss.getbArr()) {
                        boolean bool = this.LB.remove(barre);
                    }
                    for (Barre barre : nss.getbDep()) {
                        boolean bool = this.LB.remove(barre);
                    }
                    break;
                }
                case 6: {
                    System.out.println("Dehors");
                    boo = true;
                    break;
                }
            }
        }

    }
}

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
    // Pas très util je penses... 
    private Matrice m;
//    private ArrayList<Barre> Terrain;
    private ArrayList<Noeud> Appuis;

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

//    public Treillis(ArrayList<Noeud> LN, ArrayList<Barre> LB) {
//        this.LN = LN;
//        this.LB = LB;
//        for (Barre barre : this.LB) {
//            if (barre.getType() == 1){
//                this.Terrain.add(barre);
//            }
//        }
//        
//    }
    public Treillis() {
        this.LN = new ArrayList<Noeud>();
        this.LB = new ArrayList<Barre>();
        this.Appuis = new ArrayList<Noeud>();
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
        System.out.println("Reactions");
        for (Noeud noeud : this.LN) {
            System.out.println("Neoud " + noeud.getId() + " : (" + noeud.getReacX() + ", " + noeud.getReacY() + ")");
        }
        for (Barre barre : this.LB) {
            System.out.println("Barre " + barre.getId() + " : " + barre.getTens());

        }
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
//        } else if (this.Appuis.size() > 2){
//            System.out.println("Trop de noeud appuie... (definir un terrain si on veut en mettre plus");

        } else {
            if ((n.getType() == 3) || (n.getType() == 2)) {
//                if (this.Appuis.size() == 2) {
//                    System.out.println("Trop de noeud Appuie...");
//                }
//                else {
//                    this.LN.add(n);
//                    n.setId(this.maxIdNoeud() + 1);
//                    this.Appuis.add(n);
//                   
//                }
                this.LN.add(n);
                n.setId(this.maxIdNoeud() + 1);
                this.Appuis.add(n);
            } else {
                n.setId(this.maxIdNoeud() + 1);
                this.LN.add(n);

            }

        }
    }

    public void ajouteBarre(Barre b) {
        if (this.contient(b) == true) {
            System.out.println("La Barre est déjà dans le treillis");
        } //else {
        //            if ((this.ajouteNoeud(b.getNd()) == true)&&(this.ajouteNoeud(b.getNd()) == true)){
        //                
        //            }
        else {
            if (this.LN.contains(b.getNd()) == false) {
                this.ajouteNoeud(b.getNd());
            }
            if (this.LN.contains(b.getNa()) == false) {
                this.ajouteNoeud(b.getNa());
            }
//            if (b.getType() == 1) {
//                this.Terrain.add(b);
//            }
            b.setId(this.maxIdBarre() + 1);
            this.LB.add(b);
//            if (this.ajouteNoeud(b.getNd()) == false) {
//                
//            }
        }

    }
//            if ((this.LN.contains(b.getNd()) == false) && (this.ajouteNoeud(b.getNd()) == true)) {
//                this.ajouteNoeud(b.getNd());
//                b.setId(this.maxIdBarre() + 1);
//                this.LB.add(b);
//            }
//            else {
//                System.out.println("Trop de noeud appuie, il ne peut y en avoir que 2. Impossible d'ajouter la barre" + b.toString());
//            }
//            if ((this.LN.contains(b.getNa()) == false) && (this.ajouteNoeud(b.getNa())) == true) {
//                this.ajouteNoeud(b.getNa());
//                b.setId(this.maxIdBarre() + 1);
//                this.LB.add(b);
//            }
//            else {
//                System.out.println("Trop de noeud appuie, il ne peut y en avoir que 2. Impossible d'ajouter la barre" + b.toString());
//            }
////            if (b.getType() == 1){
////                this.Terrain.add(b);
////            }
//            if ((this.LN.contains(b.getNa()) == true) && (this.LN.contains(b.getNd()) == true)) {
//                b.setId(this.maxIdBarre() + 1);
//                this.LB.add(b);
//            }

//    public int ContNoeud(){
//        int i = 0;
//        for (Noeud noeud : this.LN) {
//            if ((noeud.getType() == 2)||(noeud.getType() == 3)){
//                i = i + 1;
//            }
//        }
//        if (i < 2){
//            return 0;
//        }
//        else if (i == 2){
//            return 1;
//        }
//        else{
//            return 2;
//        }
//    }
//    public void Terrain() {
//        Barre b = new Barre(this.Appuis.get(0), this.Appuis.get(1));
//        this.Terrain.add(b);
//    }
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
        System.out.println("- 7 pour afficher la matrice");
        int n = Lire.i();
        while (n < 1 || n > 7) {
            System.out.println("Entrez 1, 2, 3, 4, 5, 6 ou 7");
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

    //Pb Controle de saisie !!!!!!!!!!!!!! C'est bon, pb reglé
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
                case 7: {
                    Matrice m = this.defM();
                }
            }
        }

    }

    /**
     * @return the m
     */
    public Matrice getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(Matrice m) {
        this.m = m;
    }

    public int reacAD(Noeud n) {
        if (n.getType() == 3) {
            return 1;
        } else {
            return 0;
        }
    }

    public int reacAS(Noeud n) {
        if (n.getType() == 2) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Remplir matrice: 1.tension barre (par ordre croissant des barres ds
     * l'ArrayList), 2. reaction en x des AP (par ordre croissant des noeud ds
     * l'ArrayList) 3. reaction en y des AP (idem) 4. reaction en x ou y des AS
     * (idem)
     *
     * Lignes: par ordre croissant des noeuds ds l'ArrayList (x puis y)
     *
     * @return
     */
    public Matrice defM() {
        int n = this.nbrI();
//        System.out.println(n);
        if (n == -1) {
            return new Matrice(0, 0);
        } else if (this.Appuis.size() == 1) {
            System.out.println("Il manque un appuie dans le treillis");
            return new Matrice(0, 0);
        } else {
            this.m = new Matrice(n, n + 1);
//            this.Terrain();
            // Collone 1:
            int i = 0;
            int k = 0;
//            int j = 0;
            // Remplissages des premieres collones (autant que de barres)
            for (Barre barre : this.LB) {
                for (Noeud noeud : this.LN) {
                    // Coordonnées en X
                    this.m.set(k, i, noeud.coefxb(barre));
                    k = k + 1;
                }
                for (Noeud noeud : this.LN) {
                    //Coordonnées en Y
                    this.m.set(k, i, noeud.coefyb(barre));
                    k = k + 1;
                }
//                j = 0;
                k = 0;
                i = i + 1;
            }
//            System.out.println(m.toString());

            //Remplissage des collones NoeudDouble
            int b = 0;
            for (Noeud noeud : this.LN) {
                if (noeud.getType() == 3) {
                    // Pas forcement utile,la matrice est de base avec des zeros
                    for (int a = 0; a < n; a++) {
                        this.m.set(a, i, 0);
                    }
                    this.m.set(b, i, 1);
                    this.m.set(b + (n / 2), i + 1, 1);
                    i = i + 2;
                }
                b = b + 1;
            }
//            System.out.println(m.toString());
            //Remplissage des collones NoeudAppuieSimple (Marche que si le treillies est a l'horizontal), a revoir !!
            b = 0;
            for (Noeud noeud : this.LN) {
                if (noeud.getType() == 2) {
                    // idem, pas utils ?
                    for (int a = 0; a < n; a++) {
                        this.m.set(a, i, 0);
                    }
                    // Utiliser le terrain
                    this.m.set(b, i, noeud.coefxV());
//                    this.m.set(b, i, 1);
                    this.m.set(b + (n / 2), i, noeud.coefyV());
                    i = i + 1;
                }
                b = b + 1;
            }
//            System.out.println(m.toString());
//            //Remplissage de la derniere collone (avec des 0 ou les coordonnées des forces)
            b = 0;
            for (Noeud noeud : this.LN) {
                this.m.set(b, i, -noeud.getFc().getVx());
                b = b + 1;
            }
            for (Noeud noeud : this.LN) {
                this.m.set(b, i, -noeud.getFc().getVy());
                b = b + 1;
            }
            System.out.println(m.toString());
            ArrayList<Double> d = this.forces(m);
//            System.out.println(this.LN.get(0).getReacX());
//            System.out.println(this.LN.get(0).getReacY());
//            System.out.println(this.LB.get(0).getTens());
            return m;
        }
    }

    public ArrayList<Double> forces(Matrice m) {
//        System.out.println("Hello");
        m.descenteDeGauss();
        m = m.remonteeGauss();
//        System.out.println("bof");
        int l = m.getL();
        int c = m.getC();
        ArrayList<Double> force = new ArrayList<Double>();
//        ArrayList<String> bla = new ArrayList<String>();
        for (int i = 0; i < l; i++) {
            force.add(m.get(i, c - 1));
        }
        int k = 0;
        for (Barre barre : this.LB) {
            barre.setTens(force.get(k));
//            bla.add("Barre : " + barre.getId());
            k = k + 1;
        }
        for (Noeud noeud : this.LN) {
            if (noeud.getType() == 3) {
                noeud.setReacX(force.get(k));
                noeud.setReacY(force.get(k+1));
//                bla.add("Noeud : " + noeud.getId());
                k = k + 2;
            }
        }
//        for (Noeud noeud : this.LN) {
//            if (noeud.getType() == 3) {
//                noeud.setReacY(force.get(k));
//                bla.add("Noeud : " + noeud.getId());
//                k = k + 1;
//            }
//        }
        for (Noeud noeud : this.LN) {
            if (noeud.getType() == 2) {
                noeud.setReacX(noeud.coefxV() * force.get(k));
                noeud.setReacY(noeud.coefyV() * force.get(k));
//                bla.add("Noeud : " + noeud.getId());
                k = k + 1;
            }
        }
//
//        for (String string : bla) {
//            System.out.println(string);
//        }
//        for (Double d : force) {
//            System.out.println(d);
//        }
        return force;
    }

    public int nbrAD() {
        int i = 0;
        for (Noeud noeud : this.LN) {
            if (noeud.getType() == 3) {
                i = i + 1;
            }
        }
        return i;
    }

    public int nbrAS() {
        int i = 0;
        for (Noeud noeud : this.LN) {
            if (noeud.getType() == 2) {
                i = i + 1;
            }
        }
        return i;
    }

    public int nbrI() {
        int b = this.LB.size();
        int AS = this.nbrAS();
        int AD = this.nbrAD();
        int n = this.LN.size();
        if (b + AS + 2 * AD != 2 * n) {
            System.out.println("Ce treillis ne peut pas être résolu... Veuillez redefinir les appuies.");
            return -1;
        } else {
            return 2 * n;
        }
    }

    /**
     * @return the Appuis
     */
    public ArrayList<Noeud> getAppuis() {
        return Appuis;
    }

    /**
     * @param Appuis the Appuis to set
     */
    public void setAppuis(ArrayList<Noeud> Appuis) {
        this.Appuis = Appuis;
    }
}

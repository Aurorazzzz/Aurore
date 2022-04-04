/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

/**
 *
 * @author Aurore
 */
public class NoeudSimple extends Noeud{
    
    public NoeudSimple(double nx, double ny, int id, Vecteur2D fc){
        super ( nx,  ny,  id,  fc);
    }

    public NoeudSimple(double nx, double ny, Vecteur2D fc){
        super ( nx,  ny,  fc);
    }
    
    public NoeudSimple(double nx, double ny){
        super (nx, ny);
    }

     public NoeudSimple(){
        super ();
    }
     
    public void Test(){
    NoeudSimple n1 = new NoeudSimple (1, 2, 3, new Vecteur2D(0,0));
    NoeudSimple n2 = new NoeudSimple ();
    System.out.println(n1.toString());
    System.out.println(n2.toString());

    }
    
    // pas de toString
    
    public void main(String[] args) {
       //Test();
       entreeNoeud();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

/**
 *
 * @author Aurore
 */
public class NoeudAppuieSimple extends Noeud{
    
     public NoeudAppuieSimple(double nx, double ny, int id, Vecteur2D fc){
        super ( nx,  ny,  id,  fc);
    }

    public NoeudAppuieSimple(double nx, double ny, Vecteur2D fc){
        super ( nx,  ny,  fc);
    }
    
    public NoeudAppuieSimple(double nx, double ny){
        super (nx, ny);
    }

     public NoeudAppuieSimple(){
        super ();
    }
    @Override
    public String toString() {
        return "Noeud Appuie Simple (" + this.getNx() + " ; " + this.getNy() + " ; " + this.getId() + " ; (" + this.getFc() + "))";
    }
}

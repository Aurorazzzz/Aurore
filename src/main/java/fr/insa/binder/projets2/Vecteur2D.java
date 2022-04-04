/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.binder.projets2;

import fr.insa.binder.projets2.utils.Lire;

/**
 *
 * @author Aurore
 */
public class Vecteur2D {
    private long vx;
    private long vy; 
    
    public long getVx() {
        return this.vx;
    }
    
    public long getVy() {
        return this.vy;
    }
    
    public void setVx(long vx) {
        this.vx = vx;
    }
    
    public void setVy(long vy) {
        this.vy = vy;
    }
    
    public Vecteur2D (long vx, long vy){
        this.vx = vx;
        this.vy = vy;
    }
    
     public Vecteur2D (){
        this.vx = 0;
        this.vy = 0;
    }
    
    public static Vecteur2D entreeVect() { 
        Vecteur2D v = new Vecteur2D();
        v.vx = Lire.i();
        v.vy = Lire.i();
        return v;
    }
    
    @Override
    public String toString() {
        return this.vx + " ; " + this.vy;
    }
}
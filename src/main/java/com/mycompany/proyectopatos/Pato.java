/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopatos;

/**
 *
 * @author sistemas
 */
public abstract class Pato {
    
    
    
    Pato(){
        
    }
    
    public void nadar(){
        System.out.println("TODOS LOS PATOS NADAN");
    }
    
    public abstract void mostrar();
    
    public void setVolable(Volable fb){
        this.fb = fb;
    }
    
    public void setCuaqueable(Cuaqueable qb){
        this.fb = fb;
    }
    
    public void realizarVuelo(){
        this.fb = fb;
    }
    
    public void realizarCuaqueo(){
        this.fb = fb;
    }
    
}

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
    
    Cuaqueable cuaqueable;
    Volable volable;
    
    Pato(){
        
    }
    
    public void nadar(){
        System.out.println("TODOS LOS PATOS NADAN");
    }
    
    public abstract void mostrar();
    
    public void setVolable(Volable volable){
        this.volable = volable;
    }
    
    public void setCuaqueable(Cuaqueable cuaqueable){
        this.cuaqueable = cuaqueable;
    }
    
   
}

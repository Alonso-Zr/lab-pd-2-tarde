/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopatos;

/**
 *
 * @author sistemas
 */
public class PatoReal extends Pato implements Volable,Cuaqueable {
    
    @Override
    public void mostrar() {
        System.out.println("Yo soy un verdadero PATO REAL");
    
}
    
    @Override
    public void volar() {
        System.out.println("Puedo volar con mis alas");
    }
    
    @Override
    public void cuaquear() {
        System.out.println("Soy un verdadero pato hago CUAC CUAC");
    }
    
}

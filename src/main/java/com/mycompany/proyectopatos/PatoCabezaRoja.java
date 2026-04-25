/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopatos;

/**
 *
 * @author sistemas
 */
public class PatoCabezaRoja extends Pato implements Cuaqueable, Volable {
    
    @Override
    public void mostrar() {
        System.out.println("Yo soy un real PATO CABEZA ROJA");
    
}
    @Override
    public void volar() {
        System.out.println("Puedo volar con mis alas");
    }
    
    @Override
    public void cuaquear() {
        System.out.println("Soy un verdadero pato por eso hago CUAC CUAC");
    }
    
}

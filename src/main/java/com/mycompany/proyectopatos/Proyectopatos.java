/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectopatos;

/**
 *
 * @author sistemas
 */
public class Proyectopatos {

    public static void main(String[] args) {
        PatoReal p1=new PatoReal();
        PatoCabezaRoja p2=new PatoCabezaRoja();
        PatoDeGoma p3=new PatoDeGoma();
        PatoSeñuelo p4=new PatoSeñuelo();
        p1.mostrar();
        p1.cuaquear();
        p1.volar();
        p1.nadar();
        p3.mostrar();
        p3.cuaquear();
        System.out.println("Incapaz de volar");
        p3.nadar();
        p4.mostrar();
        System.out.println("<<<Silencio>>");
        System.out.println("Incapaz de volar");
        p4.nadar();
        p2.mostrar();
        p2.cuaquear();
        p2.volar();
        p2.nadar();
    }
}

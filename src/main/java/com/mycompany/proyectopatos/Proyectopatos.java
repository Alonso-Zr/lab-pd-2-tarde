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
        
        Cuaqueable cuaqueo = new Cuaqueo();
        Cuaqueable chirreo = new Chirreo();
        Cuaqueable mudo = new CuaqueoMudo();
        Volable volable = new VuelaConAlas();
        Volable novolable = new NoVuela();
        
        PatoReal patoReal = new PatoReal();
        PatoCabezaRoja patoCabezaRoja = new PatoCabezaRoja();
        PatoDeGoma patoDeGoma = new PatoDeGoma();
        PatoSeñuelo patoSeñuelo = new PatoSeñuelo();
        
        patoReal.setCuaqueable(cuaqueo);
        patoCabezaRoja.setCuaqueable(chirreo);
        
        patoReal.mostrar();
        patoReal.cuaqueable.cuaquear();
        patoReal.volable.volar();
    }
}

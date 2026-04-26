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
        patoCabezaRoja.setCuaqueable(cuaqueo);
        patoDeGoma.setCuaqueable(chirreo);
        patoSeñuelo.setCuaqueable(mudo);
        
        patoReal.setVolable(volable);
        patoReal.setVolable(novolable);
        
        patoReal.mostrar();
        patoReal.cuaqueable.cuaquear();
        patoReal.volable.volar();
        patoReal.nadar();
        
        patoCabezaRoja.mostrar();
        patoCabezaRoja.cuaqueable.cuaquear();
        patoCabezaRoja.volable.volar();
        patoCabezaRoja.nadar();
        
        patoDeGoma.mostrar();
        patoDeGoma.cuaqueable.cuaquear();
        patoDeGoma.volable.volar();
        patoDeGoma.nadar();
        
        patoSeñuelo.mostrar();
        patoSeñuelo.cuaqueable.cuaquear();
        patoSeñuelo.volable.volar();
        patoSeñuelo.nadar();
    }
}

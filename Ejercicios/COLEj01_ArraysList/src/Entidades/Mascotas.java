/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author cynth
 */
public class Mascotas {
    
    private String raza;

    public Mascotas() {
    }

    public Mascotas(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        //return "Mascotas{" + "raza =" + raza + '}';
        return raza;
    }
    
    
}
 

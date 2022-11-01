/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import Entidades.Mascotas;
import java.util.Comparator;

/**
 *
 * @author cynth
 */
public class Comparadores {
    
       public static Comparator<Mascotas> ordenarPorRazaAsce = new Comparator<Mascotas>() {
            @Override
            public int compare(Mascotas t, Mascotas t1) {

                return t.getRaza().compareToIgnoreCase(t1.getRaza());

            }

       };
               
 }
    


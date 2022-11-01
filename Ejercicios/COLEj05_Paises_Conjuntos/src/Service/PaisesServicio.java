/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author cynth
 */
public class PaisesServicio {
    
    Scanner leer;
    HashSet <String> conjPaises;
   // TreeSet <String> conjPaises;
 //   Iterator <String> it;

    public PaisesServicio() {
        this.leer = new Scanner (System.in).useDelimiter("\n");
        this.conjPaises = new HashSet<>();
       // this.conjPaises = new TreeSet<>();
    }
   
    public void ingresarPais(){
    
        System.out.println("INGRESE EL NOMBRE DEL PAIS:");
        String pais = leer.next();
        conjPaises.add(pais);
        
    }
    
    public void mostrarConj(){
        
        System.out.println("CONJUNTO(sin ordenar)");
        
        for (String aux : conjPaises) {
            System.out.println(aux);
        }
    }
    
    public void ordenarConj(){
    
        ArrayList<String> listaConj = new ArrayList(conjPaises);
        
        Collections.sort(listaConj);
        
        System.out.println("CONJUNTO(ordenado por Lista):");
        
        for (String aux : listaConj) {
            System.out.println(aux);
            
        }
        
    }
    
    
    public void eliminarPais(){
    
       Iterator <String> it = conjPaises.iterator();
        
        System.out.println("Ingrese el país a eliminar");
        String eliminar = leer.next();
        
        boolean encuentra = false;
        
        while(it.hasNext()){
            if (it.next().equals(eliminar)){
             it.remove();
                
            //conjPaises.remove(eliminar); no funciona con este método
            encuentra= true;
            }
        }
        
        if(encuentra == false){
            System.out.println("No se encontró el país a Eliminar");
            
        }
        else {
        ordenarConj();
        }
        
        
    
    }
       
     public void menu(){
    
        int opcion = 0;
        do {
            System.out.println("======================");
            System.out.println("=       MENU         =");
            System.out.println("======================");
            System.out.println("");
            System.out.println("1. INGRESAR PAIS");
            System.out.println("2. MOSTRAR");
            System.out.println("3. ORDENAR");
            System.out.println("4. ELIMINAR");
            System.out.println("5. SALIR");
            System.out.println("======================");
            System.out.println("Ingrese una opcion");
            opcion = leer.nextByte();

            switch (opcion) {
                case 1:
                    ingresarPais();
                    break;
                case 2:
                    mostrarConj();
                    break;
                case 3:
                   ordenarConj();
                    break;
                case 4:
                    eliminarPais();
                    break;
                case 5:
                    System.out.println("Hasta Luego!");
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (opcion != 5);

    }
    
    
    
}

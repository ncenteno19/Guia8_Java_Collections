/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author cynth
 */
public class ProductosServicio {
    
    Scanner leer;
    HashMap <String,Double> mapProductos;

    public ProductosServicio() {
        this.leer = new Scanner (System.in).useDelimiter("\n");
        this.mapProductos = new HashMap<>();
    }
    
    public void ingresar(){
    
        System.out.println("NOMBRE DEL PRODUCTO:");
        String producto = leer.next();
        
        System.out.println("PRECIO DEL PRODUCTO ($)");
        Double precio = leer.nextDouble();
        
        mapProductos.put(producto, precio);
        
        
    }
    
    public void eliminar(){
    
        System.out.println("QUÉ PRODUCTO DESEA ELIMINAR?");
        String eliminar = leer.next();
        
        //RECORRER E IF PARA ENCONTRAR EL PRODUCTO A ELIMINAR
        boolean encuentra = false;
        
        for (Map.Entry<String, Double> aux : mapProductos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            
            if (key.equalsIgnoreCase(eliminar)){
            mapProductos.remove(eliminar); 
                System.out.println("Producto eliminado!");
                encuentra = true;
            } 
        }
       if (encuentra == false) {
                System.out.println("No se encontró producto");
            }
        
        
    }
    
    public void mostrar(){
        
        //Muestra el HashMap
        
        for (Map.Entry<String, Double> entry : mapProductos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            
            System.out.println("Producto: " + key +" Precio: $" + value);
            
            
        }
    }
    
    public void ordenar(){
    
        TreeMap <String,Double> treeProductos = new TreeMap(mapProductos);
        
        //Muestra el TreeMap
        
        for (Map.Entry<String, Double> aux : treeProductos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            
            System.out.println("Producto: " + key +" Precio: $" + value);
            
        }

        
    }
    
    public void modificar(){
        
        
        //FALTA RECORRER PARA BUSCAR EL PRODUCTO
        System.out.println("QUE PRODUCTO DESEA MODIFICAR?");
        String modificar = leer.next();
       // mapProductos.remove(modificar); NO HACE FALTA ELIMINAR EL ANTERIOR
        
       boolean encuentra = false;
       
        for (Map.Entry<String, Double> aux : mapProductos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
        
            if (key.equalsIgnoreCase(modificar)){
            
                System.out.println("INGRESE EL NUEVO PRECIO:");
                Double nuevoPrecio = leer.nextDouble();
                mapProductos.put(modificar, nuevoPrecio);              
                encuentra = true;
            }
            
        }
        
        if (encuentra == false){ 
           System.out.println("No se encontró producto");
        }
        
          
        
    
    }
    
    public void ordenarPorValor (){
    
  
        } 
        
    
    
    
    
     public void menu(){
    
        String opcion = "0";
        do {
            System.out.println("======================");
            System.out.println("=       MENU         =");
            System.out.println("======================");
            System.out.println("");
            System.out.println("1. INGRESAR");
            System.out.println("2. ELIMINAR");
            System.out.println("3. MODIFICAR PRECIO");
            System.out.println("4. ORDENAR POR TITULO");
            System.out.println("-5. ORDENAR POR VALOR-");
            System.out.println("6. MOSTRAR");
            System.out.println("7. SALIR");
            System.out.println("======================");
            System.out.println("Ingrese una opcion");
            opcion = leer.next();

            switch (opcion) {
                case "1":
                    ingresar();                  
                    break;
                case "2":
                    eliminar();
                    break;
                case "3":
                    modificar();
                    break;

                case "4":
                    ordenar();
                    break;
                    
                case "5":

                    break;
                case "6":
                    mostrar();
                    break;
                case "7":
                    System.out.println("Hasta Luego!");
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (!opcion.equals("7"));

    }   
    
    
}

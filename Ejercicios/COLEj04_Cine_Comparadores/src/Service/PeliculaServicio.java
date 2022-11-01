/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Comparadores.Comparadores;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class PeliculaServicio {
    Scanner leer;
    ArrayList<Pelicula> listaPeliculas;
    Iterator it;

    public PeliculaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaPeliculas = new ArrayList<>();
    }
    
    public void ingresarPelicula(){
    
        System.out.println("TITULO:");
        String titulo = leer.next();
        System.out.println("DIRECTOR:");
        String director = leer.next();
        System.out.println("DURACION (HS):");
        int duracion = leer.nextInt();
        
        listaPeliculas.add(new Pelicula(titulo, director, duracion));
          
    }
    
    public void mostrarPeliculas (){
    
     it = listaPeliculas.iterator();
        
    while (it.hasNext()){
          
        System.out.println(it.next());
        
    }
        
        
    }
    
    public void menu(){
    
        int opcion = 0;
        do {
            System.out.println("======================");
            System.out.println("=       MENU         =");
            System.out.println("======================");
            System.out.println("");
            System.out.println("1. INGRESAR PELICULA");
            System.out.println("2. MOSTRAR PELICULAS");
            System.out.println("3. ORDENAR POR DURACION (MAYOR A MENOR)");
            System.out.println("4. ORDENAR POR DURACION (MENOR A MAYOR)");
            System.out.println("5. ORDENAR POR TITULO");
            System.out.println("6. ORDENAR POR DIRECTOR");
            System.out.println("7. SALIR");
            System.out.println("======================");
            System.out.println("Ingrese una opcion");
            opcion = leer.nextByte();

            switch (opcion) {
                case 1:
                    ingresarPelicula();
                    break;
                case 2:
                    mostrarPeliculas();
                    break;
                case 3:
                    Collections.sort(listaPeliculas, Comparadores.ordenaDuracionDesc);
                    mostrarPeliculas();
                    break;

                case 4:
                    Collections.sort(listaPeliculas, Comparadores.ordenaDuracionAsc);
                    mostrarPeliculas();
                    break;
                case 5:
                    Collections.sort(listaPeliculas, Comparadores.ordenaTituloAsc);
                    mostrarPeliculas();
                    break;
                case 6:
                    Collections.sort(listaPeliculas, Comparadores.ordenaDirectorAsc);
                    mostrarPeliculas();
                    break;
                case 7:

                    System.out.println("Hasta Luego!");

                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (opcion != 7);

    }
    
}

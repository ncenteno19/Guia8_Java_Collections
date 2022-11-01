/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Comparadores.Comparadores;
import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class AlumnoServicio {
    
    Scanner leer;
    ArrayList<Alumno> listaAlumnos;

    public AlumnoServicio() {
        this.leer = new Scanner (System.in).useDelimiter("\n") ;
        this.listaAlumnos = new ArrayList<>();
        
        //se ingresan 20 alumnos fijos
        
        listaAlumnos.add(new Alumno("Nicolas", "Centeno", "Argentina", new Date (1988-1900, 4-1, 19)));
        listaAlumnos.add(new Alumno("Cynthia", "Filomena", "Venezolana", new Date (1996-1900, 1-1, 26)));
        listaAlumnos.add(new Alumno("Morena", "Centeno", "Chilena", new Date (2016-1900, 10-1, 6)));
        listaAlumnos.add(new Alumno("Lola", "Denteno", "Argentina", new Date (2021-1900, 1-1, 4)));
        listaAlumnos.add(new Alumno("Dario", "Fenteno", "Venezolana", new Date (1961-1900, 7-1, 25)));
        listaAlumnos.add(new Alumno("Graciela", "Daniliuk", "Chilena", new Date (1963-1900, 3-1, 8)));
        listaAlumnos.add(new Alumno("Ines", "Anderfhurer", "Argentina", new Date (1965-1900, 12-1, 16)));
        listaAlumnos.add(new Alumno("Laura", "Mendoza", "Venezolana", new Date (1976-1900, 3-1, 24)));
        listaAlumnos.add(new Alumno("Martin", "Zanuzzi", "Chilena", new Date (1980-1900, 8-1, 5)));
        listaAlumnos.add(new Alumno("Nicolas", "Yanuzzi", "Chilena", new Date (1988-1900, 4-1, 19)));
        
    }
   
    public void ingresa(){
       
        System.out.println("NOMBRE:"); 
        String nombre = leer.next();
        System.out.println("APELLIDO:"); 
        String apellido = leer.next();
        System.out.println("NACIONALIDAD:"); 
        String nacionalidad = leer.next();
        
        while (!nacionalidad.equalsIgnoreCase("argentina") && !nacionalidad.equalsIgnoreCase("venezolana") && !nacionalidad.equalsIgnoreCase("chilena")) { 
            System.out.println("La nacionalidad debe ser argentina, venezolana o chilena");
            System.out.println("NACIONALIDAD:");
            nacionalidad = leer.next();
        } 
         
        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("Día:");
        int dia = leer.nextInt();
        System.out.println("Mes:");
        int mes = leer.nextInt();
        System.out.println("Año:");
        int anio = leer.nextInt();
       
        listaAlumnos.add(new Alumno(nombre, apellido, nacionalidad, new Date(anio-1900,mes-1,dia)));
        
    }
    
    public void eliminaPorNombre(String eliminar){
    
        boolean encuentra = false;        
        
        for (int i = 0; i < listaAlumnos.size(); i++) {
            
            Alumno a = listaAlumnos.get(i);
            
            if (a.getNombre().equalsIgnoreCase(eliminar)){
                listaAlumnos.remove(i);
                encuentra = true;       
            } 
        }
        
        if (encuentra){
            System.out.println("Eliminado");
        } else {
            System.out.println("No existe el Alumno");
        }

        
    }
    
    public void mostrarLista(){
    
        for (Alumno aux : listaAlumnos) {
            System.out.println(aux);
              
        }
 
    }
   
        public void menu(){
    
        String opcion ;
        do {
            System.out.println("======================");
            System.out.println("=       MENU         =");
            System.out.println("======================");
            System.out.println("");
            System.out.println("1. ALTA ");
            System.out.println("2. ELIMINA POR NOMBRE");
            System.out.println("3. MODIFICAR");
            System.out.println("4. ORDENAR POR APELLIDO(ASC)");
            System.out.println("5. ORDENAR POR NOMBRE (DESC)");
            System.out.println("6. MOSTRAR EDAD");
            System.out.println("7. MOSTRAR LISTA");
            System.out.println("8. REPORTE");
            System.out.println("9. SALIR");
            System.out.println("======================");
            System.out.println("Ingrese una opcion");
            opcion = leer.next();

            switch (opcion) {
                case "1":
                    
                    ingresa();
                    break;
                    
                case "2":
                    System.out.println("Nombre de Alumno a Eliminar");
                    String eliminar = leer.next();
                    eliminaPorNombre(eliminar);
                    break;
                    
                case "3":
                   //TODO
                    break;

                case "4":
                    Collections.sort(listaAlumnos, Comparadores.ordenaPorApellidoAsc);
                    mostrarLista();
                    break;
                case "5":
                    
                    break;
                case "6":

                    break;
                case "7":
                    mostrarLista();
                    break;
                    
                    case "8":
                   
                    break;
                    
                     
                case "9":

                    System.out.println("Hasta Luego!");

                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (!opcion.equals("9"));

    }
    
}
    
    


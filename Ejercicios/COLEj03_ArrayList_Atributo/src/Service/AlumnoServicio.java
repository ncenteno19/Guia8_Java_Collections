/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cynth
 */
public class AlumnoServicio {
    
    Scanner leer;
    ArrayList <Alumno> listaAlumnos;

    public AlumnoServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listaAlumnos = new ArrayList<>();
    }
    
    

  public void crearAlumno (){
  
      ArrayList<Integer> notas = new ArrayList<>();
      
      System.out.println("Ingrese el nombre del Alumno");
      String nombre = leer.next();
      
      for (int i = 0; i < 3; i++) {
          System.out.println("Ingrese la nota " + (i+1));
          notas.add(leer.nextInt());
      }
      
    //  Alumno alum = new Alumno(nombre, notas);
      
      listaAlumnos.add(new Alumno(nombre, notas));
  
  }
  
  public boolean notaFinal(String buscar){
  
      boolean encuentra = false; 
      
      for (int i = 0; i < listaAlumnos.size(); i++) {
          
          Alumno a = listaAlumnos.get(i);
          
          if (a.getNombre().equalsIgnoreCase(buscar)){
              encuentra = true; 
              
              int suma = 0;
              for (int j = 0; j < a.getNotas().size(); j++) {
                  suma+= a.getNotas().get(j);
              }
              
              System.out.println("El promedio es "+ suma /  a.getNotas().size()); 
           
              
          }
    
      }
      
   return encuentra;
  }
  
  
  public void menu(){
    
        int opcion = 0;
        do {
            System.out.println("======================");
            System.out.println("=       MENU         =");
            System.out.println("======================");
            System.out.println("");
            System.out.println("1. CARGAR ALUMNO");
            System.out.println("2. CALCULAR NOTA FINAL");
            System.out.println("3. SALIR");
            System.out.println("======================");
            System.out.println("Ingrese una opcion");
            opcion = leer.nextByte();

            switch (opcion) {
                case 1:
                    crearAlumno();
                    break;
                case 2:
                    
                    System.out.println("Ingrese el nombre del Alumno");
                    String buscar = leer.next();
                    
                    if (!notaFinal(buscar)) {
                        System.out.println("El Alumno no se encontró. Intente nuevamente");
                    }
                    
                   break;
                case 3:
                    
        
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

//            System.out.println("Ingrese ENTER para continuar");
//            leer.next();

        } while (opcion != 3);

        
        
        //muestra lista de alumnos
        
           for (Alumno aux : listaAlumnos) {
               System.out.println(aux);
          
      }
    }
    
}

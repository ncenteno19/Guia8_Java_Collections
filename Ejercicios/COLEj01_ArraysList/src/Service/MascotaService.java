/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Comparadores.Comparadores;
import Entidades.Mascotas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author cynth
 */
public class MascotaService {
    
    private Scanner leer; 
    private ArrayList<Mascotas> razaLista;


    public MascotaService() {
        this.leer = new Scanner (System.in).useDelimiter("\n");
        this.razaLista = new ArrayList<>();
        
    }

public void cargarRaza (){

    System.out.println("Ingrese la raza de la mascota");
    String raza = leer.next();
    
    razaLista.add(new Mascotas(raza));
    
}

public void imprimirLista(){

    System.out.println("La lista de raza es:");
    for (Mascotas aux : razaLista) {
        System.out.println(aux);
        
    }
    
    System.out.println("Cantidad: "  + razaLista.size());
    
}

public void eliminaIt (String elimina){

Iterator <Mascotas> it = razaLista.iterator();

int cuenta = 0;

//elimina recorriendo la lista
while (it.hasNext()){

    if (it.next().getRaza().equals(elimina)){ // con la entidad hay que seleccionar qué se debe comparar getRaza
        it.remove();
        cuenta++;
    } 
    
     
  
}

if (cuenta==0){
 System.out.println("El perro no está en la lista");
}

//Collections.sort(razaLista); COMO USE LA ENTIDAD NO PUEDO ORDENAR POR EL SORT, SE DEBE HACER POR EL COMARATOR

Collections.sort(razaLista, Comparadores.ordenarPorRazaAsce); //ordena la lista


}





public void menu(){
    
        int opcion = 0;
        do {
            System.out.println("====================");
            System.out.println("=      MENU        =");
            System.out.println("====================");
            System.out.println("");
            System.out.println("1. INGRESAR RAZA");
            System.out.println("2. SALIR");
            System.out.println("====================");
            System.out.println("Ingrese una opcion");
            opcion = leer.nextByte();

            switch (opcion) {
                case 1:
                    cargarRaza();
                    break;
                case 2:
                    imprimirLista();
                    
                    System.out.println("Escriba una raza a eliminar");
                    String eliminar = leer.next();
                    
                    eliminaIt(eliminar);
                   
                    imprimirLista();
                    
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

//            System.out.println("Ingrese ENTER para continuar");
//            leer.next();

        } while (opcion != 2);

    }

  
    
    
}

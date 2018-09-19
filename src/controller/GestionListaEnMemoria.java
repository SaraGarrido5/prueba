/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Person;

/**
 *
 * @author aitor
 */
public class GestionListaEnMemoria {
    
 //  
    
    public static ObservableList<Person> cargarDatos(){
        //sartzen ditu taulan datuak 
        
        return FXCollections.observableArrayList(
            new Person("Sara", "Garrido", "saragarrido33@gmail.com"),
            new Person("Itziar", "Horrillo", "itziarhorrillo@gmail.com"),
            new Person("Ariane", "Gayoso", "arianegayoso@gmail.com"),
            new Person("Jone", "Izquierdo", "joneizquierdo@gmail.com"),
            new Person("Mirene", "Moreno", "mirenemoreno@gmail.com")
        );
    }     
    
//    public static void añadirDato(ObservableList<Person> lista, Person persona){
//        
//        lista.add(persona);
//    }      
//    
    
}

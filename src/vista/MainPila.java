/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import java.util.LinkedList;
import modelo.OperacionesPila;
import modelo.Pila;

/**
 *
 * @author Administrador
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<Productos> pilaP = new Pila<>();
        Pila<Productos> pilaD = new Pila<>();
        pilaP.apilar(new Productos("Carne", 2, 14000));
        pilaP.apilar(new Productos("Arroz", 4, 3000));
        pilaP.apilar(new Productos("Lentejas", 1, 5000));
        pilaP.apilar(new Productos("Spaguettis", 3, 16000));
        pilaP.apilar(new Productos("Papa", 2, 5500));
        
        OperacionesPila Operador = new OperacionesPila();
        
         pilaD = Operador.pilaDuplicada(pilaP);
        
        System.out.println("Pila \n"+pilaP.toString());
        
        System.out.println("Pila Duplicada \n"+pilaD.toString());
    }
    
}

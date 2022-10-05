/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica5cartas;

/**
 *
 * @author crist
 */

import java.util.ArrayList;
import java.util.Scanner; 
public class Practica5Cartas {

    public static void main(String[] args) {
        System.out.println("ingresa el numero de Jugadores"); 
       Scanner sc = new Scanner(System.in); 
       int numJ = sc.nextInt(); 
       CardShark card = new CardShark(numJ); 
       card.inicia(); 
    }
}

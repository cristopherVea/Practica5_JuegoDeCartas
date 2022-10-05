/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica5cartas;

/**
 *
 * @author crist
 */
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
  private ArrayList<Carta> mazo;

  public Baraja() {
    this.mazo = new ArrayList<>();
    inicializa();
  }

  public void inicializa() {
    for (Figura f: Figura.values()) {
      for( int v= 2 ; v <= 14 ; v++) {
        try {
          mazo.add(new Carta(v,f));
        } catch (FueraDeRangoException e) {
          System.out.println(e);
        }
      }
    }
  }

  public void barajar() {
    Collections.shuffle(mazo);
  }

  public ArrayList<Carta> repartir(int n) {
    ArrayList<Carta> mano = new ArrayList<>();
    for(int i=1; i<=n; i++) {
      mano.add(mazo.remove(0));
    }
    return mano;
  }
  
  public ArrayList mazo(){
       return mazo; 
  }

  @Override
  public String toString() {
    StringBuffer mazoStr = new StringBuffer();
    for (Carta c : mazo) {
      mazoStr.append(c.toString()+"\n");
    }
    return mazoStr.toString();
  }


}

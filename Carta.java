/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica5cartas;

/**
 *
 * @author crist
 */

public class Carta implements Comparable<Carta>{
  
  private int valor;
  public int getValor() {
    return valor;
  }

  public Figura getFigura() {
    return figura;
  }
  private Figura figura;
  
  public Color getColor() {
    return((figura == Figura.CORAZONES || figura == Figura.DIAMANTES)? Color.ROJO : Color.NEGRO);
  }

  public Carta(int valor, Figura figura) throws FueraDeRangoException{
    if(valor <2 || valor > 14)
      throw new FueraDeRangoException("Valor "+valor+ " fuera de rango");
    this.valor = valor;
    this.figura = figura;
  }

  public Carta(String valor, Figura figura) throws FueraDeRangoException{
    valor = valor.toUpperCase();
    if(!valor.equals("K") && !valor.equals("Q") && !valor.equals("J") && !valor.equals("A"))
      throw new FueraDeRangoException("Cadena \""+valor+ "\" fuera de rango");
    this.valor = (valor.equals("K")?13:valor.equals("Q")?12:valor.equals("J")?11:14);
    this.figura = figura;
  }

  @Override
  public String toString() {
    String valorStr= String.valueOf(this.valor);
    if( valor == 14) valorStr = "A";
    if( valor == 11) valorStr = "J";
    if( valor == 12) valorStr = "Q";
    if( valor == 13) valorStr =  "K";
    
    return valorStr+" "+this.figura;
  }

  @Override
  public int compareTo(Carta o) {
    if(this.valor > o.valor )
      return 1;
    if(this.valor < o.valor)
      return -1;
    return 0;
  }

  

}
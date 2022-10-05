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
import java.util.Random;

class Jugador {
    private ArrayList<Carta> mano;
    private int id;
    private Carta cartaLanzada;
    private int puntuacion;
    private int n2; 
    private int totalDeCartas; 
    

    public Jugador(int id) {
        this.mano = null;
        this.cartaLanzada = null;
        this.id = id;
    } 

    public Jugador(int id, ArrayList<Carta> mano) {
        this.mano = mano;
        this.cartaLanzada = null;
        this.id = id;
    }

    public int getTotalDeCartas(){
        return mano.size(); 
    }
    
    public Carta lanzarCarta(int posicionDeLaCarta) {
        int cantidadDeCartasEnMano = mano.size();
        if (cantidadDeCartasEnMano == 0) {
            return null;
        }
        this.cartaLanzada = mano.remove(posicionDeLaCarta);
        return cartaLanzada;
    }
    
    
        public Carta lanzarCarta() {
        int cantidadDeCartasEnMano = mano.size();
        if (cantidadDeCartasEnMano == 0) {
            return null;
        }
        Random random = new Random();
        int posicionDeLaCarta = random.nextInt(cantidadDeCartasEnMano);
        this.cartaLanzada = mano.remove(posicionDeLaCarta);
        return cartaLanzada;
    }

    public Carta getCartaLanzada() {
        return this.cartaLanzada;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    public ArrayList<Carta> getMano() {
        return this.mano;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
    
    public void restar3puntos(){
        puntuacion = puntuacion -3; 
    }
     
    public String toString() {
    StringBuffer mazoStr = new StringBuffer();
    for (Carta c : mano) {
      mazoStr.append(c.toString()+"\n");
    }
    return mazoStr.toString();
    
    }
  
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getId() {
        return id;
    }
    
    public ArrayList<Carta> obtenerCartas(Baraja b){
    b.barajar();
    mano = b.repartir(5);
       return mano; 
   }
   
       public ArrayList<Carta> obtenerSoloUnaCarta(Baraja b){
    b.barajar();
    mano.addAll(b.repartir(1));
       return mano; 
   }
   
   public ArrayList<Carta> obtenerCartasPorNumeroDeDado(Baraja b){
    Random r1 = new Random();
    n2 = r1.nextInt(5)+1; 
    
    b.barajar();
     mano.addAll(b.repartir(n2));
       return mano; 
   }
   
   public int getValorDado(){
       return n2; 
   }
    
}

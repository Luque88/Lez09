/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez09;

/**
 *
 * @author tss
 */
public class Auto extends Veicolo {
  //auto tutte caratteristiche di un veicolo in più ha porte e alimentazione  
    public enum Alimentazione {
        DIESEL,BENZINA
    }
    private final int porte;
    private final Alimentazione alimentazione;
    
    public Auto(String marca, int anno, int cilindrata, int porte, Alimentazione alimentazione){
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }
      public int getPorte(){
          return porte;
      } 
      public Alimentazione getAlimentazione (){
          return alimentazione;
      }
      @Override
      public String toString(){
          return super.toString() + "\n" + String.format("alimentazione %s",  this.alimentazione);
      }
}


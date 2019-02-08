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
public class Lez09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Auto auto = new Auto ("Suzuki",2015,1200,4, Auto.Alimentazione.BENZINA);
        
        Moto moto = new Moto (Moto.Tempi.DUETEMPI,"Triumph", 2018,800);
        
        Furgone furgone = new Furgone (15, "Fiat", 2001,1000);
        
        System.out.println(moto.toString());
        System.out.println("------");
        
       Garage garage = new Garage();
       
       garage.posteggia(auto );
       
       garage.posteggia(moto);
       
       garage.posteggia(furgone);
       
       System.out.println(garage.toString());
       
       Veicolo uscito = garage.esci(0);
       
       System.out.print("E' uscito il veicolo" + uscito);
       
       System.out.println(garage.toString());
              
    }
    
}
       
        
  

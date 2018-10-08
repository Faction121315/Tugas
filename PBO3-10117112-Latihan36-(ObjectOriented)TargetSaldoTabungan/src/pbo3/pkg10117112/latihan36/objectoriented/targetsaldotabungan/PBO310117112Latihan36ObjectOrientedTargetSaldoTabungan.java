/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan36.objectoriented.targetsaldotabungan;

/**
 *
 * @author MHF
 */
public class PBO310117112Latihan36ObjectOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Saldo sld = new Saldo();
        
        sld.saldoA = 3500000;
        sld.bunga  = 0.08;
        sld.saldoT = 6000000;
        
        sld.saldoKeluaran(sld.saldoA, sld.bunga, sld.saldoT);
        
        
    }
    
}

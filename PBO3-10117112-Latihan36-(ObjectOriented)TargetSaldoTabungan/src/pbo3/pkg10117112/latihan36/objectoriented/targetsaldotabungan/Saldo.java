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
public class Saldo {

    public double saldoA;
    public double bunga;
    public double saldoT;
    public int i = 1;

    public void saldoKeluaran(double saldoA, double bunga, double saldoT) {

        while (saldoA <= saldoT){
        saldoA = saldoA * bunga + saldoA;
        System.out.println("Saldo Di Bulan Ke-" + i++ + " Rp. " + saldoA);
        }
        
    }

}

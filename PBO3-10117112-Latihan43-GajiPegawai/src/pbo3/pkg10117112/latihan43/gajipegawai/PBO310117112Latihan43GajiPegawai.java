/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan43.gajipegawai;

/*
 * NAMA     : Faksi Kilat Buana Arifin Putra
 * Kelas    : IF - 3
 * NIM      : 10117112
 * Deskripsi Program  : Program ini menapilkan hasil Gaji Karyawan
 * 
 * @author MHF
 */
public class PBO310117112Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("------------------------------------");
        gajiPegawai karyawan1 = new gajiPegawai();
        karyawan1.setNama("Faksi Kilat Buana Arifin Putra");
        karyawan1.setAlamat("Jl. Pasar Inpres Pagaden");
        karyawan1.setUangTransport(250000);
        karyawan1.setUangTunjangan(300000);
        karyawan1.setGajiPokok(4500000);
        karyawan1.setTotalGaji(karyawan1.totalGaji(karyawan1.getUangTunjangan(),
                 karyawan1.getUangTransport(), karyawan1.getGajiPokok()));
        karyawan1.tampilData(karyawan1.getNama(), karyawan1.getAlamat(),
                karyawan1.getUangTunjangan(), karyawan1.getUangTransport(),
                 karyawan1.getGajiPokok(), karyawan1.getTotalGaji());

    }

}

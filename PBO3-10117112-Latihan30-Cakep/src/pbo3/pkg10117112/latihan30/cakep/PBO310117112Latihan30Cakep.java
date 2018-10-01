/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117112.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author MHF NAMA : Faksi Kilat Buana Arifin Putra KELAS : PBO3 NIM : 10117112
 *
 * Deskripsi program : Program ini berisi program untuk menjalankan tes 
 * kejujuran wkwkkwkw
 */
public class PBO310117112Latihan30Cakep {

    	//    kode text color
    public static final String FKBAP_RESET = "\u001B[0m";
    public static final String FKBAP_BLACK = "\u001B[30m";
    public static final String FKBAP_RED = "\u001B[31m";
    public static final String FKBAP_GREEN = "\u001B[32m";
    public static final String FKBAP_YELLOW = "\u001B[33m";
    public static final String FKBAP_BLUE = "\u001B[34m";
    public static final String FKBAP_PURPLE = "\u001B[35m";
    public static final String FKBAP_CYAN = "\u001B[36m";
    public static final String FKBAP_WHITE = "\u001B[37m";
//    kode background color
    public static final String FKBAP_BLACK_BACKGROUND = "\u001B[40m";
    public static final String FKBAP_RED_BACKGROUND = "\u001B[41m";
    public static final String FKBAP_GREEN_BACKGROUND = "\u001B[42m";
    public static final String FKBAP_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String FKBAP_BLUE_BACKGROUND = "\u001B[44m";
    public static final String FKBAP_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String FKBAP_CYAN_BACKGROUND = "\u001B[46m";
    public static final String FKBAP_WHITE_BACKGROUND = "\u001B[47m";
    
//    Method Utama
    public static void main(String[] args) {
        String jawab;
        Scanner scn = new Scanner(System.in);
        
        System.out.print(FKBAP_RED+"Kamu "+FKBAP_RESET);
        System.out.print(FKBAP_GREEN+"ngerjain sendiri "+FKBAP_RESET);
        System.out.print(FKBAP_YELLOW+"latihan 17 sampe "+FKBAP_RESET);
        System.out.print(FKBAP_BLUE+"latihan 30 ini? \n"+FKBAP_RESET);
        System.out.print(FKBAP_BLUE+"Jawab "+FKBAP_RESET);
        System.out.print(FKBAP_RED+"(Yoi/Enggak) : "+FKBAP_RESET);
        jawab = scn.next();
        
        String jawaban = jawab.toUpperCase();
        if (jawaban.equals("YOI")) {
            System.out.print(FKBAP_RED+"\nCakep Bener. "+FKBAP_RESET);
            System.out.print(FKBAP_PURPLE+"Good Job \n"+FKBAP_RESET);
        }else{
            System.out.print(FKBAP_RED+"\nTetep cakep sih. "+FKBAP_RESET);
            System.out.print(FKBAP_CYAN+"\nSing penting paham konsep nya yee. "
                    +FKBAP_RESET);
            System.out.print(FKBAP_BLACK+"\nKeep the code works dude."+FKBAP_RESET);  
        }
    }
    
}

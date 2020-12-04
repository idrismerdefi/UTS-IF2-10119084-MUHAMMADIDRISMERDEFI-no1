/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119084.muhammadidrismerdefi.no1;
/**
 * @author  
 * QUIZ
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program tandanya kamu
 **/
import java.util.Calendar;
import java.util.Scanner;
public class UTSIF210119084MUHAMMADIDRISMERDEFINo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Age umur = new Age(Calendar.getInstance().get(Calendar.YEAR));
        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(scanner.nextInt());
        
        //output
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + umur.getYearBirth());
        System.out.println("Hari ini tahun : " + umur.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + umur.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu " + umur.tandanyaKamu(umur.hitungUmur()));
    }
    
}

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
public class Age {
    private int yearBirth, yearNow;
    private final String red = "\u001B[31m";
    
    public Age(int yearNow){
        this.yearNow = yearNow;

    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
        public String tandanyaKamu(int umur){
        String tandanyaKamu;
        
        if (0 <= umur  && umur <= 5) {
            tandanyaKamu = "LAGI LUCU-LUCU NYA";
        }else if(5 < umur && umur <= 10){
            tandanyaKamu = "MASIH ANAK-ANAK";
        }else if(10 < umur && umur <= 13){
            tandanyaKamu = "MASIH REMAJA";
        }else if(13 < umur && umur <=19){
            tandanyaKamu = "ALAY";
        }else if(19 < umur && umur <= 29){
            tandanyaKamu = "LAGI GALAU NYARI JODOH";
        }else if(29 < umur && umur <= 35){
            tandanyaKamu = "LAGI SIBUK NYARI UANG";
        }else if(35 < umur && umur <= 150){
            tandanyaKamu = "SUDAH TUA";
        }else{
            tandanyaKamu = "TIDAK TERDETEKSI DI KEHIDUPAN";
        }
        
        return red + tandanyaKamu;
    }
    
    
    

}

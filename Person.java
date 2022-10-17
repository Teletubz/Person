/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan1;

/**
 *
 * @author hp
 */
public class Person {

     //Deklarasi atribut
    String nama; 
    String JenisKelamin;
    int umur;

    public static void main (String [] args) {
    
                // Membuat Objek
              Person person1 = new Person();
              Person person2 = new Person();

              person1.nama = "Anton";
              person1.JenisKelamin = "Laki-laki";
              person1.umur = 15;
              person2.nama = "Riko";
              person2.JenisKelamin = "Laki-laki";
              person2.umur = 16;

              System.out.println("Nama : " + person1.nama);
              System.out.println("Jenis Kelamin : " + person1.JenisKelamin);
              System.out.println("Umur : " + person1.umur);
              System.out.println("Nama : " + person2.nama);
              System.out.println("Jenis Kelamin : " + person2.JenisKelamin);
              System.out.println("Umur : " + person2.umur);
    }
}

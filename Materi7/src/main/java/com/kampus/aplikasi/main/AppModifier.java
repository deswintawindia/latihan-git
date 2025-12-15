/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampus.aplikasi.main;
import com.kampus.aplikasi.model.Mahasiswa;
/**
 *
 * @author Deswinta Windia Rahma 1324087
 */
public class AppModifier {
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa ("Deswinta Windia Rahma", 19, "1324087", "Jakarta");
        
        System.out.println("Akses langsung dari package main");
        System.out.println("Nama : " +mhs.nama); // bisa di akses 
        System.out.println("Umur : " +mhs.umur); // error, berbeda package
        System.out.println("Nim : " +mhs.nim); // error, default
        System.out.println("Alamat : " +mhs.alamat); // error, private
        
        System.out.println("\nMenampilkan melalui method tampilData(): ");
        mhs.tampilData();
    }
    
}

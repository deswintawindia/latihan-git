/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampus.aplikasi.main;
import com.kampus.aplikasi.model.Dosen;
/**
 *
 * @author Deswinta Windia Rahma 1324087
 */
public class AppInheritance {
    public static void main(String[] args) {
        Dosen d1 = new Dosen ("Septian", 30, "Jakarta", "3174000000", "Pemrograman Java Framework");
        d1.tampilinInfoDosen();
        
        System.out.println("\n=== Akses dari luar Package ===");
        System.out.println("Nama :" +d1.nama);
        System.out.println("NIK(via getter) :" +d1.getNik());

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampus.aplikasi.model;

/**
 *
 * @author Deswinta Windia Rahma 1324087
 */
public class Dosen extends Person {
    public String mataKuliah;
    
    public dosen(String nama, int umur, String alamat, String mataKuliah){
        super(nama, umur, alamat, nik);
        this.mataKuliah = mataKuliah;
        
    public void tampilInfoDosen(){
        System.out.println("=== Data Dosen ===");
        System.out.println("Nama :" +nama);
        System.out.println("Umur :" +umur);
        System.out.println("Alamat :" +alamat);
        System.out.println("NIK :" +nik);
        System.out.println("Mata Kuliah :" +mataKuliah);    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampus.aplikasi.model;
/**
 *
 * @author Deswinta Windia Rahma 1324087
 */
public class Mahasiswa {
    public String nama;
    protected int umur;
    String nim;
    private String alamat;
    
    public Mahasiswa (String name, int umur, String nim, String alamat) {
        this.nama = name;
        this.umur = umur;
        this.nim = nim;
        this.alamat = alamat;
    }
    
    public void tampilData() {
        System.out.println("Nama : " +nama);
        System.out.println("Umur : " +umur);
        System.out.println("Nim : " +nim);
        System.out.println("Alamat : " +alamat);
    }
}

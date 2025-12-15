/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampus.aplikasi.model;

/**
 *
 * @author Deswinta Windia Rahma
 */
public class Person {
    public String nama;
    protected int umur;
    String nim;
    String alamat;
    private String nik;
    
    public Person(String nama, int umur, String alamat, String nik);
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.nik = nik;
}

    public String getNik(){
        return nik;
}

    public void setNik(){
        this.nik = nik;
    }
}
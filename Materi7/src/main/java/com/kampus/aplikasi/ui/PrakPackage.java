/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kampus.aplikasi.ui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
/**
 *
 * @author Deswinta Windia Rahma 1324087
 */
public class PrakPackage extends JFrame {
    public PrakPackage() {
        setSize(300, 150);
        setTitle("Praktikum Java Package PrakPackage");
        JLabel label = new JLabel("Halo, Ini Praktikum Package di Java Swing", SwingConstants.CENTER);
        add(label);
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
}
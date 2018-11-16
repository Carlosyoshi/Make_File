/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cchasipanta.controlador;

import java.io.FileNotFoundException;

/**
 *
 * @author LAB4-PC7
 */
public class Aplicacion {
    public static void main(String[] args) throws FileNotFoundException {
        Report report = new Report();
        report.setNameFile("Yoshi");
        report.setTitle("Carlos");
        report.setContent("Ya estamos en sexto");
        
        report.makeReport();
    }
}
//crear interfaz grafica q tenga nombre de archivo titulo y contenido

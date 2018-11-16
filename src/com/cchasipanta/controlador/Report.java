/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cchasipanta.controlador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author LAB4-PC7
 */
public class Report {
    String nameFile;
    String title;
    String content;

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void makeReport() throws FileNotFoundException{
        if ((getNameFile()!= null) && (getTitle()!= null) && (getContent()!= null)) {
            //se creara el archivo
            try {
                 File file = new File(getNameFile()+ ".txt");
            FileOutputStream fos= new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(getContent());
                bw.close();
            } catch (IOException e) {
            }
           
        } else {
            System.out.println("Ingresa datos del archivo");
        }
    }
}

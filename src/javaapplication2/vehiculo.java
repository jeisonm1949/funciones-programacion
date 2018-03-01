/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.Color;

/**
 *
 * @author jeison
 */
public class vehiculo extends carro {

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNum_llantas(int num_llantas) {
        this.num_llantas = num_llantas;
    }
   
    String color,placa,informacion; 

    public String getInformacion() {
        return informacion;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }

    public int getNum_llantas() {
        return num_llantas;
    }
    int num_llantas; 
    
    
    public void unir () { 
        
        System.out.println(color + placa + modelo);
        
        
        
        
        
    }
    
     

}
    


    

    
        
      
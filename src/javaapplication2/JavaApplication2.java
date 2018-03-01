/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;


/**
 *
 * @author jeison
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        vehiculo obj1 = new vehiculo ();
        
        obj1.setColor("Azul");
        obj1.setPlaca("ODY156");
        obj1.setNum_llantas(5);
        obj1.setInformacion("cero kilometros con rines de lujo");
        
        
        System.out.println(obj1.getColor());
        System.out.println(obj1.getPlaca());
        System.out.println(obj1.getNum_llantas());
        System.out.println(obj1.getInformacion());
         
        carro obj2 = new carro ();
        
        obj2.setModelo(2017); 
        obj2.setInformacion1("mustang con 1000 caballos de fuerza");
        obj2.unir();
        
        
        
        System.out.println(obj2.getModelo());
        System.out.println(obj2.getInformacion1()); 
        
        
        
        
        
        
        
        
        
                
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

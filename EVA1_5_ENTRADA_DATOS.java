/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada_datos;

import java.util.Scanner;



/**
 *
 * @author lozan
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos variables
        String marca;
        String modelo;
        int year;
        double precio;
        //¿como se captura informacion desde el teclado?
        //SCANNER 
        //Herramienta --> Clase: nos proporcionan muchas herramientas para trabajar
        Scanner captu; //declaramos la herramienta previamente
                       //hay que importarla (hacer un import)
        captu = new Scanner (System.in); //Creamos la herramienta
        
        //hay que indicarle al usuario que capturar
        System.out.println("introduce la marca del vehiculo");
        //Capturamos --> una asignacion
        
        marca = captu.nextLine();//les regresa todo el texto hasta cuando le demos enter
                                 //se presiona la tecla "enter"
                                 
        System.out.println("introduce el modelo del vehiculo");
        modelo = captu.nextLine();
        System.out.println("introduce el año");
        year = captu.nextInt();
        System.out.println("introduce el precio");
        precio = captu.nextDouble();
                
        System.out.println("DATODS CAPTURADOS-----------------");
        System.out.println("marca");
        System.out.println("modelo");
        System.out.println("year");
        System.out.println("Precio");
        
        
         


    }
    
}

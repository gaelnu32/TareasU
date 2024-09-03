/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_pelicula;



import java.util.Scanner;

/**
 *
 * @author lozan
 */
public class EVA1_6_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;
        
        
        Scanner captu;
        
       captu = new Scanner (System.in);
        
        System.out.println("Introduce el nombre de la pelicula");
        nombre = captu.nextLine();
        System.out.println("Introuce el genero de la pelicula");
        genero = captu.nextLine();
        System.out.println("introduce la duracion de la pelicula");
        duracion = captu.nextInt();
        System.out.println("introduce los miembros del reparto");
        reparto = captu.nextLine();
        System.out.println("introduce la clasificacion de la pelicula");
        clasificacion = captu.nextLine();     
        
        
    }
    
}

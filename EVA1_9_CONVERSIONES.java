/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_conversiones;

import java.util.Scanner;

/**
 *
 * @author lozan
 */
public class EVA1_9_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double far, cent;
        Scanner captu = new Scanner(System.in);
        System.out.println("Temperatura grados celcius");
        far = captu.nextDouble();
        cent = (far - 32) / 1.8;
        System.out.println("°c = " + cent);
        
        System.out.println("temperatura en grados farenheit");
        cent = captu.nextDouble();
        far = (cent * 1.8) + 32;
        System.out.println("f° = " + far);3
                
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_rango;

import java.util.Scanner;
/**
 *
 * @author lozan
 */
public class EVA1_17_RANGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu;
        captu = new Scanner (System.in);
        int calif;
      System.out.println("Cuanta calificacion sacaste?");
      calif = captu.nextInt();
      captu.nextLine();
      
      if (calif >= 60 && calif <= 100) {
          System.out.println("valido");
      }else{
          System.out.println("no valido");
      }
    }
    
}

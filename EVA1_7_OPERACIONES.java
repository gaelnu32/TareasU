/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

/**
 *
 * @author lozan
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Operaciones aritmeticas
        int x = 10;
        int y = 5;
        //se puede declarar multiples variables en una sola linea de texto
        int suma, resta, divi, multi, pot, raiz;
        //suma y resta
        suma = x + y; //operador de suma +
        System.out.println("suma de x + y");
        System.out.println(suma);
        resta = x - y;
        System.out.println("resta de x - y");
        System.out.println(resta);
        multi = x * y; //multiplicaciones
        System.out.println("multiplicacion de x * y");
        System.out.println(multi);
        
        //si dividimos entero java nos da como resultado un entero
        //si queremos numeros decimales tenemos que dividir con punto decimal
        
        divi = x / y; 
        System.out.println("division de x(10) / y(5)");
        System.out.println(divi);
        //para divisiones con punto decimal primero cambiamos los valores de x e y
        x = 7;
        y = 3;
        divi = x / y;
        System.out.println("division de x / y");
        System.out.println(divi);
        
        double val1 = 11;
        double val2 = 3;
        double diviD;
        diviD = val1 / val2;
        System.out.println("division entre numeros decimales");
        System.out.println(diviD);
        
        
       
        
        
     
        
        
        
        
        
        
    }
    
}

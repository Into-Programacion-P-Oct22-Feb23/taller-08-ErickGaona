/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numero = 25;
        int num2;
        int num3;
        int num4;       
        String mensaje = "";
        
        mensaje = mensaje + "Nº"+"\t"+"x2"+"\t"+"x3"+"\t"+"x4"+"\n";
        for(int num = 25; num >= 1; num--){
            num2 = numero * 2;
            num3 = numero * 3;
            num4 = numero * 4;
            
            mensaje = mensaje + numero + "\t" + num2 + "\t" + num3 
                    + "\t" + num4 +"\n";
            numero --;
            num2 --;
            num3 --;
            num4 --;
            }
        System.out.println(mensaje);
        }
    }
    


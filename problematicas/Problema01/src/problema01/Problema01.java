package problema01;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gaoneiz
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int contador1 = 0;
        int contador = 1;
        int num_jugadores;
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String mensaje = "";
        String mensaje1 = "";
        String edades = "";
        double promedio_edad = 0;
        double promedio_estatura = 0;
        String opcion;
        boolean bandera = true;
        int i;

        System.out.println("Cuantos jugadores desea ingresar?");
        num_jugadores = entrada.nextInt();
        entrada.nextLine();
        int edades_jugadores []= new int[num_jugadores];

        mensaje = mensaje + "Listado de jugadores" + "\n";

        for ( i = 1; i <= num_jugadores; i++) {

            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();

            System.out.println("Ingrese posicion del jugador");
            posicion = entrada.nextLine();

            System.out.println("Ingrese edad del jugador");
            //edades_jugadores[i] = entrada.nextInt();
            edad=entrada.nextInt();
            mensaje1="\n"+mensaje1+edad+"\n";
            

            System.out.println("Ingrese estatura del jugador");
            estatura = entrada.nextDouble();
            
                    


            mensaje = mensaje + contador + "." + "" + "_ " + nombre + " "
                    + "," + "posicion: " + posicion + ", " + "edad: " + edad + ","
                    + "estatura: ," + estatura + "\n";
           
            promedio_edad = (promedio_edad + edad/num_jugadores);
            promedio_estatura = (promedio_estatura + estatura/num_jugadores);
            contador = contador + 1;
            contador1 = contador1 + 1;

          
            entrada.nextLine();
           
        }
        
        
        System.out.println(mensaje);
        System.out.println("Listado de edades:"+mensaje1);
        System.out.printf("Promedio de edades: %.2f\n" , promedio_edad);
        System.out.printf("Promedio de estatura:%.2f\n ",promedio_estatura);
        //System.out.println(edades_jugadores);
    }

}

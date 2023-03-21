package ejercicioex6;

import java.util.Scanner;

/**
 * Declarar y dimensionar una matriz de 20 x 20
 * pedir el usuario que ingrese 5 palabras de 3 a 5 letras
 * guardar las palabras en filas elegidas de manera aleatoria;
 * los espacios vacíos se rellenan con números aleatorios del 0 al 9
 * imprimir la sopa de letras 
 * @author Wendy
 */
public class EjercicioEx6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [][] sopa = new String [20][20];
        int cont = 0, F = 20, C = 20;
        
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                sopa[i][j] = ("*");
            }
        }
        imprimir(sopa, F, C); ///llamada a procedimiento de impresión
                   
        do{
          System.out.println("Ingrese una palabra de entre 3 y 5 letras");
            String palabra = leer.nextLine();
            cont++;
        int x = (int) Math.floor((Math.random()*20));
        int y = (int) Math.floor((Math.random()*10));
//                for (int i = x; i < x; i++) {este loop NO es necesario porque son palabras en una sola dimensión -horizontal)
                for (int j = 0; j < palabra.length(); j++) {
                    sopa[x][j+y] = palabra.substring(j, j+1).toUpperCase();
                    }  
//                }
                }while(cont<5);
        
        imprimir(sopa, F, C); ///llamada a procedimiento de impresión
        
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
             if (sopa[i][j] == "*"){
                 sopa[i][j] = String.valueOf((int)Math.floor(Math.random()*10));
             }   
            }
        }
        imprimir(sopa, F, C); ///llamada a procedimiento de impresión
    }
    
    
/// procedimiento para imprimir///
    public static void imprimir(String [][] matriz, int F, int C) {
    for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
            System.out.print("[" + matriz[i][j] +"]");
        }
        System.out.println("");
    }
        System.out.println("------------------------------------------------------------");
        System.out.println("");
}
    
}

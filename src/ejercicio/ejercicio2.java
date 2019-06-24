
package ejercicio;

import java.util.Scanner;

public class ejercicio2 {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][] = new int [3][3];
        
        System.out.println("Escriba la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
                
            }
        }
        System.out.println("\nMatriz original: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
                
            }
            System.out.println("");
        }
        int from;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                from = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = from;
            }
        }
        System.out.println("\nLa matriz transpuesta es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("\nLa matriz multiplicado es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]= matriz[i][j]*2;
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }   
    }
}

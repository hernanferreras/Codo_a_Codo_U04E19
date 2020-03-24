
package u04e19;

import java.util.Scanner;
public class U04E19 {

    public static void main(String[] args) {
       int filas, i, h;
       char symbol= '*';
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese la cantidad de filas que tiene la escalera: ");
       filas = entrada.nextInt();
        for (i=1; i<=filas; i++){
           System.out.print(symbol);
            for (h=1; h<=filas-i; h++){
                System.out.print(symbol);
            }
        System.out.print("\n");
       }
    }
}
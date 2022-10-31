package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    Realiza un programa que muestre la tabla de multiplicar de un número introducido por teclado. Por ejemplo, si se
    introduce el número 3 se debe imprimir lo siguiente:
        3 x 1 = 3
        3 x 2 = 6
        3 x 3 = 9
        3 x 4 = 12
        3 x 5 = 15
        3 x 6 = 18
        3 x 7 = 21
        3 x 8 = 24
        3 x 9 = 27
        3 x 10 = 30
     */
    public static void main(String[] args) {

        //Decalramos las variables
        int num ;
        int multiplicador = 1;

        //Declaramos el scanner par poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca el numero de la tabla que desea realizar y lo guardamos en la variable num
        System.out.println("¿Que tabla desea realizar?");
        num = sc.nextInt();

        do {
            System.out.println (num + " x " + multiplicador + " = " + num * multiplicador ); //Imprimimos el numero introducido x el multiplicador igual al resultado de la multiplicación de estos dos
            multiplicador += 1;                                                              //E incrementamos el multiplicador en 1
        } while (multiplicador<=10);                                                         //Mientras el multiplicador sea menor o igual a 10

        //Cerramos el scanner
        sc.close();
    }
}

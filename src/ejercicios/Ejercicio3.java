package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    /*
    Realiza un programa que sume los números desde el 1 hasta un número N que se introducirá por teclado.
    Si el usuario introduce un 5, el programa debe devolver la suma de 1+2+3+4+5.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int num;
        int i=1;
        int suma=0;

        //Declaramos el scaner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un numero entero y lo guardamos en la variable num
        System.out.print("Introduce un numero entero: ");
        num = sc.nextInt();

        do {
            suma+=i;        //Le sumamos a la variable suma i
            i++;            //E incrementamos i en 1
        } while (i <= num); //Mientras i sea menor o igual que el numero introducido por el usuario

        //Imprimimos el resultado de la suma
        System.out.println("La suma de los numeros de 1 a "+num+" es de "+suma);

        //Cerramos el scanner
        sc.close();
    }
}

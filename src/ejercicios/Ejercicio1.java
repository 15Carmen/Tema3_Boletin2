package ejercicios;

public class Ejercicio1 {
    /*
    Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20).
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int numero = 1;

        do {
            System.out.println(numero); //Imprimimos la variable numero
            numero++;                   //Y la incrementamos en 1
        }while (numero<=20);            //Mientras numero sea menor o igual a 20

    }
}

package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta adivinarlo. Es decir,
    el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador
    si es mayor, menor o igual al número que ha pensado).
     */

    public static void main(String[] args) {

        //Declaramos las variables
        int random;         //Variable donde vamos a guardar el numero generado por el metodo Math.random
        String respuesta;   //Variable donde vamos a guardar la respuesta del usuario
        int minimo = 1;     //Variable donde vamos a guardar el mínimo del rango de números que vamos a ir actualizando a medida que le demos pistas al ordenador
        int maximo = 100;   //Variable donde vamos a guardar el máximo del rango de números que vamos a ir actualizando a medida que le demos pistas al ordenador

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);


        do {
            random = (int) (Math.random() * (maximo-minimo) + minimo);  //Declaramos que el numero random se genere dentro del rango de maximo y minimo

            //Le preguntamos al usuario si el número random es el que pensaba y guardamos la respuesta en la variable cadena
            System.out.println("Es " + random + " el numero que estas pensando?");
            respuesta = sc.next();

            if ("mayor".equals(respuesta)) {                            //Si la respuesta del usuario es mayor
                minimo = random + 1;                                    //Declaramos que el minimo sea el numero random generado mas 1
            } else if ("menor".equals(respuesta)) {                     //Si la respuesta es del usuario es menor
                maximo = random - 1;                                    //Declaramos que el máximo es el numero random generado menos 1
            } else if (!"igual".equals(respuesta)) {                    //Si no es ninguna de las respuestas anteriores o igual
                System.out.println("Respuesta no valida");              //Lanzamos un mensaje de error
            }

        } while (!respuesta.equals("igual"));                           //Todas estas instrucciones se hacen siempre y cuando la respuesta del usuario sea distinta de igual

        //Cuando salimos del bucle se imprime un mensaje de enhorabuena
        System.out.println("Bien! He acertado!!");

        //Cerramos el scanner
        sc.close();

    }
}

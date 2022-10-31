package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta adivinarlo. Es decir,
    el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador
    si es mayor, menor o igual al número que ha pensado).
     */

    public static void main(String[] args) {
        int random;
        int randomMayor;
        String respuesta;

        Scanner sc = new Scanner(System.in);

        do {
            random = (int) (Math.random()*100);

            System.out.println("Es " + random + " el numero que estas pensando?");
            respuesta=sc.next();

            if ("mayor".equals(respuesta)) {


            } else if ("menor".equals(respuesta)) {
                random = (int) (Math.random() * random);
            } else{
                System.out.println("Respuesta no valida");
            }

        }while (!respuesta.equals("igual"));

        System.out.println("Es el número!!!!");



    }
}

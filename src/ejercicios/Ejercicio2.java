package ejercicios;

public class Ejercicio2 {
    /*
    Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int num = 1;

        do {
            if (num%2==0){                  //Si el numero es par
                System.out.println(num);    //imprimimos el numero
            }
            num++;                          //e incrementamos el numero en 1
        }while (num<=200);                  //Mientras el numero sea menor o igual que 200
    }
}

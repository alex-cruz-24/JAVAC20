package b2;

import java.util.Scanner;

public class Ejercicio{

    public static void main(String[] args) {

        int num1,num2,resultadoSuma = 0;

        //Hace el ingreso del primer dato
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digíte el primer número: ");
        num1=scanner.nextInt();

        //Hace el ingreso del segundo dato
        System.out.println("Digíte el segundo número: ");
        num2=scanner.nextInt();

        //Hace el calculo de los dos datos
        resultadoSuma = num1+num2;
        System.out.println("El resultado de la operación es: " + resultadoSuma);
        scanner.close();

    }
}
package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        System.out.println("**** pizzerias people ****");
        System.out.println("--------------------------");
        System.out.println("pizza1: Napolitana");
        System.out.println("pizza2: Carnes");
        System.out.println("pizza3: Hawaina");

        //DECLARANDO NUESTRAS VARIABLES
        String nombreCliente;
        String direccionCliente;
        String telefenoMovilCliente;
        int pizzaSeleccionada;
        int costoUnitarioProducto;
        int numeroPizzas;
        int totalVenta;
        byte tipoPizza;

        //PROCESO
        //1. CARGAR LAS VARIABLES (LLAMAR LA VARIABLE)

        System.out.print("Digite su nombre: ");
        nombreCliente=entradaTeclado.next();
        System.out.print("digite el numero de pizzas: ");
        numeroPizzas=entradaTeclado.nextInt();
        System.out.println("que numero de pizza quiere");
        tipoPizza=entradaTeclado.nextByte();

        System.out.print("Digite el costo de una pizza: ");
        costoUnitarioProducto=entradaTeclado.nextInt();

        // CALCULAMOS LAS OPERACIONES ARITMETICAS QUE SEAN NECESARIAS
        totalVenta=costoUnitarioProducto*numeroPizzas;

        //MOSTRANDO EL RESULTADO (SALIDA POR CONSOLA)
        System.out.println(" SEÑOR:"+nombreCliente+" USTED COMPR0:"+ numeroPizzas+" PIZZAS SU TOTAL SERIA "+totalVenta+ " MIL PESOS ");
        System.out.println("su pizza fue la numero " +tipoPizza);
    }
}
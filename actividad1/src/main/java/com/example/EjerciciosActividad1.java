package com.example;

import java.util.Scanner;

public class EjerciciosActividad1 {
    public static void main(String[] args) {
        /* Declaración de variables */
        System.out.println("Declaración de variables: ");
        // Declaracion variable int
        int numeroUno = 10;
        System.out.println("el numero int es: " + numeroUno);

        // Declaracion variable double
        double numeroDos = 3.5;
        System.out.println("el numero double es: " + numeroDos);

        // Declaracion variable String
        String mensaje = "hola mundito";
        System.out.println(mensaje);
        System.out.println();

        /* Tipos de datos primitivos */
        System.out.println("Tipos de datos primitvos: ");
        // implementacion declaraciones:
        byte numeroTres = 1;
        short numeroCuatro = 100;
        int numeroCinco = 100000;
        long numeroSeis = 10000000;
        float numeroSiete = 90000;
        double numeroOcho = 5.4;
        boolean aprobacion = true;
        char aprobacionDos = 'F';

        System.out.println(numeroTres);
        System.out.println(numeroCuatro);
        System.out.println(numeroCinco);
        System.out.println(numeroSeis);
        System.out.println(numeroSiete);
        System.out.println(numeroOcho);
        System.out.println(aprobacion);
        System.out.println(aprobacionDos);
        System.out.println();

        // Operacion aritmetica basica
        System.out.println("la suma es: ");
        int numeroSuma = 5;
        int numeroSuma2 = 5;
        int resultado = numeroSuma + numeroSuma2;
        System.out.println(resultado);

        // programa condicional
        boolean aprobacionVerdadera = true;

        if (aprobacionVerdadera) {
            System.out.println("La aprobacion es verdadera");
        } else {
            System.out.println("la aprobacion es falsa");
        }
        System.out.println();

        /* Tipos de datos no primitivos */
        System.out.println("Tipos de datos no primitivos");
        String mensaje2 = "esto es un mensaje que se muestra en consola";
        System.out.println(mensaje2);

        // Array
        int[] posiciones = new int[3];
        System.out.println(posiciones);
        System.out.println();

        /* Operadores aritméticos */
        System.out.println("Operadores aritmeticos: ");
        // suma
        int numeroArimetico = 5;
        int numeroArimetico2 = 2;
        int res1 = numeroArimetico + numeroArimetico2;
        int res2 = numeroArimetico - numeroArimetico2;
        int res3 = numeroArimetico * numeroArimetico2;
        double res4 = numeroArimetico / numeroArimetico2;
        int res5 = numeroArimetico % numeroArimetico2;
        System.out.println("suma: ");
        System.out.println(res1);
        System.out.println("resta");
        System.out.println(res2);
        System.out.println("multiplicacion: ");
        System.out.println(res3);
        System.out.println("division: ");
        System.out.println(res4);
        System.out.println("modulo: ");
        System.out.println(res5);
        System.out.println();

        // incremento y decremento
        int numeroRaro = 5;
        numeroRaro++;
        System.out.println("valor inicial de 5: ");
        System.out.println("aumento de 1: " + numeroRaro);

        numeroRaro--;
        System.out.println("valor inicial de 6");
        System.out.println("decremento de 1: " + numeroRaro);
        System.out.println();

        /* Operadores de asignación */
        int numerito = 6;
        numerito += 10;
        System.out.println("agregar 10: ");
        System.out.println(numerito);
        int numerito2 = 10;
        numerito2 -= 5;
        System.out.println("quitar 5: ");
        System.out.println(numerito2);
        int numerito3 = 2;
        numerito3 *= 2;
        System.out.println("multiplicar 2");
        System.out.println(numerito3);
        int numerito4 = 6;
        numerito4 /= 2;
        System.out.println("divido entre 2");
        System.out.println(numerito4);
        int numerito5 = 5;
        numerito5 %= 1;
        System.out.println("calcula el modulo");
        System.out.println(numerito5);
        System.out.println();

        /* Operadores de Comparacion */
        int numerote1 = 2;
        int numerote2 = 2;
        boolean comparacionNumerotes1 = (numerote1 == numerote2);
        System.out.println("los numeros son iguales? " + comparacionNumerotes1);
        boolean comparacionNumerotes2 = (numerote1 != numerote2);
        System.out.println("estos 2 numeros son diferentes? " + comparacionNumerotes2);

        boolean comparacionNumerotes3 = (numerote1 > numerote2);
        System.out.println("el numerote1 es mayor al numerote2? " + comparacionNumerotes3);

        boolean comparacionNumerotes4 = (numerote1 < numerote2);
        System.out.println("el numerote1 es menor al numerote2? " + comparacionNumerotes4);

        boolean comparacionNumerotes5 = (numerote1 >= numerote2);
        System.out.println("el numerote1 es mayor/igual al numerote2? " + comparacionNumerotes5);

        boolean comparacionNumerotes6 = (numerote1 <= numerote2);
        System.out.println("el numerote1 es menor/igual al numerote2? " + comparacionNumerotes6);

        if (numerote1 == numerote2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("los numeros no son iguales");
        }
        System.out.println();

        /* Operadores logicos */

        int numerosLogicos1 = 3;
        int numerosLogicos2 = 6;
        boolean comparacionLogica1 = (numerosLogicos1 == 3 && numerosLogicos2 == 6);
        System.out.println("Los numeros son 3 y 6? " + comparacionLogica1);

        boolean comparacionLogica2 = (numerosLogicos1 == 3 || numerosLogicos2 == 6);
        System.out.println("Los numeros son 3 o 6? " + comparacionLogica2);

        boolean comparacionLogica3 = (numerosLogicos1 == 3 || numerosLogicos2 == 6);
        System.out.println("Si los numeros son iguales, invertido seria un? " + !comparacionLogica3);

        int edadLogica = 19;
        int ingresosMensuales = 3500;

        boolean esAprobado = (edadLogica >= 18) && (ingresosMensuales >= 3000);

        if (esAprobado) {
            System.out.println("Cumple con la edad Y los ingresos");
        } else {
            System.out.println("No cumple ambas condiciones.");

        }
        System.out.println();

        /* If */
        int numeroIf1 = 2;
        int numeroIf2 = 4;
        if (numeroIf1 < numeroIf2) {
            System.out.println("el numero 4 es mayor que el 2");
        }

        if (numeroIf1 > numeroIf2) {
            System.out.println("el numero 4 es mayor que el 2");
        } else {
            System.out.println("No es mayor");
        }

        if (numeroIf2 < 3) {
            System.out.println("es rango bajo ya ques menor a 3");
        } else {
            if (numeroIf2 > 3 && numeroIf2 < 6) {
                System.out.println("es rango medio porque es mayor a 3 pero menor a 6 ");
            } else {
                System.out.println("Ya es rango alto, es mayor a 7");
            }
        }
        System.out.println();

        /* Operador ternario */
        int edad = 18;
        String confirmacionEdad = (edad >= 18) ? "su edad es mayor o igual a 18" : "su edad no es mayor a 18";
        System.out.println(confirmacionEdad);

        int precioProducto = 5000;
        int cantidadProducto = 10;
        double descuento = (cantidadProducto >= 3) ? precioProducto * 0.3 : 0.0;

        double precioDescuento = precioProducto - descuento;

        System.out.println("tu precio con descuento es: " + precioDescuento);

        int numeroPar = 4;

        String comparacionPar = (numeroPar % 4 == 0) ? "El numero es par" : "El numero es impar";
        System.out.println(comparacionPar);

        /* switch */
        Scanner opciones1 = new Scanner(System.in);

        System.out.println("Ingrese un dia de la semana parcero: ");
        String diaSemana = opciones1.nextLine();

        switch (diaSemana) {
            case "lunes":
                System.out.println("1");
                break;
            case "martes":
                System.out.println("2");
                break;
            case "miércoles":
                System.out.println("3");
                break;
            case "jueves":
                System.out.println("4");
                break;
            case "viernes":
                System.out.println("5");
                break;
            case "sábado":
                System.out.println("6");
                break;
            case "domingo":
                System.out.println("7");
                break;
            default:
                System.out.println("Ese dia no existe, trateme serio");
        }

        Scanner opciones2 = new Scanner(System.in);

        System.out.println("Ingrese una calificacion de 1 a 5: ");
        int calificacionTotal = opciones2.nextInt();

        switch (calificacionTotal) {
            case 1:
                System.out.println("Insuficiente");
                break;
            case 2:
                System.out.println("Bien");
                break;
            case 3:
                System.out.println("Notable");
                break;
            case 4:
                System.out.println("Sobresaliente");
                break;
            case 5:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("esa calificacion no existe");
        }

        Scanner opciones3 = new Scanner(System.in);

        System.out.println("Ingrese un numero entero del 1 al 4 para elegir tu estacion: ");
        int numeroEstacion = opciones3.nextInt();

        switch (numeroEstacion) {
            case 1:
                System.out.println("Invierno");
                break;
            case 2:
                System.out.println("Primavera");
                break;
            case 3:
                System.out.println("Verano");
                break;
            case 4:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Número no válido");
        }
    }
}

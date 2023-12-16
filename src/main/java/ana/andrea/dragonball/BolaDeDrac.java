/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ana.andrea.dragonball;

import java.util.Scanner;

/**
 *
 * @author Ana Carbonell Prieto
 * @author Andrea Pérez Carbonell
 */
public class BolaDeDrac {

    private static Scanner input;
    private static int b1, b2, b3, b4, b5, b6, b7;
    private final static String SUMA = "+";
    private final static String MULT = "*";
    private final static int NUM_MIN_FACTORIAL = 1;
    private final static String VOCALES = "aeiou";
    private final static int NUM_INTENTOS = 3;

    public static void main(String[] args) throws InterruptedException {
        input = new Scanner(System.in);
        iniciarPartida();
    }

    private static void iniciarPartida() throws InterruptedException {
        generarBolas();
        mostrarFinal(iniciarNiveles());
    }

    private static boolean iniciarNiveles() throws InterruptedException {
        if (!mostrarInicio()) return false;
        if (!mostrarNivel1()) return false;
        if (!mostrarNivel2()) return false;
        if (!mostrarNivel3()) return false;
        if (!mostrarNivel4()) return false;
        return mostrarNivel5();
    }

    private static boolean mostrarInicio() {
        String mensaje = Mensaje.INICIO;
        System.out.println(mensaje);
        return iniciarIntentos("Introdueix un 1 vols que l'accepten: ", 1);
    }

    private static boolean mostrarNivel1() {
        int n1 = generarNumAleatorio(10, 0);
        int n2 = generarNumAleatorio(30, 20);
        String mensaje = String.format(Mensaje.LVL1, n1, n2);
        System.out.println(mensaje);
        //n1 = 10; ESTO ERA PROBAR QUE SÍ FUNCIONABA, LO DEJO POR SI
        //n2 = 20;
        int resultado = 0;

        for (int x = n1; x <= n2; x++) {
            System.out.print(x + ((x == n2) ? "" : SUMA));
            resultado += x;
        }

        System.out.println("\nLa respuesta correcta seria: " + resultado);
        return true;
        //FALTARIA LLAMAR AQUÍ AL METODO DE GANAR O NO
    }

    private static boolean mostrarNivel2() {
        String mensaje = String.format(Mensaje.LVL2, b1, b2);
        //StringBuilder cadena = new StringBuilder();
        //String cadena1 = "erjw3";
        //String cadena2 = "A3q2q";

        String cadena = generarCadenaAlfanumerica(b2);
        String cadena2 = generarCadenaAlfanumerica(b2);

        String cadenaResultado = "";

        System.out.println("La mezcla sagrada de las cadenas de caráctes " + cadena + " i " + cadena2);
        for (int i = 0; i < cadena.length(); i++) {

            cadenaResultado = cadenaResultado.concat(String.valueOf(cadena2.charAt((cadena2.length() - 1) - i)));
            cadenaResultado = cadenaResultado.concat(String.valueOf(cadena.charAt(i)));

        }
        System.out.println("\nCorresponde a la cadena: " + cadenaResultado);
        return true;
    }

    private static boolean mostrarNivel3() {
        String mensaje = String.format(Mensaje.LVL3, b2, b3, b3);
        //B3=5; ESTO ERA PARA PROBAR

        int resultado = NUM_MIN_FACTORIAL;
        for (int i = b3; i >= NUM_MIN_FACTORIAL; i--) {
            System.out.print(i + ((i == NUM_MIN_FACTORIAL) ? "" : MULT));
            resultado *= i;
        }
        System.out.println("\nEl resultado es: " + resultado);
        return true;
    }

    private static boolean mostrarNivel4() throws InterruptedException {
        int n = generarNumAleatorio(8, 12);
        String mensaje = String.format(Mensaje.LVL4, n, n);
        System.out.println(mensaje);

        String cadena1 = generarCadenaVocales(n);
        String cadena2 = generarCadenaVocales(n);
        String cadena3 = generarCadenaVocales(n);

        String cadenas = String.format("""
                          Cadena 1: %s
                          Cadena 2: %s
                          Cadena 3: %s
                          """, cadena1, cadena2, cadena3);

        System.out.println(cadenas);

        String cadena = generarCadenaVocales(2);
        System.out.println(cadena);

        return true;
    }

    private static boolean mostrarNivel5() {
        String mensaje = String.format(Mensaje.LVL5, b4, b5, b6, b7, b4, b5, b6, b7);
        System.out.println(mensaje);
        int resultado = calcularMCM(b4, b5);
        resultado = calcularMCM(resultado, b6);
        resultado = calcularMCM(resultado, b7);
        return iniciarIntentos("MCM: ", resultado);
    }
    
    private static void mostrarFinal(boolean haGanado) {
        if (haGanado) {
            System.out.println("Enhorabona!! Heu aconseguit les 7 boles de Drac. El món torna a respirar tranquil. Fins un altra amics!");
        } else {
            System.out.println("Malauradament, la aventura ha acabat i el món torna a ser un lloc insegur. Una llàstima!");
        }
        System.out.println("Adéu.");
    }
    
    private static boolean iniciarIntentos(String mensaje, int resultado) {
        for (int i = 0; i < NUM_INTENTOS; i++) {
            if (validarRespuesta(pedirEntero(mensaje), resultado)) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean iniciarIntentos(String mensaje, String resultado) {
        for (int i = 0; i < NUM_INTENTOS; i++) {
            if (validarRespuesta(pedirCadena(mensaje), resultado)) {
                return true;
            }
        }
        return false;
    }

    private static int calcularMCM(int a, int b) {
        int num1 = a;
        int num2 = b;

        do {
            int resto = num1 % num2;
            num1 = num2;
            num2 = resto;
            if (resto == 0) {
                break;
            }
        } while (true);

        return a * b / num1;
    }

    private static int pedirEntero(String mensaje) {
        do {
            System.out.print(mensaje);
            if (input.hasNextInt()) {
                return input.nextInt();
            }
            System.out.println("Error! El tipus de dades introduït és incorrecte");
            input.next();
        } while (true);
    }

    private static String pedirCadena(String mensaje) {
        do {
            System.out.print(mensaje);
            if (input.hasNext()) {
                return input.next();
            }
            System.out.println("Error! El tipus de dades introduït és incorrecte");
            input.next();
        } while (true);
    }

    private static boolean validarRespuesta(int respuesta, int resultado ){
        if (respuesta == resultado) {
            return true;
        }
        System.out.println("Resposta incorrecta. Torna a intentar-ho.");
        return false;
    }

    private static boolean validarRespuesta(String respuesta, String resultado) {
        if (respuesta.equals(resultado)) {
            return true;
        }
        System.out.println("Resposta incorrecta. Torna a intentar-ho.");
        return false;
    }

    private static void generarBolas() {
        b1 = generarNumAleatorio(3, 1);
        b2 = generarNumAleatorio(7, 4);
        b3 = generarNumAleatorio(7, 4, b2);
        b4 = generarNumAleatorio(7, 4, b2, b3);
        b5 = generarNumAleatorio(7, 4, b2, b3, b4);
        b6 = generarNumAleatorio(3, 1, b1);
        b7 = generarNumAleatorio(3, 1, b1, b6);
    }

    private static String generarCadenaAlfanumerica(int largo) {
        StringBuilder cadena = new StringBuilder();
        do {
            char random = (char) generarNumAleatorio(122, 48);
            if (random > 56 && random < 65 || random > 90 && random < 97) {
                continue;
            }
            cadena.append(random);
        } while (cadena.length() < largo);
        return cadena.toString();
    }

    private static String generarCadenaVocales(int largo) {
        StringBuilder cadena = new StringBuilder();
        do {
            int random = generarNumAleatorio(VOCALES.length() - 1, 0);
            cadena.append(VOCALES.charAt(random));
        } while (cadena.length() < largo);
        return cadena.toString();
    }

    private static int generarNumAleatorio(int max, int min) {
        int numero = (int) (Math.random() * (max - min + 1) + min);
        return numero;
    }

    private static int generarNumAleatorio(int max, int min, int num) {
        int numero;
        do {
            numero = generarNumAleatorio(max, min);
        } while (numero == num);
        return numero;
    }

    private static int generarNumAleatorio(int max, int min, int num1, int num2) {
        int numero;
        do {
            numero = generarNumAleatorio(max, min);
        } while (numero == num1 || numero == num2);
        return numero;
    }

    private static int generarNumAleatorio(int max, int min, int num1, int num2, int num3) {
        int numero;
        do {
            numero = generarNumAleatorio(max, min);
        } while (numero == num1 || numero == num2 || numero == num3);
        return numero;
    }

    private static void imprimirMensaje(String mensaje) throws InterruptedException {
        for (int i = 0; i < mensaje.length(); i++) {
            System.out.print(mensaje.charAt(i));
            Thread.sleep(10);
        }
        System.out.println();
    }
}

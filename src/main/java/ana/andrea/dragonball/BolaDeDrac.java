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

    /**
     * Comienza una nueva partida del juego
     */
    private static void iniciarPartida() throws InterruptedException {
        generarBolas();
        if (mostrarInicio()) {
            mostrarResultado(iniciarNiveles());
        }
        finalizarPartida();
    }

    /**
     * Realiza las llamadas a los niveles
     * @return si ha ganado o no
     */
    private static boolean iniciarNiveles() throws InterruptedException {
        if (!mostrarNivel1()) return false;
        if (!mostrarNivel2()) return false;
        if (!mostrarNivel3()) return false;
        if (!mostrarNivel4()) return false;
        return mostrarNivel5();
    }

    /**
     * Muestra por pantalla el mensaje de inicio del juego
     * @return si inicia partida o no
     */
    private static boolean mostrarInicio() {
        String mensaje = Mensaje.INICIO;
        System.out.println(mensaje);
        return pedirEntero("Introdueix un 1 si vols que l'accepten: ") == 1;
    }

    /**
     * Muestra por pantalla el nivel 1 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
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
        return iniciarIntentos("Sumatorio: ", resultado);
    }

    /**
     * Muestra por pantalla el nivel 2 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel2() {
        String mensaje = String.format(Mensaje.LVL2, b1, b2);
        System.out.println(mensaje);
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
        return iniciarIntentos("Cadena: ", cadenaResultado);
    }

    /**
     * Muestra por pantalla el nivel 3 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel3() {
        String mensaje = String.format(Mensaje.LVL3, b2, b3, b3);
        System.out.println(mensaje);
        //B3=5; ESTO ERA PARA PROBAR

        int resultado = NUM_MIN_FACTORIAL;
        for (int i = b3; i >= NUM_MIN_FACTORIAL; i--) {
            System.out.print(i + ((i == NUM_MIN_FACTORIAL) ? "" : MULT));
            resultado *= i;
        }
        System.out.println("\nEl resultado es: " + resultado);
        return iniciarIntentos("Numero Factorial: ", resultado);
    }

    /**
     * Muestra por pantalla el nivel 4 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
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

        return iniciarIntentos("Vocales repetidas: ", cadena);
    }

    /**
     * Muestra por pantalla el nivel 5 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel5() {
        String mensaje = String.format(Mensaje.LVL5, b4, b5, b6, b7, b4, b5, b6, b7);
        System.out.println(mensaje);
        int resultado = calcularMCM(b4, b5);
        resultado = calcularMCM(resultado, b6);
        resultado = calcularMCM(resultado, b7);
        return iniciarIntentos("MCM: ", resultado);
    }
    
    /**
     * Imprime por pantalla el mensaje final dependiendo del resultado de la partida
     * @param haGanado resultado partida
     */
    private static void mostrarResultado(boolean haGanado) {
        if (haGanado) {
            System.out.println("Enhorabona!! Heu aconseguit les 7 boles de Drac. El món torna a respirar tranquil. Fins un altra amics!");
        } else {
            System.out.println("Malauradament, la aventura ha acabat i el món torna a ser un lloc insegur. Una llàstima!");
        }
    }
    
    /**
     * Comienza el número de intentos para que el usuario acierte el nivel
     * @param mensaje texto a mostrar por pantalla
     * @param resultado entero correcto
     * @return si ha acertado o no
     */
    private static boolean iniciarIntentos(String mensaje, int resultado) {
        for (int i = 0; i < NUM_INTENTOS; i++) {
            if (validarRespuesta(pedirEntero(mensaje), resultado)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Comienza el número de intentos para que el usuario acierte el nivel
     * @param mensaje texto a mostrar por pantalla
     * @param resultado cadena correcta
     * @return si ha acertado o no
     */
    private static boolean iniciarIntentos(String mensaje, String resultado) {
        for (int i = 0; i < NUM_INTENTOS; i++) {
            if (validarRespuesta(pedirCadena(mensaje), resultado)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Muestra por pantalla una despedida
     */
    private static void finalizarPartida() {
        System.out.println("Adéu.");
    }

    /**
     * Calcula el mínimo común múltiplo de dos números
     * @param a número 1
     * @param b número 2
     * @return mcm resultante
     */
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

    /**
     * Pide al usuario que inserte un entero
     * @param mensaje texto a mostrar por pantalla
     * @return entero del usuario
     */
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

    /**
     * Pide al usuario que inserte una cedena de texto
     * @param mensaje texto a mostrar por pantalla
     * @return cadena del usuario
     */
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

    /**
     * Comprueba si la respuesta del usuario es correcta
     * @param respuesta entero del usuario
     * @param resultado entero correcto
     * @return si ha acertado o no
     */
    private static boolean validarRespuesta(int respuesta, int resultado ){
        if (respuesta == resultado) {
            return true;
        }
        System.out.println("Resposta incorrecta. Torna a intentar-ho.");
        return false;
    }

    /**
     * Comprueba si la respuesta del usuario es correcta
     * @param respuesta cadena del usuario
     * @param resultado cadena correcta
     * @return si ha acertado o no
     */
    private static boolean validarRespuesta(String respuesta, String resultado) {
        if (respuesta.equals(resultado)) {
            return true;
        }
        System.out.println("Resposta incorrecta. Torna a intentar-ho.");
        return false;
    }

    /**
     * Inicializa la 7 bolas del dragon
     */
    private static void generarBolas() {
        b1 = generarNumAleatorio(3, 1);
        b2 = generarNumAleatorio(7, 4);
        b3 = generarNumAleatorio(7, 4, b2);
        b4 = generarNumAleatorio(7, 4, b2, b3);
        b5 = generarNumAleatorio(7, 4, b2, b3, b4);
        b6 = generarNumAleatorio(3, 1, b1);
        b7 = generarNumAleatorio(3, 1, b1, b6);
    }

    /**
     * Genera una String alfanumérica de manera aleatorio y de la largaria indicada
     * @param largo tamaño de la cadena
     * @return cadena aleatoria
     */
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

    /**
     * Genera una String únicamente de vocales de manera aleatorio y de la largaria indicada
     * @param largo tamaño de la cadena
     * @return cadena aleatoria de vocales
     */
    private static String generarCadenaVocales(int largo) {
        StringBuilder cadena = new StringBuilder();
        do {
            int random = generarNumAleatorio(VOCALES.length() - 1, 0);
            cadena.append(VOCALES.charAt(random));
        } while (cadena.length() < largo);
        return cadena.toString();
    }

    /**
     * Genera un número aleatorio que se encuentra entre un rango de números
     * @param max número máximo del rango
     * @param min número mínimo del rango
     * @return número aleatorio
     */
    private static int generarNumAleatorio(int max, int min) {
        int numero = (int) (Math.random() * (max - min + 1) + min);
        return numero;
    }

    /**
     * Genera un número aleatorio que se encuentra entre un rango de números y no se repite con otro ya generado
     * @param max número máximo del rango
     * @param min número mínimo del rango
     * @param num número excepción
     * @return número aleatorio
     */
    private static int generarNumAleatorio(int max, int min, int num) {
        int numero;
        do {
            numero = generarNumAleatorio(max, min);
        } while (numero == num);
        return numero;
    }

    /**
     * Genera un número aleatorio que se encuentra entre un rango de números y no se repite con otros ya generados
     * @param max número máximo del rango
     * @param min número mínimo del rango
     * @param num1 número 1 excepción
     * @param num2 número 2 excepción
     * @return número aleatorio
     */
    private static int generarNumAleatorio(int max, int min, int num1, int num2) {
        int numero;
        do {
            numero = generarNumAleatorio(max, min);
        } while (numero == num1 || numero == num2);
        return numero;
    }

    /**
     * Genera un número aleatorio que se encuentra entre un rango de números y no se repite con otros ya generados
     * @param max número máximo del rango
     * @param min número mínimo del rango
     * @param num1 número 1 excepción
     * @param num2 número 2 excepción
     * @param num3 número 3 excepción
     * @return número aleatorio
     */
    private static int generarNumAleatorio(int max, int min, int num1, int num2, int num3) {
        int numero;
        do {
            numero = generarNumAleatorio(max, min);
        } while (numero == num1 || numero == num2 || numero == num3);
        return numero;
    }

    /**
     * Imprime por pantalla el texto carácter a carácter, como si fuese una máquina de escribir
     * @param mensaje texto a mostrar por pantalla
     * @throws InterruptedException espera 10 milésimas de segundo entre impresión
     */
    private static void imprimirMensaje(String mensaje) throws InterruptedException {
        for (int i = 0; i < mensaje.length(); i++) {
            System.out.print(mensaje.charAt(i));
            Thread.sleep(10);
        }
        System.out.println();
    }
}

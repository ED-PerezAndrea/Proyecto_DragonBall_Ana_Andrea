/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ana.andrea.dragonball;

import java.util.Scanner;

/**
 *
 * @author Ana Carbonell y Andrea Pérez
 */
public class BolaDeDrac {
    private static Scanner input;
    private static int b1, b2, b3, b4, b5, b6, b7;
    private final static String SUMA = "+";
    private final static String MULT = "*";
    private final static int NUM_MIN_FACTORIAL = 1;
    private final static String VOCALES = "aeiou";
    private final static int NUM_INTENTOS = 3;
    private final static int LARGO_BARRA = 20;

    public static void main(String[] args) throws InterruptedException {
        input = new Scanner(System.in);
        iniciarJuego();
    }

    /**
     * Comienza una nueva partida del juego
     */
    private static void iniciarJuego() throws InterruptedException {
        mostrarPantallaCarga();
        if (mostrarInicio()) {
            generarBolas();
            mostrarResultado(iniciarNiveles());
        }
        finalizarPartida();
    }
    
    /**
     * Genera una pantalla de carga con el título y espera a que el usuario pulse una tecla para empezar la partida
     */
    private static void mostrarPantallaCarga() throws InterruptedException {
        imprimirPorLineas(Texto.ASCII_TITULO);
        generarBarraDeCarga();
        System.out.println(Texto.PANTALLA_PRINCIPAL);
        input.next();
    }
    
    /**
     * Simula una barra de carga cambiando el carácter = por #
     * @throws InterruptedException espera 50 milésimas de segundo entre impresión
     */
    private static void generarBarraDeCarga() throws InterruptedException {
        final char barVacia = 61;
        final char barLlena = 35;
        final char borde = 124;
        
        StringBuilder barra = new StringBuilder();
        barra.append(borde);
        for (int i = 0; i < LARGO_BARRA; i++) {
            barra.append(barVacia);
        }
        barra.append(borde);
        
        for (int i = 1; i <= LARGO_BARRA; i++) {
            barra.setCharAt(i, barLlena);
            System.out.print("\t\t\t\t" + barra + "\r");
            
            Thread.sleep(50);
        }
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
    private static boolean mostrarInicio() throws InterruptedException {
        imprimirPorLineas(Texto.ASCII_GOKU);
        String texto = Texto.INICIO;
        imprimirPorCaracteres(texto);
        return pedirEntero("Introdueix un 1 si vols que l'accepten: ") == 1;
    }

    /**
     * Muestra por pantalla el nivel 1 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel1() throws InterruptedException {
         imprimirPorLineas(Texto.ASCII_SATANAS);
        int n1 = generarNumAleatorio(10, 0);
        int n2 = generarNumAleatorio(30, 20);
        String texto = String.format(Texto.LVL1, n1, n2);
        imprimirPorCaracteres(texto);
        //n1 = 10; ESTO ERA PROBAR QUE SÍ FUNCIONABA, LO DEJO POR SI
        //n2 = 20;
        int resultado = 0;

        for (int x = n1; x <= n2; x++) {
            imprimirPorCaracteres(x + ((x == n2) ? "" : SUMA));
            resultado += x;
        }
        String textoRespuesta = String.format(Texto.RESPUESTA_CORRECTA, resultado);
        String textoSumatorio = String.format(Texto.SUMATORIO);
        
        imprimirPorCaracteres(textoRespuesta);
        return iniciarIntentos(textoSumatorio, resultado);
    }

    /**
     * Muestra por pantalla el nivel 2 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel2() throws InterruptedException {
         imprimirPorLineas(Texto.ASCII_TEN_SHIN_AN);
        String texto = String.format(Texto.LVL2, b1, b2);
        imprimirPorCaracteres(texto);
        //StringBuilder cadena = new StringBuilder();
        //String cadena1 = "erjw3";
        //String cadena2 = "A3q2q";

        String cadena = generarCadenaAlfanumerica(b2);
        String cadena2 = generarCadenaAlfanumerica(b2);

        String cadenaResultado = "";
        String textoMezclaCarac = String.format(Texto.MEZCLA_CARACTERES, cadena, " i ", cadena2);
        imprimirPorCaracteres(textoMezclaCarac);
        for (int i = 0; i < cadena.length(); i++) {

            cadenaResultado = cadenaResultado.concat(String.valueOf(cadena2.charAt((cadena2.length() - 1) - i)));
            cadenaResultado = cadenaResultado.concat(String.valueOf(cadena.charAt(i)));

        }
        String textoRespuesta = String.format(Texto.RESPUESTA_CORRECTA_TEXTO, cadenaResultado);
        String textoCadena = String.format(Texto.CADENA);
        imprimirPorCaracteres(textoRespuesta);
        return iniciarIntentos(textoCadena, cadenaResultado);
    }

    /**
     * Muestra por pantalla el nivel 3 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel3() throws InterruptedException {
         imprimirPorLineas(Texto.ASCII_BOO);
        String texto = String.format(Texto.LVL3, b2, b3, b3);
        imprimirPorCaracteres(texto);
        //B3=5; ESTO ERA PARA PROBAR

        int resultado = NUM_MIN_FACTORIAL;
        for (int i = b3; i >= NUM_MIN_FACTORIAL; i--) {
            imprimirPorCaracteres(i + ((i == NUM_MIN_FACTORIAL) ? "" : MULT));
            resultado *= i;
        }
        String textoRespuesta = String.format(Texto.RESPUESTA_CORRECTA, resultado);
        String textoNumFactorial = String.format(Texto.NUM_FACTORIAL);
        
        imprimirPorCaracteres(textoRespuesta);
        return iniciarIntentos(textoNumFactorial, resultado);
    }

    /**
     * Muestra por pantalla el nivel 4 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel4() throws InterruptedException {
        imprimirPorLineas(Texto.ASCII_CELL);
        int n = generarNumAleatorio(8, 12);
        String texto = String.format(Texto.LVL4, n, n);
        imprimirPorCaracteres(texto);

        String cadena1 = generarCadenaVocales(n);
        String cadena2 = generarCadenaVocales(n);
        String cadena3 = generarCadenaVocales(n);

        String cadenas = String.format("""
                          Cadena 1: %s
                          Cadena 2: %s
                          Cadena 3: %s
                          """, cadena1, cadena2, cadena3);

        imprimirPorCaracteres(cadenas);

        String cadena = generarCadenaVocales(2);
        imprimirPorCaracteres(cadena);
        
        String textoVocales = String.format(Texto.VOCAL_REPETIDAS);
        return iniciarIntentos(textoVocales, cadena);
    }

    /**
     * Muestra por pantalla el nivel 5 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel5() throws InterruptedException {
         imprimirPorLineas(Texto.ASCII_FREEZER);
        String texto = String.format(Texto.LVL5, b4, b5, b6, b7, b4, b5, b6, b7);
        imprimirPorCaracteres(texto);
        int resultado = calcularMCM(b4, b5);
        resultado = calcularMCM(resultado, b6);
        resultado = calcularMCM(resultado, b7);
        String textMcm = String.format(Texto.M_C_M, b4, b5, b6, b7);
        return iniciarIntentos(textMcm, resultado);
       
    }
    
    /**
     * Imprime por pantalla el mensaje final dependiendo del resultado de la partida
     * @param haGanado resultado partida
     */
    private static void mostrarResultado(boolean haGanado) throws InterruptedException {
        if (haGanado) {
            String textoGanar = String.format(Texto.TEXTO_GANAR);
            imprimirPorCaracteres(textoGanar);
        } else {
            String textoPerder = String.format(Texto.TEXTO_PERDER);
            imprimirPorCaracteres(textoPerder);
            imprimirPorLineas(Texto.ASCII_PERDIDO);
        }
    }
    
    /**
     * Comienza el número de intentos para que el usuario acierte el nivel
     * @param texto mensaje a mostrar por pantalla
     * @param resultado entero correcto
     * @return si ha acertado o no
     */
    private static boolean iniciarIntentos(String texto, int resultado) throws InterruptedException {
        for (int i = 0; i < NUM_INTENTOS; i++) {
            if (validarRespuesta(pedirEntero(texto), resultado)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Comienza el número de intentos para que el usuario acierte el nivel
     * @param texto mensaje a mostrar por pantalla
     * @param resultado cadena correcta
     * @return si ha acertado o no
     */
    private static boolean iniciarIntentos(String texto, String resultado) throws InterruptedException {
        for (int i = 0; i < NUM_INTENTOS; i++) {
            if (validarRespuesta(pedirCadena(texto), resultado)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Muestra por pantalla una despedida
     */
    private static void finalizarPartida() throws InterruptedException {
        String textoAdeu = String.format(Texto.TEXTO_ADEU);
        imprimirPorCaracteres(textoAdeu);
        imprimirPorLineas(Texto.ASCII_FIN);
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
     * @param texto mensaje a mostrar por pantalla
     * @return entero del usuario
     */
    private static int pedirEntero(String texto) throws InterruptedException {
        do {
            imprimirPorCaracteres(texto);
            if (input.hasNextInt()) {
                return input.nextInt();
            }
            String textoError= String.format(Texto.ERROR_VALIDACION);
            imprimirPorCaracteres(textoError);
            input.next();
        } while (true);
    }

    /**
     * Pide al usuario que inserte una cedena de texto
     * @param texto mensaje a mostrar por pantalla
     * @return cadena del usuario
     */
    private static String pedirCadena(String texto) throws InterruptedException {
        do {
            imprimirPorCaracteres(texto);
            if (input.hasNext()) {
                return input.next();
            }
            String textoError= String.format(Texto.ERROR_VALIDACION);
            imprimirPorCaracteres(textoError);
            input.next();
        } while (true);
    }

    /**
     * Comprueba si la respuesta del usuario es correcta
     * @param respuesta entero del usuario
     * @param resultado entero correcto
     * @return si ha acertado o no
     */
    private static boolean validarRespuesta(int respuesta, int resultado ) throws InterruptedException{
        if (respuesta == resultado) {
            return true;
        }
        String textoRespuestaIncorrecta= String.format(Texto.RESPUESTA_INCORRECTA);
        imprimirPorCaracteres(textoRespuestaIncorrecta);
        return false;
    }

    /**
     * Comprueba si la respuesta del usuario es correcta
     * @param respuesta cadena del usuario
     * @param resultado cadena correcta
     * @return si ha acertado o no
     */
    private static boolean validarRespuesta(String respuesta, String resultado) throws InterruptedException {
        if (respuesta.equals(resultado)) {
            return true;
        }
        String textoRespuestaIncorrecta= String.format(Texto.RESPUESTA_INCORRECTA);
        imprimirPorCaracteres(textoRespuestaIncorrecta);
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
            int random = generarNumAleatorio(122, 48);
            if (random > 56 && random < 65 || random > 90 && random < 97) {
                continue;
            }
            cadena.append((char) random);
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
     * @param texto mensaje a mostrar por pantalla
     * @throws InterruptedException espera 10 milésimas de segundo entre impresión
     */
    private static void imprimirPorCaracteres(String texto) throws InterruptedException {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            
            // Comentar el Thread si se quiere que imprima el texto de golpe o no se ejecuta en terminal
            //Thread.sleep(10);
        }
    }
    
    /**
     * Imprime por pantalla el texto línea a línea, como se cargaban las imágenes antiguamente
     * @param texto mensaje a mostrar por pantalla
     * @throws InterruptedException espera 50 milésimas de segundo entre impresión
     */
    private static void imprimirPorLineas(String texto) throws InterruptedException {
        StringBuilder linea = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            String caracter = String.valueOf(texto.charAt(i));
            linea.append(caracter);
            
            if(caracter.equals("\n")) {
                System.out.print(linea);
                linea.delete(0, linea.length());
                
                // Comentar el Thread si se quiere que imprima el texto de golpe o no se ejecuta en terminal
                //Thread.sleep(50);
            }
        }
    }
}

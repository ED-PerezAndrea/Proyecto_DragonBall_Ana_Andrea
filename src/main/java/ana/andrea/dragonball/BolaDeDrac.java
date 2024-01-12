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
    
    private final static String VOCALES = "aeiou";
    private final static String ALFABETO = VOCALES.concat("bcdfghjklmnpqrstvwxyz");
    private final static String ALFANUMERICO = ALFABETO.concat(ALFABETO.toUpperCase().concat("0123456789"));
    private final static int NUM_INTENTOS = 3;
    private final static int LARGO_BARRA = 20;
    private final static int MAX_NIVEL = 5;

    public static void main(String[] args) throws InterruptedException {
        input = new Scanner(System.in);
        iniciarJuego();
    }

    
    /*-------------- Métodos base para el funcionamiento del juego --------------*/
    
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
        input.nextLine();
    }
    
    /**
     * Simula una barra de carga cambiando los carácteres vacíos por los llenos
     * @throws InterruptedException espera 50 milésimas de segundo entre impresión
     */
    private static void generarBarraDeCarga() throws InterruptedException {
        final char barVacia = '░';
        final char barLlena = '▓';
        int porcentaje = 0;
        
        StringBuilder barra = new StringBuilder();
        barra.append("╞═");
        barra.append(String.valueOf(barVacia).repeat(LARGO_BARRA));
        barra.append("═╡");
        
        for (int i = 0; i < LARGO_BARRA; i++) {
            barra.setCharAt(i + 2, barLlena);
            porcentaje += 100 / LARGO_BARRA;
            System.out.print("\t\t\t\t" + barra + " " + porcentaje + "%\r");
            
            Thread.sleep(50);
        }
    }

    /**
     * Realiza las llamadas a los niveles e imprime el mensaje de paso de nivel
     * @return si ha ganado o no
     */
    private static boolean iniciarNiveles() throws InterruptedException {
        boolean haGanado = false;
        
        for (int i = 1; i <= MAX_NIVEL; i++) {
            switch (i) {
                case 1:
                    haGanado = mostrarNivel1();
                    break;
                case 2:
                    haGanado = mostrarNivel2();
                    break;
                case 3:
                    haGanado = mostrarNivel3();
                    break;
                case 4:
                    haGanado = mostrarNivel4();
                    break;
                case 5:
                    haGanado = mostrarNivel5();
                    break;
            }
            if (!haGanado) {
                break;
            } else if (i != 5) {
                imprimirPorCaracteres(Texto.RESPUESTA_CORRECTA);
                input.nextLine();
                input.nextLine();
            }
        }
        return haGanado;
    }

    /**
     * Muestra por pantalla el mensaje de inicio del juego
     * @return si inicia partida o no
     */
    private static boolean mostrarInicio() throws InterruptedException {
        imprimirPorLineas(Texto.ASCII_GOKU);
        imprimirPorCaracteres(Texto.INICIO);
        return pedirEntero(Texto.INICIO_RESPUESTA) == 1;
    }

    /**
     * Muestra por pantalla el nivel 1 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel1() throws InterruptedException {
        int n1 = generarNumAleatorio(10, 0);
        int n2 = generarNumAleatorio(30, 20);
        
        imprimirPorLineas(Texto.ASCII_SATANAS);
        imprimirPorCaracteres(String.format(Texto.LVL1, n1, n2));
        
        int resultado = 0;
        for (int i = n1; i <= n2; i++) {
            resultado += i;
        }
        
        imprimirPorCaracteres(String.format(Texto.PISTA_ENTERO, resultado));
        return iniciarIntentos(String.format(Texto.LVL1_RESPUESTA, n1, n2), resultado);
    }

    /**
     * Muestra por pantalla el nivel 2 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel2() throws InterruptedException {
        imprimirPorLineas(Texto.ASCII_TEN_SHIN_AN);
        imprimirPorCaracteres(String.format(Texto.LVL2, b1, b2));

        String cadena1 = generarCadena(b2, ALFANUMERICO);
        String cadena2 = generarCadena(b2, ALFANUMERICO);
        
        String cadenaResultado = "";
        for (int i = 0; i < cadena1.length(); i++) {
            cadenaResultado = cadenaResultado.concat(String.valueOf(cadena2.charAt((cadena2.length() - 1) - i)));
            cadenaResultado = cadenaResultado.concat(String.valueOf(cadena1.charAt(i)));
        }
        
        imprimirPorCaracteres(String.format(Texto.PISTA_TEXTO, cadenaResultado));
        return iniciarIntentos(String.format(Texto.LVL2_RESPUESTA, cadena1, cadena2), cadenaResultado);
    }

    /**
     * Muestra por pantalla el nivel 3 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel3() throws InterruptedException {
        imprimirPorLineas(Texto.ASCII_BOO);
        imprimirPorCaracteres(String.format(Texto.LVL3, b2, b3, b3));

        int resultado = 1;
        for (int i = b3; i >= 1; i--) {
            resultado *= i;
        }
        
        imprimirPorCaracteres(String.format(Texto.PISTA_ENTERO, resultado));
        return iniciarIntentos(String.format(Texto.LVL3_RESPUESTA, b3), resultado);
    }

    /**
     * Muestra por pantalla el nivel 4 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel4() throws InterruptedException {
        int n = generarNumAleatorio(8, 12);
        
        String subcad = generarCadena(2, VOCALES);
        String cad1 = generarCadena(n, VOCALES);
        String cad2 = generarCadena(n, VOCALES);
        String cad3 = generarCadena(n, VOCALES);
        
        imprimirPorLineas(Texto.ASCII_CELL);
        imprimirPorCaracteres(String.format(Texto.LVL4, n, n, cad1, cad2, cad3));

        return iniciarIntentos(cad1, cad2, cad3, subcad);
    }

    /**
     * Muestra por pantalla el nivel 5 y realiza los métodos para obtener el resultado
     * @return si pasa de nivel o no
     */
    private static boolean mostrarNivel5() throws InterruptedException {
        imprimirPorLineas(Texto.ASCII_FREEZER);
        imprimirPorCaracteres(String.format(Texto.LVL5, b4, b5, b6, b7, b4, b5, b6, b7));
        
        int resultado = calcularMCM(b4, b5);
        resultado = calcularMCM(resultado, b6);
        resultado = calcularMCM(resultado, b7);
        
        imprimirPorCaracteres(String.format(Texto.PISTA_ENTERO, resultado));
        return iniciarIntentos(String.format(Texto.LVL5_RESPUESTA, b4, b5, b6, b7), resultado);
       
    }
    
    /**
     * Imprime por pantalla el mensaje final dependiendo del resultado de la partida
     * @param haGanado resultado partida
     */
    private static void mostrarResultado(boolean haGanado) throws InterruptedException {
        if (haGanado) {
            imprimirPorCaracteres(Texto.RESULTADO_GANAR);
        } else {
            imprimirPorCaracteres(Texto.RESULTADO_PERDER);
            imprimirPorLineas(Texto.ASCII_PERDIDO);
        }
    }
    
    /**
     * Muestra por pantalla una despedida
     */
    private static void finalizarPartida() throws InterruptedException {
        imprimirPorCaracteres(Texto.DESPEDIDA);
        imprimirPorLineas(Texto.ASCII_FIN);
    }
    
    
    /*-------------- Métodos encargados de gestionar el input del usuario --------------*/
    
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
     * Comienza el número de intentos para que el usuario acierte el número de repeticiones de la subcadena en las distintas cadenas
     * @param cad1 cadena 1
     * @param cad2 cadena 2
     * @param cad3 cadena 3
     * @param subcad subcadena a buscar
     * @return si ha acertado o no
     */
    private static boolean iniciarIntentos(String cad1, String cad2, String cad3, String subcad) throws InterruptedException {
        String subcadRev = new StringBuilder(subcad).reverse().toString();
        int resultado;
        String cadena;
        String subcadena;
        
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                subcadena = subcad;
            } else {
                subcadena = subcadRev;
                cad1 = cad1.replaceAll(subcad, " ");
                cad2 = cad2.replaceAll(subcad, " ");
                cad3 = cad3.replaceAll(subcad, " ");
            }
            imprimirPorCaracteres(String.format(Texto.LVL4_SUBCADENA, subcadena));
            
            for (int j = 1; j <= 3; j++) {
                switch (j) {
                    case 1:
                        cadena = cad1;
                        break;
                    case 2:
                        cadena = cad2;
                        break;
                    default:
                        cadena = cad3;
                        break;
                }
                
                resultado = contarSubcadenaEnCadena(cadena, subcadena);
                imprimirPorCaracteres(String.format(Texto.PISTA_ENTERO, resultado));
                
                if (!iniciarIntentos(String.format(Texto.LVL4_RESPUESTA, j), resultado)) {
                    return false;
                }
            }
        }
        return true;
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
            imprimirPorCaracteres(Texto.ERROR_VALIDACION);
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
            imprimirPorCaracteres(Texto.ERROR_VALIDACION);
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
        imprimirPorCaracteres(Texto.RESPUESTA_INCORRECTA);
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
        imprimirPorCaracteres(Texto.RESPUESTA_INCORRECTA);
        return false;
    }

    
    /*-------------- Métodos encargados de las mecánicas de los niveles --------------*/
    
    /**
     * Inicializa la 7 bolas del dragón
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
     * Genera una cadena de manera aleatorio a partir de los carácteres y de la largaria indicada
     * @param largo tamaño de la cadena
     * @param carPosibles posibles carácteres que componen la cadena
     * @return cadena aleatoria
     */
    private static String generarCadena(int largo, String carPosibles) {
        StringBuilder cadena = new StringBuilder();
        do {
            int random = generarNumAleatorio(carPosibles.length() - 1, 0);
            cadena.append(carPosibles.charAt(random));
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
     * Cuenta las veces que se repite una subcadena dentro de una cadena
     * @param texto cadena donde se realizará la busqueda
     * @param car subcadena a buscar
     * @return veces repetida
     */
    private static int contarSubcadenaEnCadena(String texto, String car) {
        int cont = 0;
        int indice = 0;
        
        while ((indice = texto.indexOf(car, indice)) != -1) {
            indice += car.length();
            cont++;
        }
        
        return cont;
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

    
    /*-------------- Métodos encargados de la parte visual del juego --------------*/
    
    /**
     * Imprime por pantalla el texto carácter a carácter, como si fuese una máquina de escribir
     * @param texto mensaje a mostrar por pantalla
     * @throws InterruptedException espera 10 milésimas de segundo entre impresión
     */
    private static void imprimirPorCaracteres(String texto) throws InterruptedException {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            
            // Comentar el Thread si se quiere que imprima el texto de golpe o no se ejecuta en terminal
            Thread.sleep(10);
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
                Thread.sleep(50);
            }
        }
    }
}

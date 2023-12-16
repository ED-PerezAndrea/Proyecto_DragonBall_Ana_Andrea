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
    
    private static final String COLOR_RESET = "\u001B[0m";
    private static final String COLOR_ROIG = "\u001B[31m";
    private static final String COLOR_VIOLETA = "\u001B[35m";
    private static final String COLOR_GROC = "\u001B[33m";
    private static final String COLOR_BLAU = "\u001B[34m";
    private static final String COLOR_CYAN = "\u001B[36m";
    private static final String COLOR_VERD = "\u001B[32m";
    

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
        int nivel = 0;
        switch (nivel) {
            case 0 :
                if (mostrarInicio()) {
                    nivel++;
                } else break;

            case 1 :
                if (mostrarNivel1()) {
                    nivel++;
                } else break;

            case 2 :
                if (mostrarNivel2()) {
                    nivel++;
                } else break;

            case 3 :
                if (mostrarNivel3()) {
                    nivel++;
                } else break;

            case 4 :
                if (mostrarNivel4()) {
                    nivel++;
                } else break;
            
            case 5 :
                if (mostrarNivel5()) {
                    return true;
                } else break;
        }

        return false;
    }

    private static boolean mostrarInicio() {
        String mensaje = Mensaje.INICIO;
        System.out.println(mensaje);
        return validarRespuesta(pedirEntero("Introdueix un 1 vols que l'accepten: "), 1);
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

        String cadena = generarCadenaVocales(b2);
        String cadena2 = generarCadenaVocales(b2);

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
        int respuesta = calcularMCM(b4, b5);
        respuesta = calcularMCM(respuesta, b6);
        respuesta = calcularMCM(respuesta, b7);
        return validarRespuesta(pedirEntero(mensaje), respuesta);
    }
    
    private static void mostrarFinal(boolean haGanado) {
        if (haGanado) {
            System.out.println("Enhorabona!! Heu aconseguit les 7 boles de Drac. El món torna a respirar tranquil. Fins un altra amics!");
        } else {
            System.out.println("Malauradament, la aventura ha acabat i el món torna a ser un lloc insegur. Una llàstima!");
        }
        System.out.println("Adéu.");
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

    private static boolean validarRespuesta(int respuesta, int correcta) {
        if (respuesta == correcta) {
            return true;
        }
        System.out.println("Resposta incorrecta. Torna a intentar-ho.");
        return false;
    }

    private static boolean validarRespuesta(String respuesta, String correcta) {
        if (respuesta.equals(correcta)) {
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
    // MÉTODOS IMPRESIONES

    public static void asciiArtInicioJuego() {
         System.out.println("  __\n" +
"  |  \"\"--.--.._                                             __..    ,--.\n" +
"  |       `.   \"-.'\"\"\\_...-----..._   ,--. .--..-----.._.\"\"|   |   /   /\n" +
"  |_   _    \\__   ).  \\           _/_ |   \\|  ||  ..    >  `.  |  /   /\n" +
"    | | `.   ._)  /|\\  \\ .-\"\"\"\":-\"   \"-.   `  ||  |.'  ,'`. |  |_/_  /\n" +
"    | |_.'   |   / \"\"`  \\  ===/  ..|..  \\     ||      < \"\"  `.  \"  |/__\n" +
"    `.      .    \\ ,--   \\-..-\\   /\"\\   /     ||  |>   )--   |    /    |\n" +
"     |__..-'__||__\\   |___\\ __.:-.._..-'_|\\___||____..-/  |__|--\"\"____/");
    }
    public static void ascciArtFullet(){
        System.out.println("   #=----+%                                  \n" +
"                %##***%             *-:.:::::::::=*                               \n" +
"               %##*+++###         +:...::::::::::-==*                             \n" +
"               ##*+++++*#%       -.:::::::::::::::===+%                           \n" +
"              %*++++++**##      -.:::::--::-::-=-:-===+                           \n" +
"              #+++++**+###     -.:::::::::=::-::::-====*                          \n" +
"              %*++*##+*##%     :::-::::-:::-:::-::-=====@                         \n" +
"              #+***#**###     *.:::----::::::::---:-====*                         \n" +
"              ***+++*####%    =::-..:==+-:::::+=====:+==+                         \n" +
"              ***++*###### #*==:=..-:::--::::-:::::==:==+=+#%                     \n" +
"              %###***####*=+=+-:=--::::::::::::::::-=+==****+++%                  \n" +
"               %#*++*####*+*#*=::::::::::::::::::::=====#******++*                \n" +
"               ###**+#####*+.-+=###%%%%%+-::-=#%#%%%%#**#*##****+++*              \n" +
"                %#*++**###@-+=*#@##@@@@@@###%@%##@@@@@%%+--#*##****++#            \n" +
"               #*###***##++-:==#%##%@@@@@%==%@%##%@@@@%=+--+*####****=#           \n" +
"              *++*#######*#*:-=*###%@@@@@*--#@%###@@@@#+=:=+*###******=*          \n" +
"             *=+*#==####%##--:-=*##%%@@%*:-:=%%###@@%**+---**+===******+%         \n" +
"            *=+#*==*######=-+=:-::::-:::::-:-=-+**+===*-=+=======**=+#**=#        \n" +
"           %+*+**=%*##*##+-++%+:=::::::==:::-+=:::-=+=-+%+*-=====#+===+**+        \n" +
"          #=+=====+@@#*##==*#@@@#+::::*...-:-..+::==+*++%@#+=====@@%===+*+%       \n" +
"          +++#====+*%%**#+++%*=**+=:-.....:-.....==+++*#%*+=--===++====***+@      \n" +
"          %@@+===++++***#*++#+===+*-..............:*++++***==-==++*=+=+*****      \n" +
"         *=%#+#*+*####***#====+==+.......-==:.......+++++*****-=++*+++****#*      \n" +
"        #++@@%*##%####*++*===**+=:.....:=+++=-.......*+==+***+*-++**+**+===*@     \n" +
"       @======+++*###::::::-***=+....--=+---=+=::....=+===**+=++==+*+===@*=+#     \n" +
"       +=*+=+**+++++:::=---==**=+...--+-:..::-=+--::.*====+*++**++-++===+%==#     \n" +
"      %###---====++=::::::--+++==::-==-:.....:-=++---====*%*#=+*+++***===%#+*%    \n" +
"      %##+::::-==+#=::::-:::++=**-==*+-......:-=+++-=+===+%#*++++++*++++#+==*%    \n" +
"        *:::::-==##+:-::::==***%++++++-:.....:==+++-======+=+%+++++*+++===+#*@    \n" +
"        +:::::-=*##=:-::::::+=@@%=++=++-..:---=+++=+*=====+%#==++++***++@#**#     \n" +
"        -::::-==-:::::::--=+=+@#@**+++++=.--===++==+===========++++*=-:-@#**#     \n" +
"        -::-:.::::::---=**#*=+@+*%****+.:---=+==+*#=#*=========+++*#+-::#####     \n" +
"        -::::::::--=+==++*##====+****+---=+-+=-:%++@#****++====++*##*=::.***#     \n" +
"        -:::::-===*#*@%***##====+***+=*-==+*==-=%##@==******===+##***=:::=##%     \n" +
"        =:::-===*@#+*%%***##**===**+=##=------+++====-****%#==*++++++=::::#*@     \n" +
"        #-:-=*%@@+%#%%**#**#=====*+=*#=+==+*+*========****%@%@%+++++++:::.*#      \n" +
"        %+=+*#@@@+==*******#+==*%++====+=+===+=======++*+#++=#*+++++++:::.=#      \n" +
"         #==**%@@*==++===**##=##@+=*===++====+========+*=====%+++++++=:::.=#      \n" +
"          +=+*#@@+=======***##@#@*==+*+++====+=======+=====+++++=+++++-::.+%      \n" +
"          %*+**#+=%======+**#*==%*===++++=====+====+====+**=====%%@#++=-:.#       \n" +
"           %=+**=%+==@+*==**#+=========++=====+====+******=====*@#%+++=-:.#       \n" +
"            *=+=*%=+#%=***+##*=======+*##========*******+=======+++*+##=::+       \n" +
"             #+=+===#*=+***##+======+*###*========#@%#*=========+**###%+-:-#      \n" +
"              ==========#**##=====+##++##+========%**@==========++*####=:::-#     \n" +
"                =:======#***#*===*%=%#*#*+========*%%@@%%#====+++=-=*++=:::::%    \n" +
"               =:....:-.=*+#*+===#@@@#+++======+====++--=+=::-----=+*=++:::-:=    \n" +
"                 *===-=..#**+--+===++*#*@@+==+=----.....:==-======+#*-=-:::-:=    \n" +
"                +:::-====****------=+**%@@@@@@=...=*#@@@@%=-:..::-=+@+--=-.-+     \n" +
"                -:::::-==+*+#*%%*=--%@@@@@@@@@@@@@@@@@@%#**=:..:::-=* @*:=        \n" +
"               +.::::-==++*+*##*#@@@@@@@@@@@@@@@@@@@@%****+==:.::::=+             \n" +
"               =.::::===+@#*+*=+**#@@@@@@@@@@@@@@@@##***+==+%+:.:::-=#            \n" +
"               +:.:=======#*+*+==+***%@@@@@@@@@@@#***++==*#+-::::-:-=*            \n" +
"                 *::=-=====***%#+===***#%@@@@@%#***++=+*% *::.:::--=*             \n" +
"                  %::::-===+**#   *+==+***#%%*#**+==+%   *-:.:::-==#              \n" +
"                    =.:::-==+**%    %+===+****+===*      =:.:::-=+%               \n" +
"                     *::::-==**#       @*==+===#        +:.:::-=*                 \n" +
"                       =:::-=+**           %*#          :.::-=*                   \n" +
"                        *:::-=**#                      =.::-=#                    \n" +
"                         *:::-*#*                     =.::-+                      \n" +
"                          #:::=#*+**                *=.::=+                       \n" +
"                        *::::::##+==+              -.-:::=*                       \n" +
"                    **-:::::::-*#+==#%@          *:::::::::::::-*%                \n" +
"                 %=*+::::::::-=+#*%%%#*         @=::::::::::::::=*-:-=            \n" +
"                *::++:-=+****+*%#*#***#       #%%%#==-=-:-+##++++++-==+%          \n" +
"               #=-::++-:::-+%#%##*#+*#        %***###%%%%#%#+=:--::---*#+         \n" +
"              %%+++=======#%%*+*+#*@           #++++***+====+*##%##%#*==*         \n" +
"              #+#%%*+=+##++**+#% #+#              ###*+++++++==========+%         \n" +
"               #++====++*+**%    %*#                       @%%##****#             \n" +
"                 %*++*#%          %%     ");
    }
    public static void asciiArtGoku() {
        System.out.println("Son Goku");
        System.out.println("              ___     -._\n" +
"            `-. \"\"\"--._ `-.\n" +
"               `.      \"-. `.\n" +
" _____           `.       `. \\        \n" +
"`-.   \"\"\"---.._    \\        `.\\\n" +
"   `-.         \"-.  \\         `\\\n" +
"      `.          `-.\\          \\_.-\"\"\"\"\"\"\"\"--._\n" +
"        `.           `                          \"-.\n" +
"          `.                                       `.    __....-------...\n" +
"--..._      \\                                       `--\"\"\"\"\"\"\"\"\"\"\"---..._\n" +
"__...._\"_-.. \\                       _,                             _..-\"\"\n" +
"`-.      \"\"\"--`           /       ,-'/|     ,                   _.-\"\n" +
"   `-.                 , /|     ,'  / |   ,'|    ,|        _..-\"\n" +
"      `.              /|| |    /   / |  ,'  |  ,' /        ----\"\"\"\"\"\"\"\"\"_`-\n" +
"        `.            ( \\  \\      |  | /   | ,'  //                 _.-\"\n" +
"          `.        .'-\\/'\"\"\\ |  '  | /  .-/'\"`\\' //            _.-\"\n" +
"    /'`.____`-.  ,'\"\\  ''''?-.V`.   |/ .'..-P''''  /\"`.     _.-\"\n" +
"   '(   `.-._\"\"  ||(?|    /'   >.\\  ' /.<   `\\    |P)||_..-\"___.....---\n" +
"     `.   `. \"-._ \\ ('   |     `8      8'     |   `) /\"\"\"\"\"    _\".\"\"\n" +
"       `.   `.   `.`.b|   `.__            __.'   |d.'  __...--\"\"\n" +
"         `.   `.   \".`-  .---      ,-.     ---.  -'.-\"\"\n" +
"           `.   `.   \"\"|      -._      _.-      |\"\"\n" +
"             `.  .-\"`.  `.       `\"\"\"\"'       ,'\n" +
"               `/     `.. \"\"--..__    __..--\"\"\n" +
"                `.      /7.--|    \"\"\"\"    |--.__\n" +
"                  ..--\"| (  /'            `\\  ` \"\"--..\n" +
"               .-\"      \\\\  |\"\"--.    .--\"\"|          \"-.\n" +
"              <.         \\\\  `.    -.    ,'       ,'     >\n" +
"             (P'`.        `%,  `.      ,'        /,' .-\"'?)\n" +
"             P    `. \\      `%,  `.  ,'         /' .'     \\\n" +
"            | --\"  _\\||       `%,  `'          /.-'   .    )\n" +
"            |       `-.\"\"--..   `%..--\"\"\"\\\\\"--.'       \"-  |\n" +
" _----_     \\          `.  .--\"\"\"  \"\\.\\.\\ \\\\.'       )     |");
    }

    public static void asciiArtBOO() {
         System.out.println("BOO");
        System.out.println("  ...                              ..            \n" +
"                                  .   .                          ..:...           \n" +
"                                  .   :.                        ....:;:.          \n" +
"                                      ..                      ....::..:.          \n" +
"                                      ..  .                  ::.....::            \n" +
"                                    ...:                   . . .:.::              \n" +
"                                   ..         .      ;::;.     .::.               \n" +
"                                  ...   .....  .:::;;:;.   ....                   \n" +
"                                 .....     .    :;:+:;     ..                     \n" +
"                                :+;:.           :;;;:;. ..:.                      \n" +
"                            :;;++;+:.          :;:;;+&$;;++:                      \n" +
"                          ;++++++++;;:..   ..;++;;:+XX$&X++;                      \n" +
"                        :;++++++;;;+;;+;;+;;::;:;x&$XXX$&X+;:                     \n" +
"                        ++xx+++++++++++;;;;;+;;:+$&$XXXX&$x;:                     \n" +
"                      .++++X$$$X$$;;++:::   ;;;::X&&$XXXx:;;::                    \n" +
"                       ;:.:$&&&&&&$++;. ..::. .:;+&&$XX:: :;:::                   \n" +
"                       ...:+&&$XXXXX+;         .:x$+;:.   :+::::::                \n" +
"                      ..:::::;xXXXXx;;          ..        ;;;:::::::.             \n" +
"                   .:....:;;.. ..... ..                  ;.:+::::;;;:::           \n" +
"                  .::::::  .X.                         :x.  . ::::;++;;;:         \n" +
"                 .::::.       ;:                    :+:        .:::;              \n" +
"                :::::.          +Xx:           .+XX+             ::.              \n" +
"          :;;++x::::.              ;xX:..:.:..:Xx.               :.               \n" +
"         ;;+xx;;;;;;:. +$&$X          ..;.:.:.:         ;xx:   .                  \n" +
"        ;;+xx+;;;;;;......X&X            ...          :$&&X+;...:;;;;;:           \n" +
"       .;;   .+;;;;;;.....:$x                         :&$:.....;;;;;;;.           \n" +
"        ..     ;;;;;;:....::.                          ;::.:..;+;;;;;.            \n" +
"                 ;+++;;..:::                        .:..:::.;;+++;;:              \n" +
"                   ;;;;::;.   .     .                  .:+;;;;;;;.                \n" +
"                    ;;;:                                  :;;;;.                  ");
    }

    public static void asciiArtTenShinAn() {
        System.out.println("Ten Shin Han");
        System.out.println(" .::-:::                                       \n" +
"       .=====-..                                     \n" +
"       .-====--.                                     \n" +
"       .--====-.                                     \n" +
"        .-=====:.                                    \n" +
"      .::-=====-:                                    \n" +
"   .-:-==-==-==::.              ..                   \n" +
"   .==+===+::.:::--:.::-.    .-::::::..              \n" +
"   .+==+===:.::--:===++... .--:-=:::::.              \n" +
"   ..==+*++==-==-===:-===:.:--::+-::=:               \n" +
"     .:*+-.:=-::==**:-:-=--::-.:-++*+..              \n" +
"      .:+=--+::-=+##+:::-*+:=+:*+=+...               \n" +
"       ..:=#%%##%###-=--+-.-:::=*:..                 \n" +
"         ..*%%%%%%#=-+=*=:.::-=::=-:.                \n" +
"          ..-==*++==**+++=:::::::--.:=..             \n" +
"            ..=+=*==-::==:-++++=-==:::=..            \n" +
"                ..-=====:::-==---::==-=:             \n" +
"                 ..:==-::=:::-:::=:=-*+-.            \n" +
"                    .+-:----=*++=+:=+-..  ....::.    \n" +
"                    ..+%%%###%%%%%%%*+=:.::=-+-=.    \n" +
"                      =%%%%###%%%%#%%###*-=+==-:..   \n" +
"                      -*##**#*##*%##%%%%%++-=+=:.    \n" +
"                    ..+##*******#%#*#=..........     \n" +
"                 ...-#**##***#*##%####...            \n" +
"                ..-##***#**#***#%%####%%+:..         \n" +
"              ..-*****+*****#**#%%%######%#%*-..     \n" +
"             ..=*******+**#*#*#%%###*******#####=..  \n" +
"            .-************#*%%%@%##***********#####: \n" +
"          ..+***#*****+**%##%#-.+#***#%%###********#-\n" +
"         .-#***%#*+***#*%%##..  ....+%#*************%\n" +
"       ..:*%*#*%#****#*#@#...        .-##%%%%%%**#*%+\n" +
"       .:***##*%###%%***.             .:%#****#%%###.\n" +
"      .+#####%%%%%****#.               .+%%%#***%%##:\n" +
"      .##*#%%##%#**#%%:                 :*##%%%##*...\n" +
"      .=#******###%%%:.                .=+++**+=.    \n" +
"     .:-###%%%@%%####..               .:+=-=+**:.    \n" +
"    ..-::**++*###-..                  .-#%%##%@@:.   \n" +
"   ..=-::==*==+:.                        .-*%##+@%.  \n" +
"   .++=:===++-.                             .-*#=%@=.\n" +
"  .-*+*****=.                                        \n" +
" .=##%#++*-.                                         \n" +
".=*%%@@@=..                                          \n" +
"+##%@@@-.                                            \n" +
"*#%@@@:                                              \n" +
"%@@=.. ");
    }

    public static void asciiArtCel() {
        System.out.println("Cèl·lula");
        System.out.println("                                            \n" +
"                   #%%        +*                             \n" +
"                   #@#      **++                             \n" +
"                   *@%#    **+**                             \n" +
"                   *@%%####+*++                              \n" +
"                   *%+*%%#*+*=+                              \n" +
"                   *#####*+*++@                              \n" +
"                   +*%%%#***++                               \n" +
"                   **#%#*=+**#@                              \n" +
"                    %*+=+*++*##                              \n" +
"                     +==*+-++++###                           \n" +
"                @@@%%***+**#*#%%@%*                          \n" +
"               %%%#%@%%@@@%%+#%###**                         \n" +
"              #**+###*#####+=*%@*%+=                         \n" +
"              +=+++#@@@#*##%%*#%#*=#                         \n" +
"             =+##*##%%#*#*%###+###@%%                        \n" +
"            +=*###*#**#%##*+++@@@@@@#%                       \n" +
"           #+=*%%%+*%%###*=+@@@@@@@@@#%                      \n" +
"             -=*#%@@@@@%###%@@@@@@@@@@%%                     \n" +
"              *+**+#%%#*+**+%@@@@@@@@@@#%                    \n" +
"              %@@*#%%%%#*#*+**+=+@%%%@@@#%                   \n" +
"             %%=**#@@@****#*#++=@%%%%%@@@#                   \n" +
"             %%++#+%@%**####++=%@%%%%%%@@%%                  \n" +
"             %@@*+####++##%%#+*@%%%%##%%@@%%                 \n" +
"             %@@%*+**#+=*%%%%#+%%%%####%%@@%%                \n" +
"            %%@%##%@%**+=#%@%#+#%%%#####%%@@%%               \n" +
"            #%%%%#%%#*##=#%%@*+##%#######%%@%#               \n" +
"           %#%%%%#%%%**%=+@%%*++%#%#######%%@%%              \n" +
"           %%%%###+%*+##++***#+*  #%#######%%@%%             \n" +
"           #%%####=+=+##+*=+*+++   %%%######%@%%             \n" +
"           #%%#####*++*#*-*#%#*+#    #%######%@%%            \n" +
"           %%####%***#@%*#%+*#*##     #%#####%%%#            \n" +
"           %%##%%####%%#**#%%%%#*       #%####%@#%           \n" +
"           %%#%% *#%@@@#*+#%%%@@#*        #%###%%#           \n" +
"          %%%%%  *%%@@@%*+#@%%%@%#         %%%%%@%%          \n" +
"          %%%    ##%@@@%*+#@%%@@@*#           %%@%%          \n" +
"                  %%@%%#++#%%%@@%*#              %%          \n" +
"                  %%@%#++ **#%@@#++                          \n" +
"                  #%@%#+#  *#%%@%**                          \n" +
"                  #%%%#=%   +%%@%**                          \n" +
"                 ##%%%#=+   ##%@%#+                          \n" +
"                *##%%%#*+    *%%%%+*                         \n" +
"                **##****%   #*%%###+*                        \n" +
"              +=**+===+=    +++*##**+                        \n" +
"             ++=--===       +++=###+=                        \n" +
"            +=+              *=-=*#+=                        \n" +
"                               --=*+=                        \n" +
"                                +---=                        \n" +
"                                   ++    ");
    }
    
    public static void asciiArtSonGohan(){
        System.out.println("Son Gohan");
        System.out.println("  __...__\n" +
"          \"-._  \"\"--.._     \\-.\n" +
"              \"-.      \"-.   \\ `.\n" +
"                 \\        `. |   \\\n" +
"                  |   \\  \\  \\`|   \\   _.---..__\n" +
" -..\"\"\"\"\"\"\"---..  |          \\|   |,-\" __   __..\"--\n" +
"    \"\"--._      \"\"-|   | |  \\ |   `_.-\"  \"\"--._\n" +
"         _`-.       `.         _.-\"         ___.\"-\n" +
"       \"-.\"\"-`. `.    `.     -\" _-\"  ,' .-\"\"__\n" +
"           \"-. \\  \\     _.._        / ,'     _\"-\n" +
"          _.----\\           `.       /  =._   `\\\\\n" +
"        ,/ _.--   /    \\,-.   \\\"\"-.     -._  :.\\\n" +
"       /  __... / |   /\"   `. |   )          _)\\\n" +
"      /-\"\"  /  (   `.|   ./ _\\|  ',-\"\"\\  _.-\"\n" +
"           | .-/\\ /|\"6=.,.=6\"/`    ,9 |-\"     \n" +
"           '  '\" \\|`(--')`--'      /',\\\n" +
"                  `  \\\"/_ \"\"\"    _.-'  \\       \n" +
"                      . .--     /\\      \\         \n" +
"                       `.\"   .-   |      \\\n" +
"                         \"--\"    /       |\"-.----._\n" +
"                   ,-.---,|    ,'   ______   `.    `--..__\n" +
"               .-\"/   .'' |   .--\"\"\"      \"\"-.|           `--.\n" +
"              /     /' \"-. _.'                |      _.--\"\"\"`-.\n" +
"             /    ./      /         --\"\"\"\"\",/'     ,'        \\ \\\n" +
"           /'|/   (      |             ,/'        /           \\ \\\n" +
"          /  /    `\\     |          ,/'          /            |  )\n" +
"          | /       `._.- ---..__,/'            ( \\          /   /\n" +
"           (          `.      ,/'                `.`-..__    `--._\n" +
"          / `.          `\\_,/'                     \\      \"`\\     \\");
    }
    
    public static void asciiArtFreezer(){
        System.out.println("Freezer");
        System.out.println("                                                    \n" +
"                              @#*##%@@                                        \n" +
"                           @*+++###%%%%%@                                     \n" +
"                          %+++####%%%%+-=#                                    \n" +
"                         %+++####%%%+----=                                    \n" +
"                         #++####%%%=-----=#                                   \n" +
"                         +*####%%%=-----=*                                    \n" +
"                         #-=*##*+-------=##                                   \n" +
"                          %=----=--=*-=-=#%                                   \n" +
"                           %##+=++**=-+#                                      \n" +
"                             #-+==*-=+++*#                                    \n" +
"                           %#@%*+==*+++++=+#*++*%                             \n" +
"                         %#*----+-=*+=--==-+%%###%                            \n" +
"                        @#--+---==------==---*%%%%@                           \n" +
"                        %-+-----=---------=**++===%                           \n" +
"                        %==----=+------=+++*-----+-*                          \n" +
"                       #-=-=#**##%%%%+++++++*-----=-+                         \n" +
"              #        *-=+-++*####%+-----++##=+==+==+@                       \n" +
"              +=%   @+==++++-*+###%+---=+++#   #*==+---=@    @                \n" +
"             @+---+=-----*++---*+------+#@      *==-----+   ==                \n" +
"          *=++-====*----=++#+--+----=--+%        %-------+=-=#                \n" +
"            #=-----=+++**#  #=-----=--=@          %*++-+=====#                \n" +
"           *=# %=+-#       @=--------=--+-----==++++*##-----===+              \n" +
"               +* *+       #-------==----*=-----------===-=-* @+=             \n" +
"                           ==------------=*==-------=+===+-+=%                \n" +
"                           =+=----=-------++*+++++++++++=+++*=-#              \n" +
"                          %--++---=------=***++++++++++++++++++=+             \n" +
"                          %-=-+*+*------+-%@@@@@%%##+++++++++*+++*            \n" +
"                           ==-=++-------=-#           %#++++++++++#           \n" +
"                           *+*=++-=-------#             @*+++++++++#          \n" +
"                            +++++-=------=#               #++++++++#          \n" +
"                            #++++--------#                 *+++++++#          \n" +
"                             %**-------=#                  #+++++++#          \n" +
"                            @*+*------++---=+%            @+++++++*@          \n" +
"                         @*====++=-=-=++===----+@        %++++++++@           \n" +
"                       %+=+++****--==-+#*++++=---+#    %*++++++++#            \n" +
"                      *+++*@    +++*-=-+*+#++++++=----=++++++++*@             \n" +
"                     #++*      @=++=---=*+*@@+++++++++++++*+++%               \n" +
"                     #*+%     *------+=+#++@  @*++++++++++++%                 \n" +
"                     @++*     #++++---=+#++@     @%#***#%                     \n" +
"                       %*+%   #**##---=+*++@                                  \n" +
"                              #**##+--=*+++#                                  \n" +
"                              #**##---*%#++%                                  \n" +
"                              @###*--+%%%*+++#                                \n" +
"                              @###+-=#+++++++++@                              \n" +
"                              %##%+-=#++#@  %#%%                              \n" +
"                              %#%%=-=#*@                                      \n" +
"                           %+=-=++++*                                         \n" +
"                       @%#---==+---==*                                        \n" +
"                         @@@ #---===--*                                       \n" +
"                            *===*   +-+@                                      \n" +
"                           +--=#      #+                                      \n" +
"                          @*+%     ");
    }
    
    public static void asciiArtSatanas(){
         System.out.println("Satanàs Cor Petit");
        System.out.println("                             ____\n" +
"                          .-\"\"    \"\"--.\n" +
"                        ,'             `.\n" +
"                       /     ,'          \\\n" +
"                    `\\/     .             |\n" +
"                  .===:_,  |              /\n" +
"                 / .'\"\"\".  ,:=:.         / _.,\n" +
"                \"   `--. `|/  _\\` (    _/-\" /\n" +
"                     |\\_b_9-\"\"  ___) -\"-\"//'\n" +
"                     | --/`--_o\"_/'  (6_//\n" +
"                     / ,'    -\"\"    .),-'\n" +
"                     (  \"-__       `-(\n" +
"                      \\ |HHH/    /    \\\n" +
"                       \\  -   _./      `-._..._\n" +
"                        7----\",'/     ..-\" .-- \"--.._\n" +
"                 _.._.-/)  .-',/   .-\"  -\"           \"\"--..\n" +
"          _..--\"|=\"\"--..--\"\"\"\"\"\"./'  .              .-\"\"\"-.\\\n" +
"        ,' .-','     ,'       /.   /              .'       \\\\\n" +
"     .:' ,' ,:      /      ,/'/  /'         _....' _..--\"\"\" )\n" +
"   ,\"/  /  /(      /   _,/' / ,/'         /.    .-\"       __|\n" +
"  / / /'  (  \"\"----\"\"\"\"   / ,/           / `:.-\"    _.--\"\"  /\n" +
"  ||  (    \\_       __.-'  /             |`-.`:=._-\"    _.-:|\n" +
"  \\/   \\     \"\"\"\"\"\"\"      /               \"\"-`  `-\"====\"-'   \\\n" +
"  |     \"-.        __..-\"                    \\._.====..       `\n" +
"  |        \"\"--\"\"\"\"                          //..---\"\"\\\\       .\n" +
"  \\                           _----_       /'| __...---.\\      |");
    }
    
    
     public static void asciiArtFin(){
         System.out.println("ASCII FIN");
        System.out.println(" ______________ ______________  ___________ _______  ________   \n" +
"\\__    ___/   |   \\_   _____/  \\_   _____/ \\      \\ \\______ \\  \n" +
"  |    | /    ~    \\    __)_    |    __)_  /   |   \\ |    |  \\ \n" +
"  |    | \\    Y    /        \\   |        \\/    |    \\|    `   \\\n" +
"  |____|  \\___|_  /_______  /  /_______  /\\____|__  /_______  /\n" +
"                \\/        \\/           \\/         \\/        \\/ ");
    }
    
    public static void asciiArtPerdut(){
         System.out.println("ASCII PERDIDO");
        System.out.println("       ___           ___           ___           ___     \n" +
"     /  /\\         /  /\\         /__/\\         /  /\\    \n" +
"    /  /:/_       /  /::\\       |  |::\\       /  /:/_   \n" +
"   /  /:/ /\\     /  /:/\\:\\      |  |:|:\\     /  /:/ /\\  \n" +
"  /  /:/_/::\\   /  /:/~/::\\   __|__|:|\\:\\   /  /:/ /:/_ \n" +
" /__/:/__\\/\\:\\ /__/:/ /:/\\:\\ /__/::::| \\:\\ /__/:/ /:/ /\\\n" +
" \\  \\:\\ /~~/:/ \\  \\:\\/:/__\\/ \\  \\:\\~~\\__\\/ \\  \\:\\/:/ /:/\n" +
"  \\  \\:\\  /:/   \\  \\::/       \\  \\:\\        \\  \\::/ /:/ \n" +
"   \\  \\:\\/:/     \\  \\:\\        \\  \\:\\        \\  \\:\\/:/  \n" +
"    \\  \\::/       \\  \\:\\        \\  \\:\\        \\  \\::/   \n" +
"     \\__\\/         \\__\\/         \\__\\/         \\__\\/    \n" +
"      ___                        ___           ___      \n" +
"     /  /\\          ___         /  /\\         /  /\\     \n" +
"    /  /::\\        /__/\\       /  /:/_       /  /::\\    \n" +
"   /  /:/\\:\\       \\  \\:\\     /  /:/ /\\     /  /:/\\:\\   \n" +
"  /  /:/  \\:\\       \\  \\:\\   /  /:/ /:/_   /  /:/~/:/   \n" +
" /__/:/ \\__\\:\\  ___  \\__\\:\\ /__/:/ /:/ /\\ /__/:/ /:/___ \n" +
" \\  \\:\\ /  /:/ /__/\\ |  |:| \\  \\:\\/:/ /:/ \\  \\:\\/:::::/ \n" +
"  \\  \\:\\  /:/  \\  \\:\\|  |:|  \\  \\::/ /:/   \\  \\::/~~~~  \n" +
"   \\  \\:\\/:/    \\  \\:\\__|:|   \\  \\:\\/:/     \\  \\:\\      \n" +
"    \\  \\::/      \\__\\::::/     \\  \\::/       \\  \\:\\     \n" +
"     \\__\\/           ~~~~       \\__\\/         \\__\\/     ");
    }
}

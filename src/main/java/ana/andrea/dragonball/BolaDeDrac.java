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
    

    public static Scanner input;
    final static String SIGNO_SUMA = "+";
    final static String ASTERISCO = "*";
    final static int numMinFactorial = 1;
    final static String VOCALES = "aeiou";
    public static int B1, B2, B3, B4, B5, B6, B7;
    final static int NUM_INTENTOS = 3;
    
    public static void main(String[] args) {
        input = new Scanner(System.in);
        inicio();
    }
    
    public static boolean inicio(){
        String mensaje = "BENVINGUTS A L’AVENTURA DE DRAGON BALL\n"
                + "========================================\n"
                + "Son-Goku es troba tranquil·lament a casa junt al seu fill Son-Gohan, a\n"
                + "qui li està ajudant a resoldre uns deures que li han manat fer a l’escola,\n"
                + "concretament son de matemàtiques. De sobte, apareix a casa el Fullet\n"
                + "Tortuga i els conta que el malvat villà Freezer està planejant trobar les\n"
                + "7 boles del drac per tal de demanar un desig i obtindre un poder que\n"
                + "ningú podrà mai parar. El planeta està en perill. El Fullet Tortuga et\n"
                + "demana ajuda ¿Vols que Son-Goku i Son-Gohan accepten el repte?";
        if(validacionErrores()== 1){
            nivel1(0,30);
        }
        fin();
        return true;
    }
    
    public static boolean nivel1(int n1, int n2){
        String mensaje = String.format(
                "Son Goku: Molt bé! Anem a buscar les boles de drac abans que\n"
                + "Freezer puga tenir-les. --va dir Son-Goku des de la seua casa en el\n"
                + "número n1 de Ciutat del Nord.\n"
                + "Goku va recordar que l’última vegada que les boles van ser repartides\n"
                + "pel món de manera aleatòria, una d’elles va anar a parar a la zona on\n"
                + "actualment viu el seu amic Satanàs Cor Petit i que probablement ell la\n"
                + "tinga en el seu poder. Van marxar doncs cap al número n2 de la Ciutat\n"
                + "Meravella, que és on ell viu.\n"
                + "Després d’un llarg camí, hem arribat a la casa de Satanàs i, en efecte,\n"
                + "ell té una de les boles. Però no vol donar-nos-la gratuïtament, ja que li\n"
                + "té molta estima. Ens proposa la següent lluita matemática:\n"
                + "Satanàs Cor Petit: Sabríeu dir-me quin és el sumatori entre el número\n"
                + "de la vostra casa i el número de la meua? Si l’endevineu, vos donaré\n"
                + "la bola i m’uniré al vostre equip."
        );
        n1 = generarNumAleatorio(10, 0);
        n2 = generarNumAleatorio(30, 20);
        //n1 = 10; ESTO ERA PROBAR QUE SÍ FUNCIONABA, LO DEJO POR SI
        //n2 = 20;
        int resultado = 0;

        for (int x = n1; x <= n2; x++) {
            System.out.print(x + ((x==n2)?"":SIGNO_SUMA));
            resultado += x;
        }

        System.out.println("\nLa respuesta correcta seria: " + resultado);
        return true;
        //FALTARIA LLAMAR AQUÍ AL METODO DE GANAR O NO
    }

    
    public static boolean nivel2(){
        String mensaje = String.format(
                "Satanàs Cor Petit: Sou uns cracks de les matemàtiques! Pensava que\n"
                + "només sabíeu lluitar. Ací teniu la bola de b1 estreles. Per cert, tinc el\n"
                + "número de telèfon de Ten Shin Han, qui em va enviar un WhatsApp la\n"
                + "setmana passada per contar-me que havia trobat la bola de b2 estreles\n"
                + "en el Desert de l’Oblit. Anem-hi!\n"
                + "Només arribar, trobaren a Ten Shin Han el qual no tenia el seu millor\n"
                + "dia i no els van rebre amb bona cara. Estava molt cabrejat perquè\n"
                + "estava intentant resoldre un enigma matemàtic i no veia forma de ferho.\n"
                + "Son Gohan: Hola Ten Shin Han, necessitem que ens dones la teua\n"
                + "bola de drac.\n"
                + "Ten Shin Han: Sí, un moment, resulta que porte així com 3 hores per\n"
                + "a descrifrar un enigma alfabètic anomenat “La mescla sagrada de\n"
                + "cadenes de text” i no veig la solució. Si m’ajudeu a resoldre’l, vos\n"
                + "donaré la bola. "
        );
        //String cadena1 = "erjw3";
        //String cadena2 = "A3q2q";
        
        String cadena = generarCadena(B2);
        String cadena2 = generarCadena(B2);
        
        String cadenaResultado = "";
        
        System.out.println("La mezcla sagrada de las cadenas de caráctes " + cadena + " i " + cadena2);
        for (int i = 0; i < cadena.length(); i++) {
           
            cadenaResultado = cadenaResultado.concat(String.valueOf(cadena2.charAt((cadena2.length() - 1) - i)));
            cadenaResultado = cadenaResultado.concat(String.valueOf(cadena.charAt(i)));

        }
        System.out.println("\nCorresponde a la cadena: " + cadenaResultado);
        return true;
    }

    public static boolean nivel3() {
        String mensaje = String.format(
                "Ten Shin Han: Wow! Gràcies, ací teniu la bola de b2 estreles. Per cert,\n"
                + "vaig saber que el nostre enemic Boo va trobar una bola de drac en la\n"
                + "seua mudança a “Muntanya Perduda”. Vos guiaré a la cova de la\n"
                + "muntanya on viu. No és lluny d’ací.\n"
                + "Boo es trobava descansant a la cova. Ja que va tindre molts problemes\n"
                + "en els seus anteriors enfrontaments amb Goku aquest no tenia intenció\n"
                + "de lluitar més amb ell, però al veure’l què anava a per la seua estimada\n"
                + "bola de drac de b3 estelles, no va reaccionar amb bones maneres.\n"
                + "Boo: Què voleu? La meua bola de drac?\n"
                + "Son Goku: Necessitem reunir-les totes abans que Freezer. El món\n"
                + "corre un gran perill! Sabem que tú ja no vols fer mal al planeta. T’ho\n"
                + "demanem per favor, pel bé de tots.\n"
                + "Boo: Però és meua! La vaig trobar jo! Encara que pensant-ho millor,\n"
                + "només vos la donaré si em dieu la resposta correcta a la solució de\n"
                + "quin és el factorial de b3."
        );
        //B3=5; ESTO ERA PARA PROBAR

        int resultado = numMinFactorial;
        for(int i = B3; i >= numMinFactorial; i--){
            System.out.print(i + ( (i == numMinFactorial)?"":ASTERISCO));
            resultado *=i;
        }
        System.out.println("\nEl resultado es: " + resultado);
        return true;
    }
    
    public static boolean nivel4() throws InterruptedException {
        int n = generarNumAleatorio(8, 12);
        String mensaje = String.format("""
                                       Boo: Vaja, vos ho he posat realment fácil. Ací teniu la bola. Ara bé, us\n"
                                       avance que encara teniu un os dur de rosegar. Cèl·lula també les\n"
                                       buscava i vaig escoltar en la tele que ja tenia unes quantes recollides.\n"
                                       "Si no recorde mal, el vaig sentir a les notícies del canal número %d de\n"
                                       "la meua televisió.\n"
                                       "Van sintonitzar el canal %d i van confirmar que Cèl·lula es trobava en\n"
                                       "“Ciutat Nova”. Ràpidament van anar a enfrontar-se amb ell i així\n"
                                       "aconseguir les boles que tenia en el seu poder.\n"
                                       "Son Gohan: Hola Cèl·lula, no volem problemes amb tu. Per favor,\n"
                                       "dona'ns les teues boles de drac i no et farem mal.\n"
                                       "Cèl·lula: Jajaja. He entrenat des de l'última lluita i ara no podreu amb\n"
                                       "mi i, per descomptat, no podreu llevar-me les boles del drac que tinc\n"
                                       "guardades a aquesta caixa. Juguem a un joc, la caixa té una\n"
                                       "contrasenya, però l’única manera d’aconseguir-la és desxifrant\n"
                                       "aquesta endevinalla, juguem?
                                       """, n, n
        );
        System.out.println(mensaje);
        
        String cadena1 = generarCadena(n);
        String cadena2 = generarCadena(n);
        String cadena3 = generarCadena(n);
        
        String cadenas = String.format("""
                          Cadena 1: %s
                          Cadena 2: %s
                          Cadena 3: %s
                          """, cadena1, cadena2, cadena3);
        
        System.out.println(cadenas);
        
        String cadena = generarCadena(2);
        System.out.println(cadena);
        
        return true;
    }
    
    public static boolean nivel5() {
        String mensaje = String.format(
                "Cèl·lula: Maleïts sigueu! L’heu endevinat, però.... he de confessar-vos\n"
                + "que anava de fanal, i que no tinc cap bola de drac. El que sí puc dir-\n"
                + "vos es que la resta de boles que neccesiteu las té Freezer. Aneu a\n"
                + "molestar-lo a ell. Adèu!\n"
                + "Son Goku: Bé, anem corrent al planeta de Freezer a llevar-li les boles\n"
                + "que resten. Esperem que surta tot bé.\n"
                + "Van volar al Planeta Infernal on Freezer esperava al seus contrincants\n"
                + "per a la lluita final.\n"
                + "Son Goku: Hola Freezer, sabem què trames. No ho permetrem.\n"
                + "Dona'ns les boles de drac b4, b5, b6 i b7 que sabem que tens.\n"
                + "Freezer: De cap manera! Doneu-me vosaltres les vostres. Però mireu,\n"
                + "com no vull lluitar perquè ja tinc una edat, us done la possibilitat de\n"
                + "resoldre aquest conflicte amb una lluita matemàtica. Si sabeu dir-me\n"
                + "quin és el mínim comú múltiple de b4, b5, b6 i b7 tot haurà acabat."
        );
        return true;
    }
    public static void fin(){
        System.out.println("THE END");
    }
    
    public static void intentos() throws InterruptedException {
       
        int nivel = 0;
        do{
             boolean haAcertado = false;
            for (int i = 0; i < NUM_INTENTOS; i++) {
                switch (nivel) {
                    case 1:
                        if (nivel1(0, 30)) {
                            nivel++;
                            haAcertado = true;
                        }
                        break;

                    case 2:
                        if (nivel2()) {
                            nivel++;
                             haAcertado = true;
                        }
                        break;

                    case 3:
                        if (nivel3()) {
                            nivel++;
                             haAcertado = true;
                        }
                        break;

                    case 4:
                        if (nivel4()) {
                            nivel++;
                             haAcertado = true;
                        }
                        break;
                    case 5:
                        if (nivel5()) {
                            //ha ganado
                        }
                        break;
                    default:
                        if (inicio()) {
                            nivel++;
                             haAcertado = true;
                        }
                }
                if (haAcertado){
                break;}
            }
            if(!haAcertado && nivel == 5){
            //llamar a has perdido
            }
        }while(true);
    }
            
            
    public static int validacionErrores() {
        do {
            //System.out.print(respuesta);
            if (input.hasNextInt()){
                return input.nextInt();
            }
            System.out.println("Error! El tipo de datos introduidos es incorrecto");
            input.next();
        } while (true);
    }
    
        public static String validacionErrores(String respuesta) {
        do {
            System.out.print(respuesta);
            if (input.hasNextLine()){
                return input.nextLine();
            }
            System.out.println("Error! El tipo de datos introduidos es incorrecto");
            input.nextLine();
        } while (true);
    }
    
    
    public static void generarBolas() {
        B1 = generarNumAleatorio(3, 1);
        B2 = generarNumAleatorio(7, 4);
        B3 = generarNumAleatorio(7, 4, B2);
        B4 = generarNumAleatorio(7, 4, B2, B3);
        B5 = generarNumAleatorio(7, 4, B2, B3, B4);
        B6 = generarNumAleatorio(3, 1, B1);
        B7 = generarNumAleatorio(3, 1, B1, B6);
    }
    
    public static String generarCadenaASCII(int largo) {
        StringBuilder cadena = new StringBuilder();
        do {
            char random = (char)generarNumAleatorio(122, 48);
            if (random > 56 && random < 65 || random > 90 && random < 97) {
                
                continue;
            }
            cadena.append(random);
        } while (cadena.length() < largo);
        return cadena.toString();
    }
    
    public static String generarCadena(int largo) {
        StringBuilder cadena = new StringBuilder();
        do {
            int random = generarNumAleatorio(VOCALES.length() - 1, 0);
            cadena.append(VOCALES.charAt(random));
        } while (cadena.length() < largo);
        return cadena.toString();
    }
    
    public static int generarNumAleatorio(int max, int min){
        int numero = (int) (Math.random()*(max-min +1)+ min);
        return numero;
    }
    
    public static int generarNumAleatorio(int max, int min, int num) {
        int numero;
        do {
            numero = generarNumAleatorio(max, min);
        } while (numero == num);
        return numero;
    }
    
    public static int generarNumAleatorio(int max, int min, int num1, int num2) {
        int numero;
        do {
            numero = generarNumAleatorio(max, min);
        } while (numero == num1 || numero == num2);
        return numero;
    }
    
    public static int generarNumAleatorio(int max, int min, int num1, int num2, int num3) {
        int numero;
        do {
            numero = generarNumAleatorio(max, min);
        } while (numero == num1 || numero == num2 || numero == num3);
        return numero;
    }
    
    public static void imprimirMensaje(String mensaje) throws InterruptedException {
        for (int i = 0; i < mensaje.length(); i++) {
            System.out.print(mensaje.charAt(i));
            Thread.sleep(10);
        }
    
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

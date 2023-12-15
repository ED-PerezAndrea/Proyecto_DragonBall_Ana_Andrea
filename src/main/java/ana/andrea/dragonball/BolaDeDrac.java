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

    public static Scanner input;
    final static String SIGNO_SUMA = "+";
    final static String ASTERISCO = "*";
    final static int numMinFactorial = 1;
    public static int B1 = 0, B2 = 0, B3 = 0, B4 = 0, B5 = 0, B6 = 0, B7 = 0;
    
    public static void main(String[] args) {
        input = new Scanner(System.in);
        inicio();
        nivel2();
        nivel3();
        
    }
    
    public static void inicio(){
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
    }
    
    public static int nivel1(int n1, int n2){
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
        return resultado;
        //FALTARIA LLAMAR AQUÍ AL METODO DE GANAR O NO
    }

    
    public static String nivel2(){
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
        //StringBuilder cadena = new StringBuilder();
        //String cadena1 = "erjw3";
        //String cadena2 = "A3q2q";
        B2 = generarNumAleatorio(7, 4);
        
        String cadena = generarCadena(B2);
        String cadena2 = generarCadena(B2);
        
        String cadenaResultado = "";
        
        System.out.println("La mezcla sagrada de las cadenas de caráctes " + cadena + " i " + cadena2);
        for (int i = 0; i < cadena.length(); i++) {
           
            cadenaResultado = cadenaResultado.concat(String.valueOf(cadena2.charAt((cadena2.length() - 1) - i)));
            cadenaResultado = cadenaResultado.concat(String.valueOf(cadena.charAt(i)));

        }
        System.out.println("\nCorresponde a la cadena: " + cadenaResultado);
        return cadenaResultado;
    }

    public static int nivel3() {
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
        B3 = generarNumAleatorio(7, 4, B2);
        int resultado = numMinFactorial;
        for(int i = B3; i >= numMinFactorial; i--){
            System.out.print(i + ( (i == numMinFactorial)?"":ASTERISCO));
            resultado *=i;
        }
        System.out.println("\nEl resultado es: " + resultado);
        return resultado;
    }
    
    public static boolean nivel4() {
        String mensaje = String.format(
                "Boo: Vaja, vos ho he posat realment fácil. Ací teniu la bola. Ara bé, us\n"
                + "avance que encara teniu un os dur de rosegar. Cèl·lula també les\n"
                + "buscava i vaig escoltar en la tele que ja tenia unes quantes recollides.\n"
                + "Si no recorde mal, el vaig sentir a les notícies del canal número N de\n"
                + "la meua televisió.\n"
                + "Van sintonitzar el canal N i van confirmar que Cèl·lula es trobava en\n"
                + "“Ciutat Nova”. Ràpidament van anar a enfrontar-se amb ell i així\n"
                + "aconseguir les boles que tenia en el seu poder.\n"
                + "Son Gohan: Hola Cèl·lula, no volem problemes amb tu. Per favor,\n"
                + "dona'ns les teues boles de drac i no et farem mal.\n"
                + "Cèl·lula: Jajaja. He entrenat des de l'última lluita i ara no podreu amb\n"
                + "mi i, per descomptat, no podreu llevar-me les boles del drac que tinc\n"
                + "guardades a aquesta caixa. Juguem a un joc, la caixa té una\n"
                + "contrasenya, però l’única manera d’aconseguir-la és desxifrant\n"
                + "aquesta endevinalla, juguem?"
        );
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
    
    
    public static String generarCadena(int largo) {
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
    
    public static void imprimirMensaje(String mensaje) throws InterruptedException {
        for (int i = 0; i < mensaje.length(); i++) {
            System.out.println(mensaje.charAt(i));
            Thread.sleep(1);
        }
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
}

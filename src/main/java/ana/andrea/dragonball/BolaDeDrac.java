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
    
    public static void main(String[] args) {
        input = new Scanner(System.in);
        
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
        return true;
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
            System.out.println(mensaje.charAt(i));
            Thread.sleep(1);
        }
    }
}

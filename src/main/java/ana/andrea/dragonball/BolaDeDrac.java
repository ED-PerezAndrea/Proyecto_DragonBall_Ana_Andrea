/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ana.andrea.dragonball;

/**
 *
 * @author Ana Carbonell Prieto
 * @author Andrea Pérez Carbonell
 */
public class BolaDeDrac {

    public static void main(String[] args) {
        
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
        return true;
    }
    
    public static boolean nivel1(){
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
    return true;
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
    return true;
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
}

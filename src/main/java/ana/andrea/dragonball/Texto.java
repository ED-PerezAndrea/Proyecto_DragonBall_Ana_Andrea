/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ana.andrea.dragonball;

/**
 *
 * @author Ana Carbonell y Andrea Pérez
 */
public class Texto {
    private static final String RESET_TERMINAL = "\033c";
    private static final String RESET_TEXTO = "\u001B[0m";
    
    
    /*-------------- Estilos para el texto --------------*/
    
    private static final String NEGRITA = "\u001B[1m";
    private static final String CURSIVA = "\u001B[3m";
    private static final String PISTA = "\u001B[2m";
    private static final String PARPADEO = "\u001B[5m";
    
    
    /*-------------- Colores en negrita para el texto --------------*/
    
    private static final String COLOR_ROJO = "\u001B[31;1m";
    private static final String COLOR_VIOLETA = "\u001B[35;1m";
    private static final String COLOR_AMARILLO = "\u001B[33;1m";
    private static final String COLOR_AZUL = "\u001B[34;1m";
    private static final String COLOR_CYAN = "\u001B[36;1m";
    private static final String COLOR_VERDE = "\u001B[32;1m";
    
    
    /*-------------- Nombres de los personajes --------------*/
    
    private static final String NOMBRE_GOKU = COLOR_VIOLETA + "Son Goku: " + RESET_TEXTO;
    private static final String NOMBRE_GOHAN = COLOR_AMARILLO + "Son Gohan: " + RESET_TEXTO;
    private static final String NOMBRE_SATAN = COLOR_ROJO + "Satanàs Cor Petit: " + RESET_TEXTO;
    private static final String NOMBRE_BOO = COLOR_AZUL+ "Boo: " + RESET_TEXTO;
    private static final String NOMBRE_TEN = COLOR_CYAN + "Ten Shin Han: " + RESET_TEXTO;
    private static final String NOMBRE_CELULA = COLOR_VERDE + "Cèl·lula: " + RESET_TEXTO;
    private static final String NOMBRE_FREEZER = NEGRITA + "Freezer: " + RESET_TEXTO;
    
    
    /*-------------- Texto predeterminado del juego --------------*/
    
    public final static String PANTALLA_PRINCIPAL = PARPADEO + "\t\t\tPolsa qualsevol tecla per a començar la partida\n" + RESET_TEXTO;
    public final static String RESPUESTA_CORRECTA = PISTA + CURSIVA + "\tLa resposta correcta es: %d\n" + RESET_TEXTO;
    public final static String RESPUESTA_CORRECTA_TEXTO = PISTA + CURSIVA + "\tLa resposta correcta es: %s\n" + RESET_TEXTO;
    public final static String SUMATORIO = NEGRITA + "\tIntrodueix el numero Sumatori: \n" + RESET_TEXTO;
    public final static String MEZCLA_CARACTERES = CURSIVA + "\tLa mescla sagrada de les cadenes de caràcters es: %s %s %s\n" + RESET_TEXTO;
    public final static String CADENA = NEGRITA + "\tIntrodueix la cadena: \n" + RESET_TEXTO;
    public final static String NUM_FACTORIAL = NEGRITA + "\tIntrodueix el numero factorial: \n" + RESET_TEXTO;
    public final static String VOCAL_REPETIDAS = NEGRITA + "\tIntrodueix les vocals repetides: \n" + RESET_TEXTO;
    public final static String M_C_M = NEGRITA + "\tEl Mínim comú múltiple de %d %d %d %d es: \n" + RESET_TEXTO;
    public final static String PASA_DE_NIVEL = PISTA + NEGRITA + "\tEnhorabona!! Heu aconseguit passar de nivell\n" + RESET_TEXTO;
    public final static String PANTALLA_PASAR_NIVEL = PARPADEO + "\t\t\tPolsa qualsevol tecla per a pasar al següent nivell\n" + RESET_TEXTO;
    public final static String TEXTO_GANAR = PISTA + NEGRITA + "\tEnhorabona!! Heu aconseguit les 7 boles de Drac. El món torna a respirar tranquil. Fins un altra amics!\n" + RESET_TEXTO;
    public final static String TEXTO_PERDER = PISTA + NEGRITA + "\tMalauradament, la aventura ha acabat i el món torna a ser un lloc insegur. Una llàstima!\n" + RESET_TEXTO;
    public final static String TEXTO_ADEU = PISTA + "\t\t\t\tAdéu\n" + RESET_TEXTO;
    public final static String ERROR_VALIDACION = PISTA + "\tError! El tipus de dades introduït és incorrecte\n" + RESET_TEXTO;
    public final static String RESPUESTA_INCORRECTA = PISTA + "\tResposta incorrecta. Torna a intentar-ho.\n" + RESET_TEXTO;
     
    /*-------------- Texto predeterminado de los niveles --------------*/
    
    // Comentar el RESET_TERMINAL al principio de cada String si no se ejecuta en terminal
    public final static String INICIO = RESET_TERMINAL +
            NEGRITA +
            """
            BENVINGUTS A L’AVENTURA DE DRAGON BALL
            ========================================
            """
            + RESET_TEXTO +
            """
            
            Son-Goku es troba tranquil·lament a casa junt al seu fill Son-Gohan, a
            qui li està ajudant a resoldre uns deures que li han manat fer a l’escola,
            concretament son de matemàtiques. De sobte, apareix a casa el Fullet
            Tortuga i els conta que el malvat villà Freezer està planejant trobar les
            7 boles del drac per tal de demanar un desig i obtindre un poder que
            ningú podrà mai parar. El planeta està en perill. El Fullet Tortuga et
            demana ajuda ¿Vols que Son-Goku i Son-Gohan accepten el repte?
            
            """;
             
                                       
    public final static String LVL1 = RESET_TERMINAL +
            NOMBRE_GOKU +
            """
            Molt bé! Anem a buscar les boles de drac abans que
            Freezer puga tenir-les. --va dir Son-Goku des de la seua casa en el
            número %d de Ciutat del Nord.
            
            """
            + CURSIVA +
            """
            Goku va recordar que l’última vegada que les boles van ser repartides
            pel món de manera aleatòria, una d’elles va anar a parar a la zona on
            actualment viu el seu amic Satanàs Cor Petit i que probablement ell la
            tinga en el seu poder. Van marxar doncs cap al número %d de la Ciutat
            Meravella, que és on ell viu.
            Després d’un llarg camí, hem arribat a la casa de Satanàs i, en efecte,
            ell té una de les boles. Però no vol donar-nos-la gratuïtament, ja que li
            té molta estima. Ens proposa la següent lluita matemática:
            
            """
            + RESET_TEXTO + NOMBRE_SATAN +
            """
            Sabríeu dir-me quin és el sumatori entre el número
            de la vostra casa i el número de la meua? Si l’endevineu, vos donaré
            la bola i m’uniré al vostre equip.
            
            """;
                                      
    public final static String LVL2 = RESET_TERMINAL +
            NOMBRE_SATAN +
            """
            Sou uns cracks de les matemàtiques! Pensava que
            només sabíeu lluitar. Ací teniu la bola de %d estreles. Per cert, tinc el
            número de telèfon de Ten Shin Han, qui em va enviar un WhatsApp la
            setmana passada per contar-me que havia trobat la bola de %d estreles
            en el Desert de l’Oblit. Anem-hi!
            
            """
            + CURSIVA +
            """
            Només arribar, trobaren a Ten Shin Han el qual no tenia el seu millor
            dia i no els van rebre amb bona cara. Estava molt cabrejat perquè
            estava intentant resoldre un enigma matemàtic i no veia forma de ferho.
            
            """
            + RESET_TEXTO + NOMBRE_GOHAN +
            """
            Hola Ten Shin Han, necessitem que ens dones la teua
            bola de drac.
            
            """
            + NOMBRE_TEN +
            """
            Sí, un moment, resulta que porte així com 3 hores per
            a descrifrar un enigma alfabètic anomenat “La mescla sagrada de
            cadenes de text” i no veig la solució. Si m’ajudeu a resoldre’l, vos
            donaré la bola. 
            
            """;
    
    public final static String LVL3 = RESET_TERMINAL +
            NOMBRE_TEN +
            """
            Wow! Gràcies, ací teniu la bola de %d estreles. Per cert,
            vaig saber que el nostre enemic Boo va trobar una bola de drac en la
            seua mudança a “Muntanya Perduda”. Vos guiaré a la cova de la
            muntanya on viu. No és lluny d’ací.
            
            """
            + CURSIVA +
            """
            Boo es trobava descansant a la cova. Ja que va tindre molts problemes
            en els seus anteriors enfrontaments amb Goku aquest no tenia intenció
            de lluitar més amb ell, però al veure’l què anava a per la seua estimada
            bola de drac de %d estelles, no va reaccionar amb bones maneres.
            
            """
            + RESET_TEXTO + NOMBRE_BOO +
            """
            Què voleu? La meua bola de drac?
            
            """
            + NOMBRE_GOKU +
            """
            Necessitem reunir-les totes abans que Freezer. El món
            corre un gran perill! Sabem que tú ja no vols fer mal al planeta. T’ho
            demanem per favor, pel bé de tots.
            
            """
            + NOMBRE_BOO +
            """
            Però és meua! La vaig trobar jo! Encara que pensant-ho millor,
            només vos la donaré si em dieu la resposta correcta a la solució de
            quin és el factorial de %d.
            
            """;
    
    public final static String LVL4 = RESET_TERMINAL +
            NOMBRE_BOO +
            """
            Vaja, vos ho he posat realment fácil. Ací teniu la bola. Ara bé, us
            avance que encara teniu un os dur de rosegar. Cèl·lula també les
            buscava i vaig escoltar en la tele que ja tenia unes quantes recollides.
            Si no recorde mal, el vaig sentir a les notícies del canal número %d de
            la meua televisió.
            
            """
            + CURSIVA +
            """
            Van sintonitzar el canal %d i van confirmar que Cèl·lula es trobava en
            “Ciutat Nova”. Ràpidament van anar a enfrontar-se amb ell i així
            aconseguir les boles que tenia en el seu poder.
            
            """
            + RESET_TEXTO + NOMBRE_GOHAN +
            """
            Hola Cèl·lula, no volem problemes amb tu. Per favor,
            dona'ns les teues boles de drac i no et farem mal.
            
            """
            + NOMBRE_CELULA +
            """
            Jajaja. He entrenat des de l'última lluita i ara no podreu amb
            mi i, per descomptat, no podreu llevar-me les boles del drac que tinc
            guardades a aquesta caixa. Juguem a un joc, la caixa té una
            contrasenya, però l’única manera d’aconseguir-la és desxifrant
            aquesta endevinalla, juguem?
            
            """;
    
    public final static String LVL5 = RESET_TERMINAL +
            NOMBRE_CELULA +
            """
            Maleïts sigueu! L’heu endevinat, però.... he de confessar-vos
            que anava de fanal, i que no tinc cap bola de drac. El que sí puc dir-
            vos es que la resta de boles que neccesiteu las té Freezer. Aneu a
            molestar-lo a ell. Adèu!
            
            """
            + NOMBRE_GOKU +
            """
            Bé, anem corrent al planeta de Freezer a llevar-li les boles
            que resten. Esperem que surta tot bé.
            
            """
            + CURSIVA +
            """
            Van volar al Planeta Infernal on Freezer esperava al seus contrincants
            per a la lluita final.
            
            """
            + RESET_TEXTO + NOMBRE_GOKU +
            """
            Hola Freezer, sabem què trames. No ho permetrem.
            Dona'ns les boles de drac %d, %d, %d i %d que sabem que tens.
            
            """
            + NOMBRE_FREEZER +
            """
            De cap manera! Doneu-me vosaltres les vostres. Però mireu,
            com no vull lluitar perquè ja tinc una edat, us done la possibilitat de
            resoldre aquest conflicte amb una lluita matemàtica. Si sabeu dir-me
            quin és el mínim comú múltiple de %d, %d, %d i %d tot haurà acabat.
            
            """;
    
    
    /*-------------- Arte ASCII --------------*/

    public final static String ASCII_TITULO = RESET_TERMINAL +
            """
            
            \t__
            \t|  ""--.--.._                                             __..    ,--.
            \t|       `.   "-.'""\\_...-----..._   ,--. .--..-----.._.""|   |   /   /
            \t|_   _    \\__   ).  \\           _/_ |   \\|  ||  ..    >  `.  |  /   /
            \t  | | `.   ._)  /|\\  \\ .-""\"":-"   "-.   `  ||  |.'  ,'`. |  |_/_  /
            \t  | |_.'   |   / ""`  \\  ===/  ..|..  \\     ||      < ""  `.  "  |/__
            \t  `.      .    \\ ,--   \\-..-\\   /"\\   /     ||  |>   )--   |    /    |
            \t   |__..-'__||__\\   |___\\ __.:-.._..-'_|\\___||____..-/  |__|--""____/
            
            """;

public final static String ASCII_FULLET = RESET_TERMINAL + 
                "                        #=----+%                                  \n" +
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
"                 %*++*#%          %%     ";
    
public final static String ASCII_GOKU = RESET_TERMINAL +
        
        "              ___     -._\n" +
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
"            \\          `.  .--\"\"\"  \"\\.\\.\\ \\\\.'       )     |";
    

public final static String ASCII_BOO = RESET_TERMINAL +
        "                                               \n" +
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
"                    ;;;:                                  :;;;;.                  ";

public final static String ASCII_TEN_SHIN_AN = RESET_TERMINAL + 
     
                " .::-:::                                       \n" +
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
"*#%@@@:                                              \n" ;
    

 public final static String ASCII_CELL = RESET_TERMINAL + 
                "                                            \n" +
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
"                                   ++    ";
    
    
 public final static String ASCII_SON_GOHAN = RESET_TERMINAL + 
                "  __...__\n" +
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
"          / `.          `\\_,/'                     \\      \"`\\     \\";
    
    
public final static String ASCII_FREEZER = RESET_TERMINAL + 
                "                                                    \n" +
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
"                          @*+%     ";
    
    
  public final static String ASCII_SATANAS = RESET_TERMINAL + 
                "                             ____\n" +
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
"  \\                           _----_       /'| __...---.\\      |";
    
    
    
    public final static String ASCII_FIN =
            """
            
            \t______________ ______________  ___________ _______  ________
            \t\\__    ___/   |   \\_   _____/  \\_   _____/ \\      \\ \\______ \\
            \t  |    | /    ~    \\    __)_    |    __)_  /   |   \\ |    |  \\
            \t  |    | \\    Y    /        \\   |        \\/    |    \\|    `   \\
            \t  |____|  \\___|_  /_______  /  /_______  /\\____|__  /_______  /
            \t
             
            """;
    
    public final static String ASCII_PERDIDO =
            """
            
            \t     ___           ___           ___           ___
            \t    /  /\\         /  /\\         /__/\\         /  /\\
            \t   /  /:/_       /  /::\\       |  |::\\       /  /:/_
            \t  /  /:/ /\\     /  /:/\\:\\      |  |:|:\\     /  /:/ /\\
            \t /  /:/_/::\\   /  /:/~/::\\   __|__|:|\\:\\   /  /:/ /:/_
            \t/__/:/__\\/\\:\\ /__/:/ /:/\\:\\ /__/::::| \\:\\ /__/:/ /:/ /\\
            \t\\  \\:\\ /~~/:/ \\  \\:\\/:/__\\/ \\  \\:\\~~\\__\\/ \\  \\:\\/:/ /:/
            \t \\  \\:\\  /:/   \\  \\::/       \\  \\:\\        \\  \\::/ /:/
            \t  \\  \\:\\/:/     \\  \\:\\        \\  \\:\\        \\  \\:\\/:/
            \t   \\  \\::/       \\  \\:\\        \\  \\:\\        \\  \\::/
            \t    \\__\\/         \\__\\/         \\__\\/         \\__\\/
            \t     ___                        ___           ___
            \t    /  /\\          ___         /  /\\         /  /\\
            \t   /  /::\\        /__/\\       /  /:/_       /  /::\\
            \t  /  /:/\\:\\       \\  \\:\\     /  /:/ /\\     /  /:/\\:\\
            \t /  /:/  \\:\\       \\  \\:\\   /  /:/ /:/_   /  /:/~/:/
            \t/__/:/ \\__\\:\\  ___  \\__\\:\\ /__/:/ /:/ /\\ /__/:/ /:/___
            \t\\  \\:\\ /  /:/ /__/\\ |  |:| \\  \\:\\/:/ /:/ \\  \\:\\/:::::/
            \t \\  \\:\\  /:/  \\  \\:\\|  |:|  \\  \\::/ /:/   \\  \\::/~~~~
            \t  \\  \\:\\/:/    \\  \\:\\__|:|   \\  \\:\\/:/     \\  \\:\\
            \t   \\  \\::/      \\__\\::::/     \\  \\::/       \\  \\:\\
            \t    \\__\\/           ~~~~       \\__\\/         \\__\\/
            
            """;
}

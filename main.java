/**
 * Autómata No. 5
 * El lenguaje que contiene la subpalabra bcac
 */
public class main {

    public static String cadena;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //establecemos el valor de la cadena a evaluar
        cadena = "accbcaca";
        //creamos objeto y mandamos cómo parámetro  la cadena que se evaluará
        Automata5 miAut = new Automata5(cadena);
    }//fin del método main

}//fin de la clase main
public class Automata5 {

    //Declaración de campos
    String cadena;
    char[] caracter;
    int cont = 0;
    String concatenacion = "";
    boolean validacion = true;

    /**
     * Constructor
     * @param
     */
    public Automata5(String cadena) {
        this.cadena = cadena;
        //convertimos nuestra cadena a un arreglo de char
        caracter = cadena.toCharArray();
        //llamamos nuestro método S
        S();
    }//fin del constructor

    /**
     * Método S, donde se inicia a evaluar la cadena
     */
    private void S() {
        while(cont < cadena.length()){
            //si el caracter de nuestro arreglo posicion cont es igual a char a entonces
            if(caracter[cont] == 'a'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'a';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //valiacion = false
                    validacion = false;
                    //llamamso el método Resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método S
                    S();
                }//fin del if/else
            }else if(caracter[cont] == 'b'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'b';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //validacion = false
                    validacion = false;
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamammos método A
                    A();
                }//fin del if/else
            }else if(caracter[cont] == 'c'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'c';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //validacion = false
                    validacion = false;
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método S
                    S();
                }//fin del if/else
            }else{
                //igualamos cont a la longitud de la cantidad
                cont = cadena.length();
                //validacion igual a false
                validacion = false;
                //llamamos el método resultado
                resultado(validacion);
            }//fin del else
        }//fin del while
    }//fin del método S
    
    /**
     * Método A, donde sigue evaluando la cadena
     */
    private void A() {
        while(cont < cadena.length()){
            //si el caracter de nuestro arreglo posicion cont es igual a char a entonces
            if(caracter[cont] == 'a'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'a';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //validacion igual a false
                    validacion = false;
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método A
                    A();
                }//fin del if/else
            }else if(caracter[cont] == 'b'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'b';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //validacion igual a false
                    validacion = false;
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método A
                    A();
                }//fin del if/else
            }else if(caracter[cont] == 'c'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'c';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //validacion igual a false
                    validacion = false;
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método B
                    B();
                }//fin del if/else
            }else{
                //igualamos cont a la longitud de la cantidad
                cont = cadena.length();
                //validacion igual a false
                validacion = false;
                //llamamos el método resultado
                resultado(validacion);
            }//fin del else
        }//fin del while
    }//fin del método A
    
    /**
     * Método B, donde sigue evaluando la cadena
     */
    private void B() {
        while(cont < cadena.length()){
            //si el caracter de nuestro arreglo posicion cont es igual a char a entonces
            if(caracter[cont] == 'a'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'a';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //validacion igual a false
                    validacion = false;
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                     //llamamos el método C
                     resultado(validacion);
                    C();
                }//fin del if/else
            }else if(caracter[cont] == 'b'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'b';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //validacion igual a false
                    validacion = false;
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método B
                    B();
                }//fin del if/else
            }else if(caracter[cont] == 'c'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'c';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //validacion igual a false
                    validacion = false;
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método B
                    B();
                }//fin del if/else
            }else{
                //igualamos cont a la longitud de la cantidad
                cont = cadena.length();
                //validacion igual a false
                validacion = false;
                //llamamos el método resultado
                resultado(validacion);
            }//fin del else
        }//fin del while
    }//fin del método B
    
    /**
     * Método C, donde sigue evaluando la cadena
     */
    private void C() {
        while(cont < cadena.length()){
            //si el caracter de nuestro arreglo posicion cont es igual a char a entonces
            if(caracter[cont] == 'a'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'a';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //validacion igual a false
                    validacion = false;
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método C
                    C();
                }//fin del if/else
            }else if(caracter[cont] == 'b'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'b';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //validacion igual a false
                    validacion = false;
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método C
                    C();
                }//fin del if/else
            }else if(caracter[cont] == 'c'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'c';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //validacion igual a false
                    validacion = false;
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método D
                    D();
                }//fin del if/else
            }else{
                //igualamos cont a la longitud de la cantidad
                cont = cadena.length();
                //validacion igual a false
                validacion = false;
                //llamamos el método resultado
                resultado(validacion);
            }//fin del else
        }//fin del while
    }//fin del método C
    
    /**
     * Método D, donde sigue evaluando la cadena
     */
    private void D() {
        while(cont < cadena.length()){
            //si el caracter de nuestro arreglo posicion cont es igual a char a entonces
            if(caracter[cont] == 'a'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'a';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                     //llamamos el método D
                    D();
                }//fin del if/else
            }else if(caracter[cont] == 'b'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'b';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método D
                    D();
                }//fin del if/else
            }else if(caracter[cont] == 'c'){
                //concatenamos la cadena
                concatenacion = concatenacion + 'c';
                //mandamos imprimir la cadena que llevamos
                System.out.println("Secuencia: " + concatenacion);
                //incrementamos cont
                cont++;
                //si cont es igual a la longitud de la cadena entonces
                if(cont == cadena.length()){
                    //llamamos el método resultado
                    resultado(validacion);
                    break;
                }else{
                    //llamamos el método D
                    D();
                }//fin del if/else
            }else{
                //igualamos cont a la longitud de la cantidad
                cont = cadena.length();
                //validacion igual a false
                validacion = false;
                 //llamamos el método resultado
                resultado(validacion);
            }//fin del else
        }//fin del while
    }//fin del método D
    
    /**
     * Método para validar si la cadena introducida es valida o no
     * @param validacion
     */
    private void resultado(boolean validacion) {
        if(validacion){
            System.out.println("Cadena válida");
        }else{
            System.out.println("Cadena no válida");
        }//fin del if/else
    }//fin del método resultado

}//fin de la clase Automata5

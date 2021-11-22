import java.util.Random;
/**
 *    
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles()    {
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla  
     *  y al lado de cada nº se muestra otro nº con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 posiciones)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n)   {
        int numRandom = generador.nextInt(6001) - 1000;
        int media = 0;
        int sumaImpares = 0;
        int maxPares = 0;
        int v = 0;
        int saltoLinea = 1;
        
        while(numRandom != 0 && v != n){
            numRandom = generador.nextInt(6001) - 1000;
            media += numRandom;
            if(numRandom % 2 != 0){
                sumaImpares += numRandom;
            }    
            
            if(numRandom % 2 == 0){
                if(numRandom > maxPares){
                    maxPares = numRandom;
                }
            }
            System.out.printf("%12d:%5d", numRandom,obtenerNumeroSinCeros(numRandom));
            if(saltoLinea % 5 == 0){
                System.out.println();
            }
            saltoLinea++;
            v++;
        }
        System.out.println();
        System.out.println("Media = " + (media / n));
        System.out.println("Suma de los Impares = " + sumaImpares);
        System.out.println("Par Máximo = " + maxPares);
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        return numero % 2 != 0;
    }

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        int auxiliar = 1;
        int noCero = 0;

        if(numero > 0){
            int numAux = numero;
            while(numAux > 0){
                if(numAux % 10 != 0){
                    noCero += numAux % 10 * auxiliar;
                    auxiliar *= 10;
                }
                numAux /= 10;
            }
        } else {
            numero *= -1;
            int numAux = numero;
            while(numAux > 0){
                if(numAux % 10 != 0){
                    noCero += numAux % 10 * auxiliar;
                    auxiliar *= 10;
                }
                numAux /= 10;
            }
            return noCero *= -1; 
        }
        return noCero;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');
    }

    /**
     *  
     *  Dibuja la letra N (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   
     */
    public void escribirLetraN(int altura){
        System.out.println("Letra N - Altura: " + altura);
        for(int i = 0; i < altura; i++){
           escribirCaracter(CARACTER,1);
           escribirCaracter(ESPACIO,i);
           escribirCaracter(CARACTER,1);
           escribirCaracter(ESPACIO,(altura -1) -i);
           escribirCaracter(CARACTER,1);
           System.out.println();
        }

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        for(int si = n; si > 0; si--){
            System.out.print(caracter);
        }
    }
}

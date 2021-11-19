import java.util.Random;
/**
 *     @author Evelin Virunurm
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
        //TODO
        int randomNumber;
        int numeroPares = 0;
        int sumaImpares = 0;
        int media = 0;
        int sumaTotal = 0; // intentar deshacerme de esta variable
        for (int i = n; i > 0; i--) {
            randomNumber = (generador.nextInt(49001) - 1000); // Check que va bien
            System.out.printf("%12d:%5d", randomNumber, obtenerNumeroSinCeros(randomNumber));
            sumaTotal += randomNumber;
            if (esImpar(randomNumber)) {
                numeroPares++;
            } else {
                sumaImpares += randomNumber;
            }
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n\n");
        System.out.println("Media : " + (sumaTotal/n)); // va
        
        
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        return (numero % 2 == 0);
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
        String transformedNumberS = "";
        String numeroS = numero + ""; 
        
        for (int i = 0; i < numeroS.length(); i++) {
            if (numeroS.charAt(i) != '0') {
                transformedNumberS += numeroS.charAt(i);
            }
        }
        
        try {
            return Integer.parseInt(transformedNumberS);
        } catch (Exception e) {
            System.out.print("Something went wrong, you may have wrote 0.");
        }
        
        return numero;
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
    public void escribirLetraN(int altura)    {
       //TODO

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
       //TODO
       
       
       
       
    }

}

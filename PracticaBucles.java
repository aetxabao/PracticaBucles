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
       //TODO
        int sumaNum = 0, sumaImp = 0;
       int numeroRandom = generador.nextInt(51000+1)-1000;
       int media;
       int i = 0;
       int maxPares = -1001;

       if(!esImpar(numeroRandom)){
          maxPares = numeroRandom;
       }

       while(i<n && numeroRandom != 0){
           sumaNum += numeroRandom;

           if(esImpar(numeroRandom) ){
              sumaImp += numeroRandom;
           }
           else {
               if (maxPares < numeroRandom) {
                maxPares = numeroRandom;
               }
           }

           i++; 

           if (i % 5 == 0) {
             System.out.println();
           }
           System.out.print("            " + numeroRandom + ":   " + numeroRandom);

           numeroRandom = generador.nextInt(51000+1)-1000;
       }

        media = sumaNum / n;

       System.out.println("\n                         Media:          " + media);
       System.out.println("                         Suma impares:          " + sumaImp);
       System.out.println("                         Máximo pares:          " + maxPares);
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        //TODO
        
        {
        //TODO
        while ( numero % 2 != 0 ){
           return true; 
        }
        return false;
        
        }
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
        //TODO
        
        
        return 0;
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
       for (int i = 0; i < altura; i++) {
        escribirCaracter('@', 1);
        escribirCaracter(' ', i);
        escribirCaracter('@', 1);
        escribirCaracter(' ', altura - i - 1);
        escribirCaracter('@', 1);
        System.out.println();
      }
    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
       //TODO
       for (int i = 0; i < n; i++) {
        System.out.print(caracter);
      }
       
       
       
    }

}

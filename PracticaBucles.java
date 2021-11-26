import java.util.Random;
/**
 *    @author David Orayen
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
     *  El método  genera  números aleatorios  entre -1000 y 50000 (inclusive)
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
        
        int aleatorio = generador.nextInt(51001)-1000;
        int cantidad = 0;
        double media = 0;
        int sumaImpar= 0;
        int maxPar = 0;
        int otraLinea = 0;
        while(aleatorio <= n && aleatorio != 0){
            aleatorio =  generador.nextInt(51001)-1000;
            media = media + aleatorio;
            
            if(aleatorio % 2 == 0 ){
                if(aleatorio > maxPar){
                    maxPar = aleatorio;
                }
            }else{
                if(aleatorio % 2 != 0){
                    sumaImpar = sumaImpar + aleatorio;
                }
            }
            System.out.printf("%12d:%5d", aleatorio, obtenerNumeroSinCeros(aleatorio));
            if(otraLinea % 5 == 0){
                System.out.println();
            }
            otraLinea++;
            cantidad++;
            
        }
        System.out.println();
        System.out.println("Media : " + media);
        System.out.println("Suma impares: " + sumaImpar);
        System.out.println("Maximo pares: " + maxPar);
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        
        while(numero % 2 == 0 ){
            return false;
        }
        return true;
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
        int pos = 1;
        int resultado = 0;
        int div = 10;

        while(numero > 0){
            if(numero % div != 0){
                resultado = resultado + (numero % div * pos);
                pos = pos * div;
            }
            numero = numero / div;
        }
        return resultado;
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
        System.out.println("Letra N - Altura: "+ altura);
        
        for(int i = 0; i < altura; i++){
            escribirCaracter(CARACTER, 1);
            escribirCaracter(ESPACIO, i);
            escribirCaracter(CARACTER, 1);
            escribirCaracter(ESPACIO, (altura-1)-i);
            escribirCaracter(CARACTER, 1);
            System.out.println();
        }
    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        for(int i = 0; i<n;i++){
            System.out.print(caracter);
        }
    }
}

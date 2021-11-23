import java.util.Random;
/**
 *    
 */
public class PracticaBucles
{
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;
    private final int COLUMNAS = 5; // las cosas se hacen bien o no se hacen :)

    /**
     * Constructor  
     */
    public PracticaBucles()
    {
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
    public void generarNumeros(int n)
    {
        int numero = 0;
        int sinCeros = 0;
        double suma = 0;
        double sumaImpares = 0;
        double maximoPares = 0;
        int vueltas = 1;
        

        borrarPantalla();
        System.out.printf("\nNº maximo de aleatorios a generar: %d", n);
        System.out.printf("\no hasta que salga 0.\n\n");

        do
        {
            numero = (int) ( generador.nextDouble() * 6000 - 1000 );
            if(numero != 0)
            {
                suma += numero;
                if(esImpar(numero))
                {
                    sumaImpares += numero;
                }
                else
                {
                    if(numero > maximoPares)
                    {
                        maximoPares = numero;
                    }
                }

                sinCeros = obtenerNumeroSinCeros(numero);
                System.out.printf("%12d:%5d", numero, sinCeros);
                
                if(vueltas % COLUMNAS == 0)
                {
                    System.out.print("\n");
                }
                
                vueltas++;
            }
        }
        while(numero != 0 && vueltas <= n);

        System.out.println("\n");
        System.out.printf("\n%13s%12.2f", "Media:", suma / n);
        System.out.printf("\n%13s%12.2f", "Suma impares:", sumaImpares);
        System.out.printf("\n%13s%12.2f", "Maximo pares:", maximoPares);
        Utilidades.hacerPausa();
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)
    {
        return  numero % 2 != 0;
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
    public int obtenerNumeroSinCeros(int numero)
    {
        int sinCeros = 0;
        int cifra = 0;
        int vueltas = 0;
        int potencia = 0;

        do
        {
            cifra = numero % 10;
            numero /= 10;
            if(cifra != 0)
            {
                potencia = (int)Math.pow(10, vueltas);
                cifra *= potencia;
                sinCeros += cifra;
                vueltas++;
            }
        }
        while(numero != 0);
        
        return sinCeros;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()
    {
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
    public void escribirLetraN(int altura)
    {
       //TODO

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)
    {
       //TODO
       
       
       
       
    }

}

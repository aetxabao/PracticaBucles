import java.util.Random;
/**
 *  @author Adrian Garcia Galera
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
        int numero = 0;
        int veces = 0;
        int saltoLinea = 0;
        int suma = 0;
        double media = 0.0;
        double sumaImpares = 0;
        double maximoPares = 0;
        
        System.out.println("\nNº máximo de aleatorios a generar: " + n +
        "\no hasta que salga el cero\n");
        while(veces < n && n != 0){
            numero = generador.nextInt(6001)-1000;
            veces++;
            saltoLinea++;
            suma += numero;
            media = suma / veces;
            if(saltoLinea == 5){
                System.out.println("\n");
                saltoLinea = 0;
            }
            System.out.printf("%12d:%5d",numero, obtenerNumeroSinCeros(numero));
            if(esImpar(numero)){
                sumaImpares += numero;
            }
            if(!esImpar(numero) && maximoPares<numero){
                maximoPares = numero;
            }
        }
        
        
        
        System.out.println("\n\n\nMedia:" + media);
        System.out.printf("\nSuma Impares: " + sumaImpares);
        System.out.printf("\n\nMáximo Pares: " + maximoPares);
        

    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
         return (numero % 2 != 0);
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
        
        double numeroDecimal = 0;
        int veces = 1;
        double numeroFinal = 0;
        
        while(numero/1 != 0){
            if(numero%10 == 0){
                numero = numero/10;
            }else if(numero%10 != 0){
                numeroDecimal += (numero%10);
                numeroDecimal/=10;
                numero/=10;
                veces = veces*10;
            }
        } 
    
        numeroFinal = numeroDecimal * veces;
        
        return (int)numeroFinal;
        
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
        System.out.println("Letra N - Altura: " + altura);
        
        for(int v = 0; v<altura; v++){
            escribirCaracter(CARACTER, 1);
            escribirCaracter(ESPACIO, v);
            escribirCaracter(CARACTER, 1);
            escribirCaracter(ESPACIO, altura - v - 1);
            escribirCaracter(CARACTER, 1);
            System.out.println("\n");
        }

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        for(int v = 0; v<n; v++){
            System.out.print(caracter);
        }
    }

}

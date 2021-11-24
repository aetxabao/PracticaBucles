import java.util.Random;
/**
 *    @author Asier Taberna Robles
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
       int numero = generador.nextInt(5001)-1000;
       int veces = 0;
       double media = 0;
       int impares = 0;
       int cont = 0;
       int nMax = 0;
       System.out.println("Nº máximo de aleatorios puestos a generar: " 
       + n + "\no hasta que salga el 0\n");
       
       while(numero!=0 && veces<n){
           numero = generador.nextInt(51001)-1000;
           media += numero;
           if(esImpar(numero)){
               impares += numero;
           }else{
               if(nMax < numero){
                   nMax = numero;
               }
           }
           veces++;
           System.out.printf("%12d:%5d", numero, obtenerNumeroSinCeros(numero));
           cont++;
           if(cont==5){
               System.out.println();
               cont = 0;
           }
       }    
       media /= veces;
       System.out.printf("\n\n%25s:%10.2f","Media",media);
       System.out.printf("\n%25s:%10d", "Suma impares", impares);
       System.out.printf("\n%25s:%10d", "Máximo pares", nMax);
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        switch(numero%2){
            case 0:
                return false;
            default:
                return true;
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
        int n = 10;
        int m = 1;
        double r = numero%n/m;
        int c = 0;
        int exp = 0;
        
        while(numero/m>=1 || numero/m<=-1){
            r = numero%n/m;
            c += r*(Math.pow(10,exp));
            n *= 10;
            m *= 10;
            
            if(r>0 || r<0){
                exp++;
            }
        }
        
        
        return c;
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
       for(int filas = 0; filas<altura; filas++){
           escribirCaracter(CARACTER, 1);
           escribirCaracter(ESPACIO, filas);
           escribirCaracter(CARACTER, 1);
           escribirCaracter(ESPACIO,altura-1-filas);
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

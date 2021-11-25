import java.util.Random;
/**
 *    
 *    Carlos Conde Zudaire
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
    public void generarNumeros(int n){
        int num = generador.nextInt(6001) - 1000;
        int valor = 0;
        double media = 0.0;
        int impar = 0;
        int numMax = 0;
        int salto = 1;
        while(num != 0 && valor != n){
            num = generador.nextInt(6001) - 1000;
            media += num;
            if(num % 2 != 0){
                impar += num;
            }
            else if(num % 2 == 0){
                if(num > numMax){
                    numMax = num;
                }
            }
            System.out.printf("%12d:%5d", num, obtenerNumeroSinCeros(num));
            if(salto == 5){
                System.out.println();
            }
            salto++;
            valor++;
        }
        System.out.println();
        System.out.println("Media: " + media);
        System.out.println("Suma impares: " + impar);
        System.out.println("Maximo pares: " + numMax);

    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        //TODO
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
        //TODO
        int z = 0;
        int x = 10;
        int y = 1;
        while(numero > 0){
            if(numero % x != 0){
                z += (numero % x) * y;
                y *= x;
            }
            numero /= x;
        }
        while(numero < 0){
            if(numero % x != 0){
                z += (numero % x) * y;
                y *= x;
            }
            numero /= x;
        }
        return z;
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
        System.out.println("Letra N - Altura: " + altura);
        for(int f = 0; f < altura; f++){
            escribirCaracter(CARACTER, 0);
            escribirCaracter(ESPACIO, f);
            escribirCaracter(CARACTER, 0);
            escribirCaracter(ESPACIO, altura-f);
            escribirCaracter(CARACTER, 0);
            System.out.println();
        }
    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        //TODO
        for(int c = 0; c <= n; c++){
            System.out.print(caracter);
        }
    }
}

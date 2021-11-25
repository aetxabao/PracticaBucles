import java.util.Random;
/**
 *    Author - Juan Garbayo
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
        System.out.println("Nº maximo de aleatorios a generar " + n + "\no hasta que salga el 0");
        System.out.println();
        int cantidadNumeros = 1;
        int numeroAleatorio = generador.nextInt(51001) - 1000;
        double media = 0;
        double sumaImpar = 0;
        double maximoPar = 0;
        int sumaNumeros = 0;
        while (cantidadNumeros <= n && numeroAleatorio != 0) {
            numeroAleatorio = generador.nextInt(51001) - 1000;
            System.out.printf("%12d" + "%s" + "%5d", numeroAleatorio, ":", obtenerNumeroSinCeros(numeroAleatorio));
            if (cantidadNumeros % 5 == 0) {
                System.out.println();//Para imprimir una nueva linea
            }
            cantidadNumeros++;
            sumaNumeros += numeroAleatorio;
            if (esImpar(numeroAleatorio)) {
                sumaImpar += numeroAleatorio;
            }
            if (numeroAleatorio % 2 == 0 && numeroAleatorio > maximoPar) {
                maximoPar = numeroAleatorio;
            }
        }
        media = sumaNumeros / cantidadNumeros;
        System.out.println();
        System.out.println();
        String Media = "Media: ";
        String SumaImpares = "Suma impares: ";
        String MaximoPares = "Máximo pares: ";
        System.out.printf("%25s%10.2f\n", Media, media);
        System.out.printf("%25s%10.2f\n", SumaImpares, sumaImpar);
        System.out.printf("%25s%10.2f\n", MaximoPares, maximoPar);
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        while (numero % 2 == 0) {
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
        int numeroSinCeros = 0;
        int producto = 0;
        while (numero != 0) {
            int ultimoDigito = numero % 10;
            if (ultimoDigito == 0) {
                // numeroSinCeros = 0;
            } else {
                numeroSinCeros = numeroSinCeros + ultimoDigito * (int) Math.pow(10, producto);
                producto++;
            }
            numero /= 10;
        }
        return numeroSinCeros;
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
       for (int fila = 1; fila <= altura; fila += 1) {
           escribirCaracter(CARACTER, 1);
           escribirCaracter(ESPACIO, fila-1);
           escribirCaracter(CARACTER, 1);
           escribirCaracter(ESPACIO, altura - fila);
           escribirCaracter(CARACTER, 1);
           System.out.println();
       }
    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    public void escribirCaracter(char caracter, int n)    {
       for (int i = 1; i <= n; i+=1) {
           System.out.print(caracter);
       }
    }

}

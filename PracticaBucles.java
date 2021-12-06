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
    public PracticaBucles() {
        generador = new Random();
    }

    /**
     * El método genera números aleatorios entre -1000 y 5000 (inclusive)
     * y calcula y escribe:
     * - la media de todos los números
     * - la suma de los impares
     * - el máximo de los pares
     * 
     * El proceso termina cuando sale un 0 o bien se han escrito n nºs
     * 
     * Los números se escriben en filas de 5 columnas
     * Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla
     * y al lado de cada nº se muestra otro nº con las mismas cifras y
     * en el mismo orden pero sin ceros (en 5 posiciones)
     * 
     * Utiliza solo bucles while
     */
    public void generarNumeros(int n) {
        int maximoPares = Integer.MIN_VALUE;
        int suma = 0;
        int sumaImpares = 0;
        int total = 0;
        System.out.printf("\n%25s\n\n", "Nº máximo de aleatorios a generar " + n + "\no hasta que salga el 0");
        int aleatorio = generador.nextInt(6001) - 1000;
        while (aleatorio != 0 && total < n) {
            total++;
            suma += aleatorio;
            if (esImpar(aleatorio)) {
                sumaImpares += aleatorio;
            } else if (aleatorio > maximoPares) {
                maximoPares = aleatorio;
            }

            System.out.printf("%12d:%5d", aleatorio, obtenerNumeroSinCeros(aleatorio));
            if (total % 5 == 0) {
                System.out.printf("\n");
            }
            aleatorio = generador.nextInt(6001) - 1000;
        }
        // por si el primer nº aleatorio ya es el 0
        if (total != 0) {
            double media = (double) suma / total;
            System.out.printf("\n\n\n%25s:  %10.2f", "Media", media);
            System.out.printf("\n%25s:  %10d", "Suma impares", sumaImpares);
            System.out.printf("\n%25s:  %10d", "Máximo pares", maximoPares);

        }

    }

    /**
     * Devuelve true si numero es impar, false en otro caso
     * Hazlo sin utilizar if
     */
    public boolean esImpar(int numero) {
        return numero % 2 != 0;
    }

    /**
     * Dado un nº genera y devuelve otro nuevo
     * con las mismas cifras y en el mismo orden pero sin
     * los 0
     * Ej - si numero = 2040 devuelve 24, si numero = 1009 devuelve 19
     * si numero = 3000 devuelve 3
     * 
     * 
     */
    public int obtenerNumeroSinCeros(int numero) {
        int potencia = 1;
        int sinCeros = 0;
        while (numero != 0) {
            int cifra = numero % 10;
            if (cifra != 0) {
                sinCeros += cifra * potencia;
                potencia *= 10;
            }
            numero /= 10;

        }
        return sinCeros;
    }

    /**
     * Borrar la pantalla
     *
     */
    public void borrarPantalla() {
        System.out.println('\u000C');
    }

    /**
     * 
     * Dibuja la letra N (ver figura en el enunciado)
     * Con bucles for
     * 
     * Hay que usar el método escribirCaracter()
     * 
     * 
     * 
     */
    public void escribirLetraN(int altura) {
        System.out.println("Letra N - Altura: " + altura);
        for (int f = 1; f <= altura; f++) {
            System.out.printf("%c", CARACTER);
            escribirCaracter(ESPACIO, f - 1);
            System.out.printf("%c", CARACTER);
            escribirCaracter(ESPACIO, altura - f);
            System.out.printf("%c\n", CARACTER);
        }

    }

    /**
     * escribe n veces el caracter indicado en la misma línea
     * con bucles for
     */
    private void escribirCaracter(char caracter, int n) {
        for (int c = 1; c <= n; c++) {
            System.out.printf("%c", caracter);
        }
    }

}

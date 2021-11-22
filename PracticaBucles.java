import java.util.Random;
/**
 *     @author Evelin Virunurm
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private final Random generador;

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
    public void generarNumeros(int n) {
        int randomNumber; // = generador.nextInt(6001) - 1000;
        int maximoPares = 0;
        int sumaImpares = 0;
        double sumaTotal = 0;
        int i = 0;
        while (i < n) {
            randomNumber = generador.nextInt(6001) - 1000;
            System.out.printf("%12d:%5d", randomNumber, obtenerNumeroSinCeros(randomNumber));
            sumaTotal += randomNumber;
            if (esImpar(randomNumber)) {
                if (maximoPares < randomNumber) {
                    maximoPares = randomNumber;
                }
            } else {
                sumaImpares += randomNumber;
            }
            if (randomNumber == 0) {break;}
            if ((i+1) % 5 == 0) {
                System.out.println();
            }
            i++;
        }
        /*for (int i = 0; i < n; i++) {
            randomNumber = generador.nextInt(49001) - 1000;
            System.out.printf("%12d:%5d", randomNumber, obtenerNumeroSinCeros(randomNumber));
            sumaTotal += randomNumber;
            if (esImpar(randomNumber)) {
                if (maximoPares < randomNumber) {
                     maximoPares = randomNumber;
                }
            } else {
                sumaImpares += randomNumber;
            }
            if (i % 5 == 0 && i != 0) {
                System.out.println();
            }
        }*/
        System.out.println("\n\n");
        System.out.printf("%25s:%10.2f\n%25s:%10d\n%25s:%10d", "Media",(sumaTotal/n), "Suma impares", sumaImpares,"Máximo pares", maximoPares);
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
    public int obtenerNumeroSinCeros(int numero) {
        int num = numero;
        int withoutZeros = 0;
        int counter = 1;

        if (num < 0) {
            num *= -1;
            while (num > 0) {
                if (num % 10 != 0) {  withoutZeros += (num % 10) * counter; counter *= 10; }
                num /= 10;
            }
            // num *= -1;
            return (withoutZeros *= -1);
        }

        while (num > 0) {
            if (num % 10 != 0) {  withoutZeros += (num % 10) * counter; counter *= 10; }
            num /= 10;
        }
        return withoutZeros;

    }


    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla() {
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
    public void escribirLetraN(int altura) {
        System.out.println("Letra N - Altura: " + altura);
        for (int i = 0; i < altura; i++) {
            escribirCaracter(CARACTER,1);
            escribirCaracter(ESPACIO, i);
            escribirCaracter(CARACTER,1);
            escribirCaracter(ESPACIO, (altura - 1)-i);
            escribirCaracter(CARACTER,1);
            System.out.println();
        }

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(caracter);
        }
    }

}

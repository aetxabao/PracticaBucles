import java.util.Random;
/**
 * @author David Reguilón
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
        //DONE
        Random generaNumeros = new Random();
        int total = 0;
        int sumaImpares = 0;
        int maximoPares = -1001;
        int contador = 0;//Cuenta el total de numeros
        while(contador < n) {
            int cuentaFila = 0;//Cuenta los numeros de cada fila
            while (cuentaFila < 5 && contador < n){
                int elNumero = generaNumeros.nextInt(6001) - 1000;
                System.out.print(elNumero+"\t");
                cuentaFila++;
                contador++;
                total = total + elNumero;
                if(elNumero % 2 != 0){
                    sumaImpares += elNumero;
                }else if(elNumero > maximoPares){
                    maximoPares = elNumero;

                }
            }
            System.out.println();

        }
        System.out.println("La media "+total/n);
        System.out.println("La suma de impares es "+ sumaImpares);
        if (maximoPares != -1001) {
            System.out.println("El maximo de pares es " + maximoPares);
        }else{
            System.out.println("No han salido numeros pares");
        }
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        //DONE
        return numero % 2 == 1;//Si el resto es 1, el numero es impar, devuelve true.
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
        //DONE
        //char admite numeros
        //Bucle que nos permita movernos en la cifra para comprobar si es un 0
        int pos = 1;
        int resul = 0;
        int divisor = 10;
        // int aux = numero;
        while(numero > 0){
            if (numero % divisor != 0) {
                resul += numero % divisor * pos;
                pos *= divisor;
            }
            numero /= divisor;

        }
        return resul;
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
        //DONE
        for (int i = 0; i < altura;i++){
            System.out.print(CARACTER);
            escribirCaracter(ESPACIO,i);
            System.out.print(CARACTER);
            escribirCaracter(ESPACIO,altura - i-1);
            System.out.println(CARACTER);
        }

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        //Done
        for (int i = 1;i <= n;i++){
            System.out.print(caracter);
        }
    }
}

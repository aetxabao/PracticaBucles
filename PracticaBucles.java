import java.util.Random;
/**
 *  Iñigo salinas  
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
    public void generarNumeros(int n)   
    {
       int numero = generador.nextInt(5001)-1000;
       int veces = 0;
       double media = 0;
       int imp = 0;
       int conta = 0;
       int numeroMax = 0;
       System.out.println("Nº maximo de aleatorios puestos a generar: " 
       + n + " o hasta que salga el 0");
       
       while(numero!=0 && veces<n)
       {
           numero = generador.nextInt(51001)-1000;
           media += numero;
           if(esImpar(numero))
           {
               imp += numero;
           }
           else if(numeroMax < numero)
           {
                numeroMax = numero;
           }
           veces++;
           System.out.printf("%12d:%5d\n", numero, 
           obtenerNumeroSinCeros(numero));
           conta++;
           if(conta==5)
           {
               System.out.println();
               conta = 0;
           }
       }    
       media /= veces;
       System.out.printf("%25s:%10.2f\n","Media:",media);
       System.out.printf("%25s:%10d\n", "Suma impares:", imp);
       System.out.printf("%25s:%10d\n", "Máximo pares:", numeroMax);  
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        switch (numero % 2)
        {
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
    public int obtenerNumeroSinCeros(int numero)   
    {
        int num = 10;
        int nDevuelto = 1;
        double r=0;
        int numReturnado = 0;
        int exp = 0;

        while(numero /nDevuelto>=1 || numero /nDevuelto<=-1)
        {
            r = numero%num/nDevuelto;
            numReturnado += r*(Math.pow(10,exp));
            num *= 10;
            nDevuelto *= 10;

            if(r >0 || r <0)
            {
                exp++;
            }
        }

        return numReturnado;
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
       for(int i = 0; i<altura; i++){
           escribirCaracter(CARACTER, 1);
           escribirCaracter(ESPACIO, i);
           escribirCaracter(CARACTER, 1);
           escribirCaracter(ESPACIO,  altura-1-i);
           escribirCaracter(CARACTER, 1);
           System.out.println();
       }

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        //TODO
        for(int i = 0; i<n;i++){
           System.out.print(caracter);
       }

       
    }
}

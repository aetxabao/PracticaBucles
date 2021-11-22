import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class TestPracticaBucles
{

    /**
     *  Punto de entrada a la aplicación
     *  - define y crea el teclado  
     *  - define e instancia un objeto PracticaBucles
     *  - pide al usuario la cantidad máxima de aleatorios a generar
     *    (valida que sea  un nº positivo)
     *  - muestra las estadísticas de números aleatorios
     *  - haz una pausa y borra la pantalla    
     *  
     *  - pide al usuario un valor para la altura de la letra N -
     *          Valida que este valor es correcto, es decir,
     *          está en el intervalo 3 <= altura <= 10
     *  - muestra la letra N
     *  
     */
    public static void main(String[] args)    {
        Scanner teclado = new Scanner(System.in);        
        PracticaBucles practica = new PracticaBucles();
        System.out.println("Introduce una cantidad de números aleatorios");
        int numNums = teclado.nextInt();
        while(numNums <= 0){
            System.out.println("Introduce un número mayor que 0");
            numNums = teclado.nextInt();
        }
        practica.generarNumeros(numNums);
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        System.out.println("Introduce una altura para la letra N");
        int numN = teclado.nextInt();
        while(numN < 3 || numN > 10){
            System.out.println("Introduce un número entre 3 y 10 ambos incluidos");
            numN = teclado.nextInt();
        }
        practica.escribirLetraN(numN);
    }
}


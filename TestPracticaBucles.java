import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 *  @author Adrian Garcia Galera
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
        PracticaBucles practicaBucles = new PracticaBucles();
        System.out.println("Escribe la cantidad de numeros aleatorios que deseas generar:");
        int cantidadNumeros = teclado.nextInt();
        while(cantidadNumeros <= 0){
            System.out.println("Debes escribir un numero positivo ;)");
            cantidadNumeros = teclado.nextInt();
        }
        practicaBucles.generarNumeros(cantidadNumeros);
        Utilidades.hacerPausa();
        practicaBucles.borrarPantalla();
        System.out.println("Escribe la altura que deseas que tenga la letra N, (debe de ser un valor entre 3 y 10):");
        int altura = teclado.nextInt();
        while(altura < 3 || altura > 10){
            System.out.println("Error, recuerda, la altura debe de ser un valor de entre 3 y 10");
            altura = teclado.nextInt();
        }
        practicaBucles.escribirLetraN(altura);
    }
}


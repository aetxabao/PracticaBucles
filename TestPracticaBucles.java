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

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        PracticaBucles miPractica = new PracticaBucles();
        int maxAleatorios = 0;
        int tamano = 0;

        System.out.print("\n\n");
        maxAleatorios = pedirNumero(1, 42, "Introduce un maximo de numeros a generar (1 - 42): ");
        miPractica.generarNumeros(maxAleatorios);

        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();

        tamano = pedirNumero(3, 10, "Introduce altura para la N (3 - 10): ");
        miPractica.escribirLetraN(tamano);
    }

    private static int pedirNumero(int min, int max, String mensaje)
    {
        Scanner teclado = new Scanner(System.in);
        int resul = 0;

        do
        {
            System.out.print(mensaje);
            resul = teclado.nextInt();
        }
        while ( resul < min || resul > max);

        return resul;
    }
}




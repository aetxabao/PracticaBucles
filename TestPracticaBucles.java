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
        PracticaBucles practicaBucle = new PracticaBucles();
        System.out.println("Introduce el nº aleatorio de números a generar");
        int cantidad = teclado.nextInt();
        while(cantidad <= 0){
            System.out.println("Número incorrecto, introduce uno mayor a 0");
            cantidad++;
        }

        practicaBucle.generarNumeros(cantidad);
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        System.out.println("Introduce una altura en la letra N");
        int valor = teclado.nextInt();

        while(valor < 3 || valor > 10){
            System.out.println("Número incorrecto, introduce un valor entre el 3 y 10");
            valor = teclado.nextInt();
        }
    }
}


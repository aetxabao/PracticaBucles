import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 * @author David Reguilón
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
        //TODO
        PracticaBucles demo = new PracticaBucles();
        //demo.obtenerNumeroSinCeros(2040);
        //System.out.print(demo.obtenerNumeroSinCeros(2040));

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuantos numeros quieres generar?");
        int numeroLegal = teclado.nextInt();
        while(numeroLegal <= 0){
            System.out.println("El numero tiene que ser positivo");
            numeroLegal = teclado.nextInt();
        }
        demo.generarNumeros(numeroLegal);
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();

        System.out.println("¿De que altura quieres la N?");
        int alturaLegal = teclado.nextInt();
        while(alturaLegal < 3 || alturaLegal > 10){
            System.out.println("El numero tiene que ser mayor que 3 y menor que 10");
            alturaLegal = teclado.nextInt();
        }
        demo.escribirLetraN(alturaLegal);
    }
}


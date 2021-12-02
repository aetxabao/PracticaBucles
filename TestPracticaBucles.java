import java.util.Scanner;
import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *      @author Carlos Alonso
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
        int numerosAGenerar;
        int valorAlturaN;
        Scanner teclado = new Scanner(System.in);
        PracticaBucles practica = new PracticaBucles();

        // Generar numeros aleatorios.
        
        
        
            numerosAGenerar = teclado.nextInt();
        
        while (numerosAGenerar <= 0);
        practica.generarNumeros(numerosAGenerar);

        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();

        // Imprimir N con una altura especifica.
        
        
            valorAlturaN = teclado.nextInt();
        
        while (valorAlturaN < 3 || valorAlturaN > 10);
        practica.escribirLetraN(valorAlturaN);
    }
}


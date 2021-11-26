import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 * 
 *  @author David Orayen
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
        Scanner teclado = new Scanner(System.in);
        PracticaBucles pruebas = new PracticaBucles();
        
        System.out.println("Dame nº máximo de aleatorios a generar");
        int max = teclado.nextInt();

        while(max <= 0){
            System.out.println("Dame un valor mayor que 0");
            max++;
        }

        pruebas.generarNumeros(max);
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        
        System.out.println("Teclea altura de la letra N");
        int valido = teclado.nextInt();

        while(valido <= 3 && valido >= 10){
            System.out.println("Altura incorrecta, teclea altura de la letra N (3<= altura <= 10): ");
        }
        
        pruebas.escribirLetraN(valido);
    }
}


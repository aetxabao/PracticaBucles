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
        //TODO
        Scanner teclado = new Scanner(System.in);
        PracticaBucles practicaBucles = new PracticaBucles();
        int cantidad = 0;
        int altura = 0;
        System.out.println("Genera cantidad maxima de aleatorios");
        
        cantidad = teclado.nextInt();
        
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        
        System.out.println("Dame un valor: ");
        if(altura <=3 || altura >=10){
            altura= teclado.nextInt();
        }
    }
}


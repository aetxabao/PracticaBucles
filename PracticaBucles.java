import java.util.Random;
/**
 * @author - Joan Garcia 
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
        //TODO: maxPares y quitar 0 de numeros de 5 cifras
        int numero = 1;
        int veces = 0;
        int suma = 0;
        int sumaImp = 0;
        int maxPar = 0;
        int aux = 0;
        System.out.println("Nº aleatoria máximo a generar " + n);
        System.out.println("o hasta que salga el cero");
        System.out.println();
        while(numero != 0 && veces < n){
            if(esImpar(numero) == false && numero > aux){
                maxPar = numero;
                aux = numero;
            }
            numero = generador.nextInt(51000)-1000;
            veces++;
            System.out.printf("%12d:\t%d %c", numero, obtenerNumeroSinCeros(numero), ESPACIO);
            suma = suma + numero;
            if( veces % 5 == 0){
                System.out.printf("\n");
            }
            if(esImpar(numero)){
                sumaImp = sumaImp + numero;
            }
        }
        double media = suma / veces;
        System.out.printf("\n\n \t\t Media: \t%10.2f", media);
        System.out.printf("\n \t\tSuma impares: \t%d ", sumaImp);
        System.out.printf("\n \t\t Maximo pares: \t%d", maxPar);

    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        while(numero % 2 != 0){
            numero ++;
            return true;
        }
        return  false;
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
        int c0 = (int)(numero / 10000);//
        int c1 = (int)((numero / 1000)%10); //primera cifra de izquierda a derecha
        int c2 = (int)((numero / 100) % 10); //segunda cifra de izquierda a derecha
        int c3 = (int)((numero / 10) % 10); //tercera cifra de izquierda a derecha
        int c4 = (int)(numero % 10); //cuarta cifra de izquierda a derecha
        
        if(c0 == 0 && c1 == 0 && c2 == 0 && c3 == 0 && c4 != 0 ){
            numero = c4;
        }
        if(c0 == 0 && c1 == 0 && c2 == 0 && c3 != 0 && c4 == 0 ){
            numero = c3;
        }
        if(c0 == 0 && c1 == 0 && c2 == 0 && c3 != 0 && c4 != 0 ){
            numero = (c3 * 10) +c4;
        }
        if(c0 == 0 && c1 == 0 && c2 != 0 && c3 != 0 && c4 == 0 ){
            numero = c2;
        }
        if(c0 == 0 && c1 == 0 && c2 != 0 && c3 == 0 && c4 != 0 ){
            numero = (c2 * 10) +c4;
        }
        if(c0 == 0 && c1 == 0 && c2 != 0 && c3 != 0 && c4 == 0 ){
            numero = (c2 * 10) +c3;
        }
        if(c0 == 0 && c1 == 0 && c2 != 0 && c3 != 0 && c4 != 0 ){
            numero = (c2 * 100) + (c3 * 10) + c4;
        }
        if(c0 == 0 && c1 != 0 && c2 == 0 && c3 == 0 && c4 == 0 ){
            numero = c1;
        }
        if(c0 == 0 && c1 != 0 && c2 == 0 && c3 == 0 && c4 != 0 ){
            numero = (c1 * 10) +c4;
        }
        if(c0 == 0 && c1 != 0 && c2 == 0 && c3 != 0 && c4 == 0 ){
            numero = (c1 * 10) +c3;
        }
        if(c0 == 0 && c1 != 0 && c2 == 0 && c3 != 0 && c4 != 0 ){
            numero = (c1 * 100) + (c3 * 10) + c4;
        }
        if(c0 == 0 && c1 != 0 && c2 != 0 && c3 == 0 && c4 == 0 ){
            numero = (c1 * 10) +c2;
        }
        if(c0 == 0 && c1 != 0 && c2 != 0 && c3 == 0 && c4 != 0 ){
            numero = (c1 * 100) + (c2 * 10) + c4;
        }
        if(c0 == 0 && c1 != 0 && c2 != 0 && c3 != 0 && c4 == 0 ){
            numero = (c1 * 100) + (c2 * 10) + c3;
        }
        
        if(c0 != 0 && c1 == 0 && c2 == 0 && c3 == 0 && c4 != 0 ){
            numero = (c0*10) +c4;
        }
        if(c0 != 0 && c1 == 0 && c2 == 0 && c3 != 0 && c4 == 0 ){
            numero = (c0*10) +c3;
        }
        if(c0 != 0 && c1 == 0 && c2 == 0 && c3 != 0 && c4 != 0 ){
            numero = (c0*100) +(c3 * 10) +c4;
        }
        if(c0 != 0 && c1 == 0 && c2 != 0 && c3 != 0 && c4 == 0 ){
            numero = (c0*10) +c2;
        }
        if(c0 != 0 && c1 == 0 && c2 != 0 && c3 == 0 && c4 != 0 ){
            numero = (c0*100) +(c2 * 10) +c4;
        }
        if(c0 != 0 && c1 == 0 && c2 != 0 && c3 != 0 && c4 == 0 ){
            numero =  (c0*100) +(c2 * 10) +c3;
        }
        if(c0 != 0 && c1 == 0 && c2 != 0 && c3 != 0 && c4 != 0 ){
            numero = (c0*1000) +(c2 * 100) + (c3 * 10) + c4;
        }
        if(c0 != 0 && c1 != 0 && c2 == 0 && c3 == 0 && c4 == 0 ){
            numero = (c0*10) +c1;
        }
        if(c0 != 0 && c1 != 0 && c2 == 0 && c3 == 0 && c4 != 0 ){
            numero = (c0*100) +(c1 * 10) +c4;
        }
        if(c0 != 0 && c1 != 0 && c2 == 0 && c3 != 0 && c4 == 0 ){
            numero = (c0*100) +(c1 * 10) +c3;
        }
        if(c0 != 0 && c1 != 0 && c2 == 0 && c3 != 0 && c4 != 0 ){
            numero = (c0*1000) +(c1 * 100) + (c3 * 10) + c4;
        }
        if(c0 != 0 && c1 != 0 && c2 != 0 && c3 == 0 && c4 == 0 ){
            numero = (c0*100) +(c1 * 10) +c2;
        }
        if(c0 != 0 && c1 != 0 && c2 != 0 && c3 == 0 && c4 != 0 ){
            numero = (c0*1000) +(c1 * 100) + (c2 * 10) + c4;
        }
        if(c0 != 0 && c1 != 0 && c2 != 0 && c3 != 0 && c4 == 0 ){
            numero = (c0*1000) +(c1 * 100) + (c2 * 10) + c3;
        }
        return numero;
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
        // ◦ escribir el carácter @
        // ◦ escribir espacios
        // ◦ escribir el carácter @
        // ◦ escribir espacios
        // ◦ escribir el carácter @
        int espacios = 1;
        System.out.println("Letra: N - Altura: " + altura);
        for(int i = 0; i < altura; i++){
            escribirCaracter(CARACTER, 1);
            escribirCaracter(ESPACIO, i);
            escribirCaracter(CARACTER, 1);
            escribirCaracter(ESPACIO, altura - espacios);
            escribirCaracter(CARACTER, 1);
            espacios++;
            System.out.println();
        }
    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        for(int i = 0; i < n; i++){
            System.out.print(caracter);
        }
    }
}

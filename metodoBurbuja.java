package estructuradatos;
import java.util.Scanner;

/**
 * NOMBRE DEL ALUMNO: HERNANDEZ GOMEZ MARISOL
 * MATRICULA:9068
 * MATERIA: ESTRUCTURA DE DATOS
 * NOMBRE DEL PROFESOR: VELEZ GERARDO
 * ESCUELA: CETYS UNIVERSIDAD
 * CARRERA: INGENIERIA DE SOFTWARE
 * NOMBRE DE LA PRACTICA: 1) METODO DE LA BURBUJA
 * OBJETIVO: ORDENAMIENTO DE UNA SERIE DE NUMEROS
 */
public class metodoBurbuja 
{
    public static void main(String[] args)
    {  
        /**
         * DECLARAR SCANNER, ARREGLO, VARIABLE AUXILIAR Y VARIABLE QUE 
         * ALMACENARA LOS NUMEROS
         */
        Scanner input = new Scanner(System.in);
        double hjelp=0;
        /**
         * MENSAJE MOSTRADO EN LA CONSOLA QUE DETERMINARA 
         * EL TAMAÑO DEL ARRAY PARA ALMACENAR LOS NUMEROS
         */
        System.out.println("ORDENAMIENTO DE SELECCION");
        System.out.println("Ingrese el número de elementos");
        int gemNumber = input.nextInt();
        double liste [] = new double[gemNumber];
        
        double burbujaMetodo = metodoBurbuja(gemNumber, liste);

    }

    public static double metodoBurbuja(double gemNumber, double liste[])
    {
        Scanner input = new Scanner(System.in);
        double hjelp = 0;
        for(int i = 0; i<gemNumber; i++)
        {
            System.out.println((i+1)+ ". Ingrese un número");
            liste[i] = input.nextInt();
        }
        /**
         * FOR QUE RECORRERA EL ARRAY
         */
        for(int i = 0; i<(liste.length-1); i++)
        {
            /**
            * FOR PARA ORDENAR LOS NUMEROS
            */ 
            for(int j = 0; j<(liste.length)-1; j++)
            {
                /**
                 * IF QUE COMPARA DOS NUMEROS Y LOS ORDENA
                 */
                if(liste[j] > liste[j+1])
                {
                   hjelp = liste[j]; //ALMACENAR EL NUMERO MAYOR EN LA VAR. AUXILIAR
                   liste[j] = liste[j+1]; //CAMBIAR EL NUMERO MENOR POR EL MAYOR
                   liste[j+1] = hjelp; //ALMACENAR EL NUMERO MENOR EN LA VAR. AUXILIAR
                }
            }
        }
        /**
         * FOR QUE IMPRIME LOS NUMEROS ORDENADOS
         */
            System.out.println("Ascendiente");
        
        for(int i=0; i<gemNumber; i++)
        {
            System.out.print(liste[i] + "|");
        }
        
            System.out.println("\n" + "Descendiente");
         for(int j = (int) (gemNumber-1); j>=0; j--)
        {
            System.out.print(liste[j] + "|");
        }
        return 0;
        
    }

}

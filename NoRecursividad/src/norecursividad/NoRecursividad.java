package norecursividad;
import java.util.Arrays;
/**
 *
 * @author israe
 */
public class NoRecursividad {

    public static void main(String[] args) {
    
        System.out.println("\npruebas fibonacci");
        System.out.println("fibonacci de 5: " + NoRecursivos.fibonacci(5));
        System.out.println("fibonacci de 40: " + NoRecursivos.fibonacci(40));

        System.out.println("\npruebas mcd");
        System.out.println("mcd de 45 y 75 = " + NoRecursivos.mcd(45, 75));
        System.out.println("mcd de 47 y 91 = " + NoRecursivos.mcd(47, 91));

        System.out.println("\npruebas count");
        Integer[] numeros = {1,2,3,3,2,3,1};
        System.out.println("arreglo: " + Arrays.toString(numeros));
        System.out.println("ocurrencias del 3: " + NoRecursivos.count(numeros, numeros.length, 3));
        System.out.println("ocurrencias del 1: " + NoRecursivos.count(numeros, numeros.length, 1));

        Character[] letras = {'A','B','C','B','A','B','D'};
        System.out.println("\narreglo letras: " + Arrays.toString(letras));
        System.out.println("ocurrencias de 'C': " + NoRecursivos.count(letras, letras.length, 'C'));
        System.out.println("ocurrencias de 'E': " + NoRecursivos.count(letras, letras.length, 'E'));

        System.out.println("\npruebas reverse");
        Integer[] arr1 = {1,2,3,4,5};
        System.out.println("original: " + Arrays.toString(arr1));
        NoRecursivos.reverse(arr1,0,arr1.length-1);
        System.out.println("invertido: " + Arrays.toString(arr1));

        Character[] arr2 = {'A','B','C','D'};
        System.out.println("\noriginal: " + Arrays.toString(arr2));
        NoRecursivos.reverse(arr2,0,arr2.length-1);
        System.out.println("invertido: " + Arrays.toString(arr2));
    }
    
}

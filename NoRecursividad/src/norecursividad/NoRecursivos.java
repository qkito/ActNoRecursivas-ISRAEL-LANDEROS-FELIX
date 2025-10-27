
package norecursividad;

public class NoRecursivos {
    public static long fibonacci(int n) {
    // calcula el numero fibonacci segun la posicion n
    // ejemplo: fibonacci(5) devuelve 5
    // usa un ciclo for en lugar de recursion
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long fibAnterior = 0;
        long fibActual = 1;
        long fibSiguiente = 0;

        // se van sumando los dos anteriores para obtener el siguiente numero
        for (int i = 2; i <= n; i++) {
            fibSiguiente = fibAnterior + fibActual;
            fibAnterior = fibActual;
            fibActual = fibSiguiente;
        }

        return fibActual;
    }

    // calcula el maximo comun divisor (mcd) entre dos numeros enteros
    // usa el metodo de euclides con un ciclo while
    public static int mcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }

    // cuenta cuantas veces aparece un valor dentro de un arreglo
    // recibe el arreglo, su tamaño y el objeto a buscar
    // si el objeto o es nulo tambien lo considera en el conteo
    public static int count(Object datos[], int n, Object o) {
        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (o == null) {
                if (datos[i] == null) {
                    contador++;
                }
            } 
            else if (o.equals(datos[i])) {
                contador++;
            }
        }
        return contador;
    }

    // invierte los elementos de un arreglo desde la posicion inicio hasta fin
    // el primer valor pasa al final y el ultimo al inicio, repitiendo el proceso
    public static void reverse(Object datos[], int inicio, int fin) {
        while (inicio < fin) {
            Object temp = datos[inicio];
            datos[inicio] = datos[fin];
            datos[fin] = temp;
            
            inicio++;
            fin--;
        }
    }
}

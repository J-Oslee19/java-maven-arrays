package com.mi_primer_proyecto_maven.proyecto_tarea_uno;

//Importamos la clase Arrays para poder usar sus métodos
import java.util.Arrays;

//Importamos ArrayList para explicar la diferencia con arreglos
import java.util.ArrayList;

public class investigacion_arreglos {

	public static void main(String[] args) {

        //=====================================================
        // 4.1 DECLARACION DE ARREGLOS
        //=====================================================

        System.out.println("===== 4.1 DECLARACION DE ARREGLOS =====");

        /*
         * Un arreglo (array) es una estructura que permite almacenar
         * varios valores del mismo tipo en una sola variable.
         * Los arreglos en Java tienen tamaño fijo después de crearse.
         */

        // -------- Forma 1: Declarar con tamaño definido --------

        // Aquí creamos un arreglo de tipo int con 3 posiciones.
        // Java reserva espacio en memoria para 3 números enteros.
        int[] numeros = new int[3];

        // Asignamos valores manualmente a cada posición.
        // Recordar que los índices comienzan desde 0.
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        // Usamos Arrays.toString para imprimir el arreglo completo.
        System.out.println("Arreglo con tamaño definido:");
        System.out.println(Arrays.toString(numeros));


        // -------- Forma 2: Declarar e inicializar directamente --------

        /*
         * En esta forma declaramos el arreglo y asignamos
         * los valores en la misma línea.
         * Java detecta automáticamente el tamaño del arreglo.
         */
        int[] valores = {5, 2, 8, 1};

        System.out.println("Arreglo inicializado directamente:");
        System.out.println(Arrays.toString(valores));


        // =====================================================
        // 4.2 METODOS DE LA CLASE Arrays
        // =====================================================

        System.out.println("\n===== 4.2 METODOS DE Arrays =====");

        /*
         * La clase Arrays pertenece al paquete java.util
         * y contiene métodos útiles para trabajar con arreglos.
         */

        // -------- Arrays.sort() --------
        // Ordena los elementos del arreglo de menor a mayor.
        Arrays.sort(valores);

        System.out.println("Arreglo ordenado con Arrays.sort():");
        System.out.println(Arrays.toString(valores));

        // -------- Arrays.binarySearch() --------
        /*
         * Busca un elemento dentro del arreglo.
         * IMPORTANTE: el arreglo debe estar previamente ordenado.
         * Devuelve la posición donde se encuentra el elemento.
         */
        int posicion = Arrays.binarySearch(valores, 8);
        System.out.println("Posicion del numero 8: " + posicion);

        // -------- Arrays.copyOf() --------
        /*
         * Crea una copia del arreglo original.
         * En este caso ampliamos el tamaño a 6 posiciones.
         * Las nuevas posiciones se rellenan con 0.
         */
        int[] copia = Arrays.copyOf(valores, 6);

        System.out.println("Copia del arreglo con nuevo tamaño:");
        System.out.println(Arrays.toString(copia));

        // -------- Arrays.fill() --------
        /*
         * Llena todas las posiciones del arreglo
         * con el mismo valor.
         */
        int[] relleno = new int[4];
        Arrays.fill(relleno, 7);

        System.out.println("Arreglo rellenado con el numero 7:");
        System.out.println(Arrays.toString(relleno));

        // -------- Arrays.equals() --------
        /*
         * Compara dos arreglos.
         * Devuelve true si ambos tienen los mismos valores
         * en el mismo orden.
         */
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        boolean sonIguales = Arrays.equals(a, b);

        System.out.println("Los arreglos a y b son iguales? " + sonIguales);


        // =====================================================
        // 4.3 FORMAS DE RECORRER UN ARREGLO
        // =====================================================

        System.out.println("\n===== 4.3 RECORRER ARREGLOS =====");

        int[] recorrido = {100, 200, 300};

        // -------- 1. For tradicional --------
        /*
         * Se utiliza cuando necesitamos el índice.
         * La variable i representa la posición.
         */
        System.out.println("Recorrido con for tradicional:");
        for (int i = 0; i < recorrido.length; i++) {
            System.out.println("Posicion " + i + ": " + recorrido[i]);
        }

        // -------- 2. For-each --------
        /*
         * Forma más sencilla de recorrer un arreglo.
         * No necesitamos usar índices.
         */
        System.out.println("Recorrido con for-each:");
        for (int numero : recorrido) {
            System.out.println(numero);
        }

        // -------- 3. Streams --------
        /*
         * Forma moderna introducida en Java 8.
         * Permite recorrer el arreglo usando programación funcional.
         */
        System.out.println("Recorrido usando Streams:");
        Arrays.stream(recorrido).forEach(n -> System.out.println(n));


        // =====================================================
        // 4.4 DIFERENCIA ENTRE ARREGLO Y ARRAYLIST
        // =====================================================

        System.out.println("\n===== 4.4 ARREGLO VS ARRAYLIST =====");

        /*
         * 1) Arreglos:
         * - Tienen tamaño fijo.
         * - Permiten tipos primitivos como int.
         * - Son más rápidos en rendimiento.
         */

        int[] arregloFijo = new int[2];
        arregloFijo[0] = 10;
        arregloFijo[1] = 20;

        System.out.println("Arreglo fijo (no cambia tamaño):");
        System.out.println(Arrays.toString(arregloFijo));


        /*
         * 2) ArrayList:
         * - Tiene tamaño dinámico (puede crecer o reducirse).
         * - No permite tipos primitivos directamente,
         *   se usan clases envolventes como Integer.
         * - Tiene métodos como add(), remove(), size().
         */

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30); // Se agrega un nuevo elemento

        System.out.println("ArrayList dinamico:");
        System.out.println(lista);

        // Eliminamos el elemento en la posición 0
        lista.remove(0);

        System.out.println("ArrayList despues de eliminar un elemento:");
        System.out.println(lista);

        /*
         * Conclusion:
         * Usamos arreglos cuando el tamaño es fijo.
         * Usamos ArrayList cuando necesitamos flexibilidad.
         */
    }
}

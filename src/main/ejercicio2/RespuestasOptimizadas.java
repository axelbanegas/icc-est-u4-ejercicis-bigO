package main.ejercicio2;

import java.util.HashSet;

public class RespuestasOptimizadas {
    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(N)";

    public static boolean tieneDuplicadosOpt(int[] arr) {
        HashSet<Integer> elementos = new HashSet<>();
        for (int num : arr) {
            if (!elementos.add(num)) 
                return true;
        }
        return false;
    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = "O(N)";

    public static int contarMayoresOpt(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num > x) {
                count++;
            }
        }
        return count; 
    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = "O(N)";

    public static int encontrarMaximoOpt(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max; 
    }
}
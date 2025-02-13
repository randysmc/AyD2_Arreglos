package org.example;

public class ConvertidorArray {

    public static Object[] convertidorArray(Object[] arr){
        return convertidorArrayRecursivo(arr, new Object[0]);
    }


    private static Object[] convertidorArrayRecursivo (Object[] arr, Object[] resultado){
        for(Object item: arr){
            if(item instanceof Object[]) {
                resultado = convertidorArrayRecursivo((Object[]) item, resultado);
            } else {
                resultado = agregarAlArray(resultado, item);
            }
        }
        return resultado;

        /*
        El grado de complejidad de este algoritmo recursivo es de O(n^2) dado que esta en un ciclo for
         */
    }

    private static Object[] agregarAlArray(Object[] arr, Object item){
        Object[] nuevoArreglo = new Object[arr.length+1];
        System.arraycopy(arr, 0, nuevoArreglo, 0, arr.length);
        nuevoArreglo[arr.length] = item;
        return nuevoArreglo;
    }
    /*
    Aquí el grado de complejidad del algoritmo es O(n)
     */
}


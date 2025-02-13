package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Object[] arr = {1, 2, new Object[]{"3", "4"}};

        Object[] nuevoArreglo = ConvertidorArray.convertidorArray(arr);
        System.out.println(Arrays.toString(nuevoArreglo));

    }
}
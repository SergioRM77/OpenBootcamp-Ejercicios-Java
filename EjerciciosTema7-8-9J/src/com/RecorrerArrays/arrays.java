package com.RecorrerArrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class arrays{
    public static void recorreArrayString(String ArrayStrings[]){
        for (int i = 0; i < ArrayStrings.length; i++){
            System.out.print(ArrayStrings[i]);
        }
        System.out.println();
    }
    public static void recorreArrayBiInt(int ArrayBiInt[][]){
        for (int  i = 0; i < ArrayBiInt.length; i++){

            for (int j = 0; j < ArrayBiInt[i].length; j++){
                System.out.println("posicion de x: " + i + " posicion de y: " + j + " valor: " + ArrayBiInt[i][j]);
            }
        }
    }

    public static void removeInVector(Vector vector, int delete){
        //si uso removeelementAt(indice) elimina el elemento en ese indice, pero los siguientes se mueven
        //una posicion menos, es decir que los elementos no guardan indefinidamente su índice, borrar el 2 hace que el 3 sea el nuevo 2
        vector.removeElement(delete);
    }

    public static void recorreArray(ArrayList lista){
        for (Object texto: lista) {
            System.out.print(texto);
        }
        System.out.println();
    }
    public static void recorreArray(LinkedList lista){
        for (Object texto: lista) {
            System.out.print(texto);
        }
        System.out.println();
    }

    public static ArrayList rellenoArrayList(ArrayList Array){
        for (int i = 0; i < 10; i++){
            if (i%2!=0){
                Array.add(i);
            }
        }
        return Array;
    }

    public static int dividir(int a, int b) {
        int result = 0;
        try{
            result = a/ b;
        } catch (ArithmeticException  e){
            System.out.println("Esto no puede hacerse " + e);
        }
        System.out.println("Demo de código");
        return result;
    }

}

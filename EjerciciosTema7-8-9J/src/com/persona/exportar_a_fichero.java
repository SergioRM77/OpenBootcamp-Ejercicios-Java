package com.persona;
import com.persona.persona;
import java.io.*;
import java.util.ArrayList;

public class exportar_a_fichero {
    public static void insertar_en_fichero(String nombreFichero, ArrayList<persona> persons){
        String valor ="";
        try {

            OutputStream fichero = new FileOutputStream(nombreFichero);
            valor = recorreList(persons);
            insertInto(fichero,valor);
            try{
                fichero.close();
            }catch (IOException e){
                System.out.println("no se puede cerrar fichero: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
        }

    }
    public static void copyFile(String nombreFichero, String copia){
        try{
            InputStream File = new FileInputStream(nombreFichero);
            byte[] datos = File.readAllBytes();
            PrintStream contenido = new PrintStream(copia);
            contenido.write(datos);
            contenido.close();

        }catch (IOException e){
            System.out.println("Error al imprimir los datos: " + e.getMessage());
        }

    }
    private static String recorreList(ArrayList<persona> persons){
        String contenido = "";
        for (persona person: persons) {
            contenido += person.toString() + "\n";

        }
        return contenido;
    }

    private static void insertInto(OutputStream fichero, String contenido){
        byte[] valores = contenido.getBytes();
        try{
            for (byte valor : valores) {
                fichero.write((char) valor);
            }
        }catch (IOException e){
                System.out.println("No es posible escribir en el fichero: " + e.getMessage());
        }

    }

}

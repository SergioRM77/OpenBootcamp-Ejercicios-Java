package com.ficheros;

import java.io.*;

public class trabajarFicheros {


    public static void copiarFichero(String fileIn, String fileOut){
        try{
            InputStream FileIn = new FileInputStream(fileIn);
            OutputStream FileOut = new FileOutputStream(fileOut);

            copiaTipoByte(FileIn, FileOut);
            try {
                FileIn.close();
                FileOut.close();

            }catch (IOException e){

                System.out.println("no se pudo cerrar: " +e.getMessage());
            }

        }catch (FileNotFoundException e){
            System.out.println("Uno de los ficheros no encontrado" + e.getMessage());
        }
    }

    public static void copiarFichero2(String fileIn, String fileOut){
        try{
            InputStream FileIn = new FileInputStream(fileIn);
            OutputStream FileOut = new FileOutputStream(fileOut);

            copiaDatoADato(FileIn, FileOut);
            try {
                FileIn.close();
                FileOut.close();

            }catch (IOException e){

                System.out.println("no se pudo cerrar: " +e.getMessage());
            }

        }catch (FileNotFoundException e){
            System.out.println("Uno de los ficheros no encontrado" + e.getMessage());
        }
    }
    public static void copiarFichero3(String fileIn, String fileOut){
        try{
            InputStream FileIn = new FileInputStream(fileIn);
            BufferedInputStream FileIN = new BufferedInputStream(FileIn, 5);
            OutputStream FileOut = new FileOutputStream(fileOut);


            copiaEnBuffer(FileIN, FileOut);
            try {
                FileIn.close();
                FileOut.close();

            }catch (IOException e){

                System.out.println("no se pudo cerrar: " +e.getMessage());
            }

        }catch (FileNotFoundException e){
            System.out.println("Uno de los ficheros no encontrado" + e.getMessage());
        }
    }

    private static void copiaTipoByte(InputStream entrada, OutputStream salida){
        try{
            byte[] datos = entrada.readAllBytes();

            for (byte dato : datos) {
                System.out.print((char)dato);
                salida.write((char)dato);

            }
        } catch (IOException e) {
            System.out.println("No es posible leer datos: " + e.getMessage());
        }
    }
    private  static void copiaDatoADato(InputStream entrada, OutputStream salida){
        try{
            int dato = entrada.read();
            while (dato != -1){
                System.out.print((char) dato);
                dato = entrada.read();
                salida.write((char)dato);
            }

        } catch (IOException e) {
            System.out.println("No es posible leer datos: " + e.getMessage());
        }

    }
    private static void copiaEnBuffer(InputStream entrada, OutputStream salida){
        try {
            int i;
            while((i=entrada.read()) != -1) {
                System.out.print((char)i);
                salida.write((char)i);

            }
        } catch (IOException e) {
            System.out.println("No es posible leer datos: " + e.getMessage());
        }
    }

}

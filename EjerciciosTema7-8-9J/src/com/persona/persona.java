package com.persona;

public class persona {
    private String nombre;
    private int edad;
    private boolean casado;

    public persona(){

    }
    public persona(String nombre, int edad, boolean casado){
        this.nombre = nombre;
        this.edad = edad;
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", casado=" + casado +
                '}';
    }
}

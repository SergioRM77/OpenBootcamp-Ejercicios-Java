package com.coche;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("método de guardado");
    }

    @Override
    public void findAll() {
        System.out.println("método de findAll");
    }

    @Override
    public void delete() {
        System.out.println("método de delete");
    }
}

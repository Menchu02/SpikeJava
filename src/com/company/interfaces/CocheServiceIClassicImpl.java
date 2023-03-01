package com.company.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.interfaces.CocheService;

//las clases que implementan interfaces, estan obligadas a proporcionar un cuerpo a esos métodos
public class CocheServiceIClassicImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando cohe clásico");

        return new CocheElectrico();
    }
}

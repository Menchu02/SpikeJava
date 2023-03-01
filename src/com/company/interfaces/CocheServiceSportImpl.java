package com.company.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche de carreras");
        return new CocheElectrico();
    }
}

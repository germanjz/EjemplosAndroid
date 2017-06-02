package mx.com.ejemplo.ejemplo4.service;

import java.util.ArrayList;
import java.util.List;

import mx.com.ejemplo.ejemplo4.model.Pais;

/**
 * Created by German on 26/05/2017.
 */

public class ServiceList {
    public List<Pais> obtenerPaises() {
        List<Pais> paises = new ArrayList<>();

        paises.add(new Pais("Argentina", "40000000"));
        paises.add(new Pais("Chile", "17000000"));
        paises.add(new Pais("Paraguay", "6500000"));
        paises.add(new Pais("Bolivia", "10000000"));
        paises.add(new Pais("Peru", "30000000"));
        paises.add(new Pais("Ecuador", "14000000"));
        paises.add(new Pais("Brasil", "183000000"));
        paises.add(new Pais("Colombia", "44000000"));
        paises.add(new Pais("Venezuela", "29000000"));
        paises.add(new Pais("Uruguay", "3500000"));

        return paises;
    }
}

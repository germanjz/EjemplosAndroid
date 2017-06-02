package mx.com.ejemplo.ejemplo3.service;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by German on 26/05/2017.
 */

public class OperacionesService {
    public List<String> obtenerOperaciones() {
        List<String> operaciones = new ArrayList<>();

        operaciones.add("Seleccione Una Opcion...");
        operaciones.add("Sumar");
        operaciones.add("Restar");
        operaciones.add("Multiplicar");
        operaciones.add("Dividir");

        return operaciones;
    }

    public String realizarOperacion(String opcion, float valor1, float valor2) {
        try {
            float resultado = 0;

            switch (opcion) {
                case "Sumar":
                    resultado = valor1 + valor2;
                    break;
                case "Restar":
                    resultado = valor1 - valor2;
                    break;
                case "Multiplicar":
                    resultado = valor1 * valor2;
                    break;
                case "Dividir":
                    resultado = valor1 / valor2;
                    break;
                default:
                    break;
            }
            return String.valueOf(resultado);

        } catch(Exception e) {
            Log.e("ERROR", e.getMessage());
            return e.getMessage();
        }
    }
}

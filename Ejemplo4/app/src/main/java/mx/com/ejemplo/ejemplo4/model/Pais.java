package mx.com.ejemplo.ejemplo4.model;

/**
 * Created by usuario on 26/05/2017.
 */

public class Pais {
    private String pais;
    private String habitantes;

    public Pais() {
        super();
    }

    public Pais(String pais, String habitantes) {
        this.pais = pais;
        this.habitantes = habitantes;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(String habitantes) {
        this.habitantes = habitantes;
    }

}

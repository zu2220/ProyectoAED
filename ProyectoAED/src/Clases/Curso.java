
package Clases;

import ListasEnlazadas.ListaDocente;


public class Curso {
    private String nombreCurso;
    private ListaDocente docentesACargo;
    private int numHoras;

    public Curso() {
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public ListaDocente getDocentesACargo() {
        return docentesACargo;
    }

    public void setDocentesACargo(ListaDocente docentesACargo) {
        this.docentesACargo = docentesACargo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }
    
    
    
}

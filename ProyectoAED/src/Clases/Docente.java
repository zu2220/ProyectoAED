
package Clases;

import ListasEnlazadas.ListaSeccion;


public class Docente extends Usuario {
    private Curso cursoQueImparte;
    private ListaSeccion aulas;
    public Docente() {
    }

    public Docente(String tipoUsuario, String Nombre, String Apellido, String DNI, String Email, String Contrasena) {
        super(tipoUsuario, Nombre, Apellido, DNI, Email, Contrasena);
    }

    public Curso getCursoQueImparte() {
        return cursoQueImparte;
    }

    public void setCursoQueImparte(Curso cursoQueImparte) {
        this.cursoQueImparte = cursoQueImparte;
    }

    

    public ListaSeccion getAulas() {
        return aulas;
    }

    public void setAulas(ListaSeccion aulas) {
        this.aulas = aulas;
    }
    
    
    
}

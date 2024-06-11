
package Clases;

import ListasEnlazadas.ListaSeccion;
import ListasEnlazadas.ListaUsuario;

public class Estudiante extends Usuario {
    private String NumOrden;
    private ListaSeccion seccionesInscritas;
    private int Codigo;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public Estudiante() {
    }
    public Estudiante(String NumOrden) {
        this.NumOrden = NumOrden;
    }

    public Estudiante(String NumOrden, String tipoUsuario, String Nombre, String Apellido, String DNI, String Email, String Contrasena) {
        super(tipoUsuario, Nombre, Apellido, DNI, Email, Contrasena);
        this.NumOrden = NumOrden;
    }

    public Estudiante(String maria, int i, String maria90) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    public String getNumOrden() {
        return NumOrden;
    }

    public void setNumOrden(String NumOrden) {
        this.NumOrden = NumOrden;
    }

    public ListaSeccion getSeccionesInscritas() {
        return seccionesInscritas;
    }

    public void setSeccionesInscritas(ListaSeccion seccionesInscritas) {
        this.seccionesInscritas = seccionesInscritas;
    }

    public int getMatricula(int Matricula) {
       
      return Matricula;
    }

    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablaHash;

import Clases.Estudiante;
import ListasEnlazadas.ListaEstudiante;
import ListasEnlazadas.ListaUsuario;
import ListasEnlazadas.NodoEstudiante;
import static java.util.Objects.hash;

/**
 *
 * @author Hector
 */
public class TablaHashEstudiante {

     private ListaEstudiante[] tabla;
    private int tamaño;

    // Constructor con tamaño predeterminado
    public TablaHashEstudiante() {
        this(100); // tamaño predeterminado de 100
    }

    // Constructor con tamaño personalizado
    public TablaHashEstudiante(int tamaño) {
        this.tamaño = tamaño;
        this.tabla = new ListaEstudiante[tamaño];
        for (int i = 0; i < tamaño; i++) {
            tabla[i] = new ListaEstudiante();
        }
    }

    // Método para insertar un estudiante en la tabla hash
    public void insertarEstudiante(Estudiante estudiante) {
         Estudiante indice = calcularIndice(estudiante);
        tabla[indice].insertarAlFinal(estudiante);
    }

    // Método para buscar un estudiante en la tabla hash
    public Estudiante buscarEstudiante(String código) {
        int indice = calcularIndice(código);
        NodoEstudiante nodo = tabla[indice].getInicio();
        while (nodo!= null) {
            if (nodo.getDato().getCodigo()) {
                return nodo.getDato();
            }
            nodo = nodo.getSig();
        }
        return null; // no se encontró el estudiante
    }

    // Método para calcular el índice de la tabla hash
    private int calcularIndice(String clave) {
        int suma = 0;
        for (int i = 0; i < clave.length(); i++) {
            suma += clave.charAt(i);
        }
        return suma % tamaño;
    }

    // Método para calcular el índice de la tabla hash (sobrecarga para Estudiante)
    private int getcalcularIndice(int estudiante) {
       
         return 0;
       
    }

    private Estudiante calcularIndice(Estudiante estudiante) {
       return estudiante;
    }
    
}

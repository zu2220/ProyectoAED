/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arbol;

import Clases.Estudiante;
import ListasEnlazadas.NodoEstudiante;

/**
 *
 * @author Hector
 */
public class ArbolEstudiante {
    private NodoArbolEstudiante raiz;
    private int size;

    public ArbolEstudiante() {
        raiz = null;
        size = 0;
    }

    // Método para insertar un nodo en el árbol
    public void insertarNodo(Estudiante dato) {
        if (raiz == null) {
            raiz = new NodoArbolEstudiante(dato);
        } else {
            insertar(raiz, dato);
        }
        size++;
    }

    private void insertar(NodoArbolEstudiante nodo, Estudiante dato) {
        if (dato.compareTo(nodo.getDato()) < 0) {
            if (nodo.getIzquierda() == null) {
                nodo.setIzquierda(new NodoArbolEstudiante(dato));
            } else {
                insertar(nodo.getIzquierda(), dato);
            }
        } else if (dato.compareTo(nodo.getDato()) > 0) {
            if (nodo.getDerecha() == null) {
                nodo.setDerecha(new NodoArbolEstudiante(dato));
            } else {
                insertar(nodo.getDerecha(), dato);
            }
        }
    }

    // Método para recorrer el árbol en preorden
    public void recorrerPreorden() {
        recorrerPreorden(raiz);
    }

    private void recorrerPreorden(NodoArbolEstudiante nodo) {
        if (nodo!= null) {
            System.out.print(nodo.getDato() + " ");
            recorrerPreorden(nodo.getIzquierda());
            recorrerPreorden(nodo.getDerecha());
        }
    }

    // Método para recorrer el árbol en inorden
    public void recorrerInorden() {
        recorrerInorden(raiz);
    }

    private void recorrerInorden(NodoArbolEstudiante nodo) {
        if (nodo!= null) {
            recorrerInorden(nodo.getIzquierda());
            System.out.print(nodo.getDato() + " ");
            recorrerInorden(nodo.getDerecha());
        }
    }

    // Método para recorrer el árbol en postorden
    public void recorrerPostorden() {
        recorrerPostorden(raiz);
    }

    private void recorrerPostorden(NodoArbolEstudiante nodo) {
        if (nodo!= null) {
            recorrerPostorden(nodo.getIzquierda());
            recorrerPostorden(nodo.getDerecha());
            System.out.print(nodo.getDato() + " ");
        }
    }

    // Método para buscar un nodo en el árbol
    public NodoArbolEstudiante buscarNodo(Estudiante dato) {
        return buscarNodo(raiz, dato);
    }

    private NodoArbolEstudiante buscarNodo(NodoArbolEstudiante nodo, Estudiante dato) {
        if (nodo == null || nodo.getDato().equals(dato)) {
            return nodo;
        }
        if (dato.compareTo(nodo.getDato()) < 0) {
            return buscarNodo(nodo.getIzquierda(), dato);
        } else {
            return buscarNodo(nodo.getDerecha(), dato);
        }
    }

    // Método para eliminar un nodo del árbol
    public void eliminarNodo(Estudiante dato) {
        raiz = eliminarNodo(raiz, dato);
        size--;
    }

    public NodoEstudiante eliminarNodo(NodoEstudiante nodo, Estudiante dato) {
        if (nodo == null) {
            return null;
        }
        if (dato.compareTo(nodo.getDato()) < 0) {
            nodo.setIzquierda(eliminarNodo(nodo.getIzquierda(), dato));
        } else if (dato.compareTo(nodo.getDato()) > 0) {
            nodo.setDerecha(eliminarNodo(nodo.getDerecha(), dato));
        } else {
            if (nodo.getIzquierda() == null && nodo.getDerecha() == null) {
                return null;
            } else if (nodo.getIzquierda() == null) {
                return nodo.getDerecha();
            } else if (nodo.getDerecha() == null) {
                return nodo.getIzquierda();
            } else {
                NodoEstudiante minimo = encontrarMinimo(nodo.getDerecha());
                nodo.setDato(minimo.getDato());
                nodo.setDerecha(eliminarNodo(nodo.getDerecha(), minimo.getDato()));
            }
        }
        return nodo;
}
}

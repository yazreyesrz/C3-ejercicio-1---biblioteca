package poo.c3.ejercicio1;

import java.util.ArrayList;

public interface Prestable {
     boolean AgregarListaBliblioteca();
     boolean Prestar();
     boolean Devolver();
     boolean Prestado();
     ArrayList<Biblioteca> imprimirLBliblioteca();
}

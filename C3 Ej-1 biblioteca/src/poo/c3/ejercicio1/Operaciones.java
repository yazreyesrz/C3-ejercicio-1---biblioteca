package poo.c3.ejercicio1;

import java.util.ArrayList;
import java.util.Random;

public class Operaciones extends Biblioteca {

    ArrayList<Biblioteca> libros = new ArrayList<>();

    public Operaciones() {
        super();
    }

    //Constructor para libros
    public Operaciones(int codigo, String titulo, int año) {
        super(codigo, titulo, año);
    }

    public boolean Agregar() {
        System.out.println("Agregue el que desee ");
        Random r = new Random();
        libros.add(new Revistas(r.nextInt(), "Caperusita roja", 1800, 12));
        libros.add(new Revistas(r.nextInt(), "Cocina", 2000, 15));
        libros.add(new Revistas(r.nextInt(), "Como entrenar a tu dragon", 2010, 19));
        libros.add(new Revistas(r.nextInt(), "Barbie en el castillo del lobo", 2010, 20));
        libros.add(new Revistas(r.nextInt(), "Matematicas para ingenieria 2", 2007, 14));

        libros.add(new Libros(r.nextInt(), "Desde mi cielo", 2009));
        libros.add(new Libros(r.nextInt(), "Estrellas benditas", 2017));
        libros.add(new Libros(r.nextInt(), "Programacion en Java", 2012));
        libros.add(new Libros(r.nextInt(), "El hobbit", 2007));
        libros.add(new Libros(r.nextInt(), "Star wars", 1980));
        return true;
    }

    public boolean Prestar(int Codigo) {
        for (byte i = 0; i < libros.size(); i++) {
            if (Codigo == libros.get(i).getCodigo()) {
                if (!libros.get(i).isPrestado()) {
                    libros.get(i).setPrestado(true);
                    System.out.println("\nLibro prestado exitosamenete " + libros.get(i));
                } else {
                    System.out.println("\nLibro no puede ser prestado");
                }
            }

        }
        return true;
    }

    public boolean Devolver(int Codigo) {
        for (int i = 0; i < libros.size(); i++) {
            //Si el codigo del parametro es el mismo que el codigo de mi elemento
            if (Codigo == libros.get(i).getCodigo()) {
                //Si el elemento libro contiene el valor de true en isPrestado
                if (libros.get(i).isPrestado()) {
                    //Cambia el valor de prestado a false en mi elemento
                    libros.get(i).setPrestado(false);
                    System.out.println("Libro devuelto " + libros.get(i));
                } else {
                    System.out.println("No se pudo devolver el libro, intentelo de nuevo" + libros.get(i));
                }
            }

        }
        return true;
    }

    public ArrayList<Biblioteca> imprimir() {
        return libros;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

}

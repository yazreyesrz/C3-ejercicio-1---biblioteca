
package poo.c3.ejercicio1;


public class Libros extends Operaciones  {


    public Libros(int Codigo, String Titulo, int AñoPublicasion) {
        super( Codigo,  Titulo, AñoPublicasion);


    }

    @Override
    public String toString() {
        return super.toString() + " Libro \n";
    }
}

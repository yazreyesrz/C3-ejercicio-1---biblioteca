package poo.c3.ejercicio1;

public class Revistas extends Biblioteca {

    private int NumeroId;

    public Revistas(int Codigo, String Titulo, int Año, int NumeroId) {
        super( Codigo, Titulo, Año);
        this.NumeroId = NumeroId;
    }

    public int getNumeroId() {
        return NumeroId;
    }

    public void setNumeroId(int numeroId) {
        NumeroId = numeroId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "NumeroId = " + NumeroId +
                 " Revista: \n";
    }
}

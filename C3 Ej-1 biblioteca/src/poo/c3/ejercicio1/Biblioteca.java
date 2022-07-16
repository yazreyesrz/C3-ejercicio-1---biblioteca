package poo.c3.ejercicio1;

public class Biblioteca {
    private int Codigo,Año;
    private String Titulo;
    private boolean prestado;
    public Biblioteca()
    {

    }
    public Biblioteca(int codigo, String titulo, int año) {
        Codigo = codigo;
        Titulo = titulo;
        Año = año;
    }

    public Biblioteca(int Codigo, String Titulo, int Año, boolean prestado) {
        this.Codigo = Codigo;
        this.Titulo = Titulo;
        this.Año = Año;
        this.prestado= prestado;
        
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getAñoPublicasion() {
        return Año;
    }

    public void setAñoPublicasion(int añoPublicasion) {
        Año = añoPublicasion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Biblioteca{");
        sb.append("Codigo=").append(Codigo);
        sb.append(", Titulo=").append(Titulo);
        sb.append(", A\u00f1oPublicasion=").append(Año);
        sb.append(", prestado=").append(prestado);
        sb.append('}');
        return sb.toString();
    }

    
}

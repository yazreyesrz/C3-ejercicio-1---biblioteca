package poo.c3.ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Operaciones operaciones = new Operaciones();
        operaciones.Agregar();
        int op = 0;
        
        while(op != 4)
        {
            Scanner datos = new Scanner(System.in);
            Random r = new Random();
            System.out.println("/////BIBLIOTECA/////");
            System.out.println("1.-Prestar un Libro ");
            System.out.println("2.-Devolver un libro ");
            System.out.println("3.- Ver estanteria");
            System.out.println("4.- Salir");
             op = datos.nextInt();
            switch (op) {
                case 1:
                    operaciones.Prestar(r.nextInt());
                    operaciones.Prestar(r.nextInt());
                    System.out.println(operaciones.imprimir());

                    break;
                case 2:
                    operaciones.Devolver(r.nextInt());
                    operaciones.Devolver(r.nextInt());
                    System.out.println(operaciones.imprimir());

                    break;
                case 3:
                    System.out.println(operaciones.imprimir());

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("La opcion introducida no se reconocde, por favor intentelo de nuevo");

            }
        }
    }
}

package test;

import dominio.AnimalCarnivoro;
import dominio.AnimalHervivoro;
import dominio.Planta;

public class Test_SerVivo {

    public static void main(String[] args) {

        AnimalCarnivoro hiena = new AnimalCarnivoro();
        AnimalHervivoro jirafa = new AnimalHervivoro();
        Planta magarzas = new Planta();

        hiena.alimentarse();
        jirafa.alimentarse();
        magarzas.alimentarse();
    }
}

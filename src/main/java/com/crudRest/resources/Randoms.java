package com.crudRest.resources;

import java.util.Random;

/**
 *
 * @author Miguel Castro
 */
public class Randoms {

    public static String nomesAleatorios() {

        String[] nomes = {"Oliver", "Jack", "Harry", "Jacob", "Charlie", "Thomas",
            "George", "Oscar", "James", "William", "Jake", "Connor", "Callum"};

        Random r = new Random();
        int index = r.nextInt(nomes.length);

        return nomes[index];
    }

    public static int idadesAleatorios() {

        Random r = new Random();

        return r.nextInt(100);
    }

    public static String sexosAleatorios() {

        String[] sexos = {"Masculino", "Feminino"};

        Random r = new Random();
        int index = r.nextInt(sexos.length);

        return sexos[index];
    }
}

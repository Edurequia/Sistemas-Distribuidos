package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PopulaListasThread implements Runnable {
    private List<List<Integer>> listasDeNumeros;
    private Integer qtdListas;
    private Integer qtdNumeros;

    public PopulaListasThread(List<List<Integer>> listasDeNumeros, Integer qtdListas, Integer qtdNumeros) {
        this.listasDeNumeros = listasDeNumeros;
        this.qtdListas = qtdListas;
        this.qtdNumeros = qtdNumeros;
    }

    @Override
    public void run() {
        for (int i = 0; i < qtdListas; i++) {
            listasDeNumeros.add(new ArrayList<Integer>());
        }

        Random random = new Random();

        for (int i = 0; i < qtdNumeros; i++) {
            int nAleatorio = 1000 + random.nextInt(99000);

            int indiceLista = i % qtdListas;

            listasDeNumeros.get(indiceLista).add(nAleatorio);
        }

        for (int i = 0; i < listasDeNumeros.size(); i++) {
            System.out.println("Lista " + (i + 1) + ": " + listasDeNumeros.get(i));
        }
    }
}

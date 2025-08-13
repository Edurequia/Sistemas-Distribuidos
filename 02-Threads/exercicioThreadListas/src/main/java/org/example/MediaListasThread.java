package org.example;

import java.util.List;

public class MediaListasThread implements Runnable {

    private List<List<Integer>> listasDeNumeros;

    public MediaListasThread(List<List<Integer>> listasDeNumeros) {
        this.listasDeNumeros = listasDeNumeros;
    }

    @Override
    public void run () {
        for (int i = 0; i < listasDeNumeros.size(); i++) {
            double media = listasDeNumeros.get(i).stream().mapToDouble(Integer::doubleValue).average().getAsDouble();

            System.out.println("Média Lista " + (i + 1) + ": " + media);
        }
    }
}

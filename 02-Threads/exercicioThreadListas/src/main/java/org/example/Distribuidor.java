package org.example;

import java.util.ArrayList;
import java.util.List;

public class Distribuidor {

    public static void main(String[] args) throws InterruptedException {
        List<List<Integer>> listasDeNumeros = new ArrayList<>();
        Integer qtdListas = 5;
        Integer qtdNumeros = 100;

        Thread populaListasThread = new Thread(new PopulaListasThread(listasDeNumeros, qtdListas, qtdNumeros));

        populaListasThread.start();
        populaListasThread.join();

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");

        Thread mediaListasThread = new Thread(new MediaListasThread(listasDeNumeros));
        mediaListasThread.start();
    }
}

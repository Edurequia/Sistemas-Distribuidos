package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Classe auxiliar, apenas para clareza de código
class Range {
    private final int inicio;
    private final int fim;

    public Range(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }
}

class ListaCompartilhada {
    private final List<Integer> numeros = new ArrayList<>(); //observem a visibilidade final

    //método set da variavel numeros que é private final
    public synchronized void adicionarNumero(int umNumero) {
        numeros.add(umNumero);
        System.out.println(Thread.currentThread().getName() + " adicionou: " + umNumero);
    }

    //metodo get da variavel numeros que é private final
    public synchronized List<Integer> retornarNumeros() { //metodo get de acesso tipo leitura da lista numeros
        return new ArrayList<>(numeros);
    }
}

class ThreadDeTrabalho extends Thread {
    private final ListaCompartilhada listaCompartilhada;
    private final Range range;
    private final int id;

    public ThreadDeTrabalho(ListaCompartilhada lista, Range range, int id) {
        this.listaCompartilhada = lista;
        this.range = range;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = range.getInicio(); i <= range.getFim(); i++) {
            if (id == 1 && i % 2 == 0) {
                listaCompartilhada.adicionarNumero(i);
            } else if (id == 2 && i % 2 != 0){
                listaCompartilhada.adicionarNumero(i);
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {}
        }
    }
}

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        ListaCompartilhada listaCompartilhada = new ListaCompartilhada();

        Random random = new Random();

        //ha duas threads que populam números inteiros na mesma thread
        Thread t1 = new ThreadDeTrabalho(listaCompartilhada, new Range(100, 200), 1);
        Thread t2 = new ThreadDeTrabalho(listaCompartilhada, new Range(1, 99), 2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Lista final: " + listaCompartilhada.retornarNumeros());
    }
}

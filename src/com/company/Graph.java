package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
    protected static Scanner leer = new Scanner(System.in);
    protected ArrayList<Nodo> listaNodos;
    protected ArrayList<Arista> listaAristas;

    public void insertarNodo(String etiqueta) {
            if (listaNodos == null) listaNodos = new ArrayList<>();
            listaNodos.add(new Nodo(etiqueta, listaNodos.size()));
            System.out.println(">>> Se añadio (" + listaNodos.get(listaNodos.size()-1).getEtiqueta() + ") exitosamente <<<");
            mostrarNodos();
    }

    public void mostrarNodos(){
        System.out.println("\t\t Nodos en el grafo");
        for (int i = 0; i <listaNodos.size() ; i++) {
            System.out.print(" (" + listaNodos.get(i).getEtiqueta() + ") ");
        }
        System.out.println();
    }
//Aqui termina la insercion de nodos
    public boolean buscarNodo(String nodoPerdido) {
        boolean existe = false;
        if (listaNodos != null) {
            for (int i = 0; i < listaNodos.size(); i++) {
                if (existe!=true) {
                    if (listaNodos.get(i).getEtiqueta().equalsIgnoreCase(nodoPerdido)) {
                        existe = true;
                    }
                }
            }
        }
        return existe;
    }
    public void eliminarNodo(){
    }

    public void insertarArista(){
        System.out.println("Defina el nodo origen");
            mostrarNodos();
            Nodo origen = listaNodos.get(leer.nextInt());
        System.out.println("Defina el nodo destino");
            mostrarNodos();
            Nodo destino = listaNodos.get(leer.nextInt());
        System.out.println("Defina el peso de la arista");
            int peso = leer.nextInt();
        listaAristas.add(new Arista(origen,destino,peso));
        System.out.println(">>> Arista agregada <<<");

    }
}
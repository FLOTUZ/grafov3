package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
    protected static Scanner leer = new Scanner(System.in);
    protected ArrayList<Nodo> listaNodos;
    protected ArrayList<Arista> listaAristas = new ArrayList<>();

    public void insertarNodo(String etiqueta) {
            if (listaNodos == null) listaNodos = new ArrayList<>();
            listaNodos.add(new Nodo(etiqueta, listaNodos.size()));
            System.out.println(">>> Se añadio (" + listaNodos.get(listaNodos.size()-1).getEtiqueta() + ") exitosamente <<<");
            mostrarNodos();
    }

    public void mostrarNodos(){
        System.out.println("\t\t Nodos en el grafo");
        for (int i = 0; i <listaNodos.size() ; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (int i = 0; i <listaNodos.size() ; i++) {
            System.out.print("(" + listaNodos.get(i).getEtiqueta() + ")");
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
//Se insertan las aristas para su posterior recorrido
    public void insertarArista(){

    }

    public void recorrerGrafo(Nodo inicial){
        int j;

        for (int i = 0; i < listaAristas.size(); i++) {

            if (listaAristas.get(i).getOrigen().equals(inicial)){
            //Si llega aqui, significa que el nodo inicial si tiene aristas
                if (!listaAristas.get(i).isVisitada()) {
                    System.out.println(listaAristas.get(i));
                    listaAristas.get(i).setVisitada(true);

                }
            }
        }
        for (j = 0; j < listaAristas.size(); j++) {
            try {
                if (!visitadas()) {
                    recorrerGrafo(listaAristas.get(j).getDestino());
                } else {
                    break;
                }
            }catch (Exception e){
                System.out.println("Se recorrio el grafo");
            }
        }

        //Obtener la posicion de lista de arista

        //Obtener el nodo destino de la arista
        //Buscar el nodo destino en la lista de aristas

        //Si existe, Obtener la posicion de lista de arista
        //Obtener el nodo destino de la arista

    }

    private boolean visitadas() {
        boolean visitadas = true;
        for (int i = 0; i < listaAristas.size(); i++) {
            if (!listaAristas.get(i).isVisitada()){
                visitadas = false;
            }
        }
        return visitadas;
    }

    public void visiadasFalse(){
        for (int i = 0; i < listaAristas.size(); i++) {
            listaAristas.get(i).setVisitada(false);
        }
    }
}
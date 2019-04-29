package com.company;

import java.util.ArrayList;

public class GrafoN extends GrafoD {
    private ArrayList<Arista> aux = new ArrayList<>();

    GrafoN() {
    }

    @Override
    public void eliminarNodo() {
        System.out.println("Que nodo deseas eliminar?");
    }

    /*public void insertarArista() {
        super.insertarArista();
        //Desde aqui se agregan
        for (int i = 0; i <listaAristas.size() ; i++) {
            Nodo origen = listaAristas.get(i).getOrigen();
            Nodo destino = listaAristas.get(i).getDestino();
            int peso = listaAristas.get(i).getPeso();

            aux.add(new Arista(destino,origen,peso));
        }
        int tamListAris = listaAristas.size();
        for (int i = 0; i < tamListAris; i++) {
            listaAristas.add(aux.get(i));
        }
    }*/
}

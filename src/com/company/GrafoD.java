package com.company;

public class GrafoD extends Graph{
    GrafoD(){
    }
    public void eliminarNodo() {
        System.out.println("Introduzca el numero de nodo a eliminar");
        for (int i = 0; i < listaNodos.size(); i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (int i = 0; i < listaNodos.size(); i++) {
            System.out.print("(" +listaNodos.get(i).getEtiqueta() + ")");
        }
        Nodo origen = listaNodos.get(leer.nextInt());
        for (int i = 0; i <listaAristas.size() ; i++) {
            //Se busca se el nodo seleccionado tiene aristas
            if (listaAristas.get(i).getOrigen().getEtiqueta().equals(origen)){
                listaAristas.remove(listaAristas.get(i));
            }
        }
        listaNodos.remove(origen);
    }

    public void insertarArista(Nodo origen, Nodo destino, int peso) {

    }
}

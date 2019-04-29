package com.company;

public class GrafoD extends Graph{
    GrafoD(){
    }
    public void eliminarNodo() {
        System.out.println("Seleccione el numero del nodo");
        mostrarNodos();
        Nodo origen = listaNodos.get(leer.nextInt());
        for (int i = 0; i <listaAristas.size() ; i++) {
            //Se busca se el nodo seleccionado tiene aristas
            if (listaAristas.get(i).getOrigen().getEtiqueta().equals(origen)){
                listaAristas.remove(listaAristas.get(i));
            }
        }
        listaNodos.remove(origen);
    }

    public void insertarArista() {
        System.out.println("Defina el nodo origen");
        mostrarNodos();
        Nodo origen = listaNodos.get(leer.nextInt());
        System.out.println("Defina el nodo destino");
        mostrarNodos();
        Nodo destino = listaNodos.get(leer.nextInt());
        System.out.println("Defina el peso de la arista");
        int peso = leer.nextInt();

        listaAristas.add(new Arista(origen, destino, peso));
        System.out.println(">>> Arista agregada <<<");
    }
}

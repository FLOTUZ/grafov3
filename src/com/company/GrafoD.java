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

    public void recorrerGrafo() {
        System.out.println("Seleccione el nodo inicial en el recorrido");
            mostrarNodos();
            Nodo inicio = listaNodos.get(leer.nextInt());
            //Se busca el nodo con la misma etiqueta del nodo Inicio
        for (int i = 0; i <listaAristas.size() ; i++) {
            //Se comparan la etiqueta del nodo inicio con las etiquetas del nodo origen
            if (listaAristas.get(i).getOrigen().getEtiqueta().equalsIgnoreCase(inicio.getEtiqueta())){
                //Se inicia el recorrido desde la primer coincidencia
                inicioRecorrido(i);
                break;
            }
        }

    }

    private void inicioRecorrido(int i) {
        /*Se empieza desde la Arista con el nodo origen seleccionado anteriormente
         *Se asigna el valor "Visitado" a cada arista recorrida
         */
        listaAristas.get(i).setVisitada(true);
        //Se imprime en formato (Nodo)--numero-->(Nodo)
        System.out.print("("+listaAristas.get(i).getOrigen().getEtiqueta());
        System.out.print(")--"+listaAristas.get(i).getPeso()+"-->(");
        System.out.println(listaAristas.get(i).getDestino().getEtiqueta()+")");
        //Si "i" es menor que la listaAristas
        if (i<listaAristas.size())inicioRecorrido(i++);
        //Si "i" es igual a la listaAristas se comprueba si hay aristas sin recorrer
        if (i==listaAristas.size())inicioRecorrido(0);

    }
}

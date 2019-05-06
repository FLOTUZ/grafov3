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

    /*public void recorrerGrafo() {
        int inic = 0;
        System.out.println("Ingrese vertice origen ");
            mostrarNodos();
            Nodo inicio = listaNodos.get(leer.nextInt());
            //Se buca en el nodo origen en la lista de Aristas
        for (int i = 0; i < listaAristas.size(); i++) {
            if (listaAristas.get(i).getOrigen().equals(inicio)) {
                inic = i;
                break;
            }
        }
        impresion(inic,inicio);

    }

    private void impresion(int inic, Nodo inicio) {
        for (int i = 0; i <listaAristas.size() ; i++) {
            System.out.println(listaAristas.get(inic).getOrigen().getEtiqueta()+ "-->");
                Nodo destno = listaAristas.get(inic).getDestino();
            System.out.println(destno.getEtiqueta());

            if (destno != listaNodos.get(inic)) impresion(inic,destno);
        }
    }*/
}

package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static private Scanner leer = new Scanner(System.in);
    static private Graph g;
    static private File abcedario = new File("abecedario.txt");
    static private Scanner etiquetas;
    public static void main(String[] args) throws FileNotFoundException {
        //Se crea grafo dependiendo la opcion deseada
        System.out.println("El grafo es dirigido?S/n");
        if (leer.next().equalsIgnoreCase("s")) {
            g = new GrafoD();
        }else {
            g = new GrafoN();
        }
        //Etiquetas de los nodos almacenada en un archivo
        etiquetas = new Scanner(abcedario);
        menu();
    }

    private static void menu() throws FileNotFoundException {
        System.out.println("\t\t\tQue desea hacer?");
        System.out.println("1 Nuevo grafo | 2 Insertar nodo | 3 Definir aristas" +
                "| 4 Buscar nodo | 5 Eliminar nodo | 6 Contenido de grafo");
        switch (leer.nextInt()){
            case 1:
                System.out.println("El grafo es dirigido?S/n");
                if (leer.next().equalsIgnoreCase("s")) {
                    g = new GrafoD();
                }else {
                    g = new GrafoN();
                }
                menu();
                break;
            case 2:
                System.out.println("\tIngrese etiqueta del nodo > ");
                g.insertarNodo(etiquetas.next());
                menu();
                break;
            case 3:
                g.insertarArista();
                menu();
                break;
            case 4:
                System.out.println("Ingrese nombre contenido del nodo");
                System.out.println(g.buscarNodo(leer.next()));
                menu();
                break;
            case 5:
                g.eliminarNodo();
                menu();
                break;
            case 6:
                //Buscar el nodo origen ingresado por el usuario
                System.out.println("Ingrese nodo inicial");
                    g.mostrarNodos();
                Nodo inicial = g.listaNodos.get(leer.nextInt());
                g.recorrerGrafo(inicial);
                g.visiadasFalse();
                menu();
                break;
            default: break;
        }
    }
}

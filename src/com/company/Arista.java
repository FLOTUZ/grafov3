package com.company;

public class Arista {
    private Nodo origen;
    private Nodo destino;
    private int peso;
    private boolean visitada = false;

    public Arista(Nodo origen, Nodo destino, int peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    public Nodo getOrigen() {
        return origen;
    }

    public Nodo getDestino() {
        return destino;
    }

    public int getPeso() {
        return peso;
    }

    public boolean isVisitada() {
        return visitada;
    }

    public void setOrigen(Nodo origen) {
        this.origen = origen;
    }

    public void setDestino(Nodo destino) {
        this.destino = destino;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVisitada(boolean visitada) {
        this.visitada = visitada;
    }
}

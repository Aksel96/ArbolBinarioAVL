package org.example;

public class Nodo {
    Nodo linkRight; //Enlace al nodo hijo derecho
    Nodo linkLeft; //Enlace al nodo hijo izquierdo
    int value;

    public Nodo(int value) {
        this.linkLeft = null;
        this.linkRight = null;
        this.value = value;
    }

    public Nodo getLinkRight() {
        return linkRight;
    }

    public void setLinkRight(Nodo linkRight) {
        this.linkRight = linkRight;
    }

    public Nodo getLinkLeft() {
        return linkLeft;
    }

    public void setLinkLeft(Nodo linkLeft) {
        this.linkLeft = linkLeft;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void printValue(){
        System.out.println(this.getValue());
    }
}

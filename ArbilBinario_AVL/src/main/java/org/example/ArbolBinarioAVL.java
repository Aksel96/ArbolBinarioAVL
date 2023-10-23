package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinarioAVL {
    Nodo leftChild;
    Nodo rightChild;
    Nodo root;

    public ArbolBinarioAVL() {
        this.leftChild = null;
        this.rightChild = null;
        this.root = null;
    }
    public void insert(int value){
        if (this.root == null){
            this.root = new Nodo(value);
        }else {
            this.insert(this.root,value);
        }
        }
    private void insert(Nodo padre,int value){
        if (value > padre.getValue()){
            if (padre.getLinkRight() == null){
                padre.setLinkRight(new Nodo(value));
            }else {
                this.insert(padre.getLinkRight(),value);
            }
        }else {
            if (padre.getLinkLeft() == null){
                padre.setLinkLeft(new Nodo(value));
            }else {
                this.insert(padre.getLinkLeft(),value);
            }
        }
    }
    private void inorden(Nodo nodo){
        if (nodo != null){
            inorden(nodo.getLinkLeft());
            nodo.printValue();
            inorden(nodo.getLinkRight());
        }

    }
    public void inorden(){
        this.inorden(this.root);
    }
    private void preorden(Nodo nodo){
        if (nodo != null){
            nodo.printValue();
            preorden(nodo.getLinkLeft());
            preorden(nodo.getLinkRight());
        }
    }
    public void preorden(){
        this.preorden(this.root);
    }
    private void postorden(Nodo nodo){
        if (nodo != null){
            postorden(nodo.getLinkLeft());
            postorden(nodo.getLinkRight());
            nodo.printValue();
        }
    }
    public void postorden(){
        this.postorden(this.root);
    }
    public void imprimirPorNiveles() {
        if (root == null) {
            return;
        }

        Queue<Nodo> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Nodo nodo = queue.poll();
            nodo.printValue();

            if (nodo.getLinkLeft() != null) {
                queue.add(nodo.getLinkLeft());
            }

            if (nodo.getLinkRight() != null) {
                queue.add(nodo.getLinkRight());
            }
        }
    }
}


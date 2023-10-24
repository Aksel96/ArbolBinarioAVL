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
    private Nodo insert(Nodo node, int value) {
        if (node == null) {
            return new Nodo(value);
        }

        if (value < node.getValue()) {
            node.setLinkLeft(insert(node.getLinkLeft(), value));
        } else if (value > node.getValue()) {
            node.setLinkRight(insert(node.getLinkRight(), value));
        } else {
            return node;
        }

        node.updateHeight();

        int balance = node.getBalance();

        if (balance > 1 && value < node.getLinkLeft().getValue()) {
            return rotateRight(node);
        }

        if (balance < -1 && value > node.getLinkRight().getValue()) {
            return rotateLeft(node);
        }

        if (balance > 1 && value > node.getLinkLeft().getValue()) {
            node.setLinkLeft(rotateLeft(node.getLinkLeft()));
            return rotateRight(node);
        }

        if (balance < -1 && value < node.getLinkRight().getValue()) {
            node.setLinkRight(rotateRight(node.getLinkRight()));
            return rotateLeft(node);
        }

        return node;
    }

    private Nodo rotateLeft(Nodo y) {
        Nodo x = y.getLinkRight();
        Nodo T2 = x.getLinkLeft();

        x.setLinkLeft(y);
        y.setLinkRight(T2);

        y.updateHeight();
        x.updateHeight();

        return x;
    }

    private Nodo rotateRight(Nodo x) {
        Nodo y = x.getLinkLeft();
        Nodo T2 = y.getLinkRight();

        y.setLinkRight(x);
        x.setLinkLeft(T2);

        x.updateHeight();
        y.updateHeight();

        return y;
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


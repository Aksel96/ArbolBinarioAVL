package org.example;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioAVL  arbolAVL = new ArbolBinarioAVL();
        arbolAVL.insert(15);
        arbolAVL.insert(6);
        arbolAVL.insert(50);
        arbolAVL.insert(4);
        arbolAVL.insert(7);
        arbolAVL.insert(23);
        arbolAVL.insert(72);
        arbolAVL.insert(5);
        arbolAVL.insert(71);
        arbolAVL.insert(73);
        arbolAVL.insert(74);
        System.out.println("Recorriendo inorden");
        arbolAVL.inorden();
        System.out.println("Recorriendo Post orden");
        arbolAVL.postorden();
        System.out.println("Recorriendo pre orden");
        arbolAVL.preorden();
        System.out.println("Por niveles");
        arbolAVL.imprimirPorNiveles();
    }
}
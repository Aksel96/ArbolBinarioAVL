package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opcion;
        String opcionList;
        do{
            menu();
            Scanner scannerOpcionLista = new Scanner(System.in);
            opcionList = scannerOpcionLista.nextLine();
            switch (opcionList){
                case "1":
                    ArbolBinarioAVL arbolAVL = new ArbolBinarioAVL();
                    do{
                        menuNodo();
                        Scanner scannerMenuLista = new Scanner(System.in);
                        int opcionMenuList = scannerMenuLista.nextInt();
                        if (!(opcionMenuList == 5)){
                            arbolBinario(opcionMenuList,arbolAVL);
                        }else {
                            opcionList = "S";
                        }
                    }while (!opcionList.equals("S"));
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println(" QUIERES SALIR DEL PROGRAMA? ");
            System.out.println("\t SI = [s]\tNO = [n] : ");
            System.out.print("-> ");
            Scanner scanner = new Scanner(System.in);
            opcion = scanner.nextLine();
            opcion.toUpperCase();
        }while (!opcion.toUpperCase().equals("S"));

    }

    public static void menu(){
        System.out.println("\n########################################################");
        System.out.println("\tCREACION DE ARBOL BINARIO AVL");
        System.out.println("\tOPCIONES A ELEGIR");
        System.out.println("\t1) Crear Arbol Binario AVL");
        System.out.println("\t5) Salir");
        System.out.println("########################################################");
        System.out.print("-> ");
    }
    public static void menuNodo(){
        System.out.println("########################################################");
        System.out.println("\t1) Crear Nodo");
        System.out.println("\t2) Eliminar Nodo");
        System.out.println("\t3) Imprimir el arbol por niveles");
        System.out.println("\t4) Imprimir el arbol en orden ascendente (inorden)");
        System.out.println("\t5) Salir");
        System.out.println("########################################################");
        System.out.print("-> ");
    }
    public static void arbolBinario(int opcion,ArbolBinarioAVL arbolAVL){
        switch (opcion){
            case 1:
                System.out.print("Introduzca el valor del nuevo nodo: ");
                Scanner scanInsercion = new Scanner(System.in);
                int valorNodo = scanInsercion.nextInt();
                arbolAVL.insert(valorNodo);
                break;
            case 2:
                System.out.print("Introduzca el valor del nodo a eliminar: ");
                Scanner scanEliminar = new Scanner(System.in);
                int valorNodoEliminar = scanEliminar.nextInt();
                arbolAVL.eliminar(valorNodoEliminar);
                break;
            case 3:
                System.out.println("##########################");
                arbolAVL.imprimirPorNiveles();
                System.out.println("##########################");
                break;
            case 4:
                System.out.println("##########################");
                arbolAVL.inorden();
                System.out.println("##########################");
                break;
            case 5:
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}
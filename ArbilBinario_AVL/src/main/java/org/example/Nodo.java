package org.example;

public class Nodo {
    Nodo linkRight;
    Nodo linkLeft;
    int value;
    int height;

    public Nodo(int value) {
        this.linkLeft = null;
        this.linkRight = null;
        this.value = value;
        this.height = 1;
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
    public int getHeight(){
        return height;
    }
    public void updateHeight(){
        int leftHeight = (linkLeft != null) ? linkLeft.getHeight() : 0;
        int rightHeight = (linkRight != null) ? linkRight.getHeight() : 0;
        height = 1 + Math.max(leftHeight,rightHeight);
    }
    public int getBalance(){
        int leftHeight = (linkLeft != null) ? linkLeft.getHeight() : 0;
        int rightHeight = (linkRight != null) ? linkRight.getHeight() : 0;
        return leftHeight - rightHeight;
    }

}

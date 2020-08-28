package com.example.jwactivity;

public class jwData {

    private int number;
    private String name;
    private int imgO;
    private int imgA;
    private int imgX;

    public jwData(int number, String name, int imgO, int imgA, int imgX){
        this.number=number;
        this.name=name;
        this.imgO=imgO;
        this.imgA=imgA;
        this.imgX=imgX;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getImgO() {
        return imgO;
    }

    public int getImgA() {
        return imgA;
    }

    public int getImgX() {
        return imgX;
    }

}

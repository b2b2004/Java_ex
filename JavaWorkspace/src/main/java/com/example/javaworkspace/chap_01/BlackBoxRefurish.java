package com.example.javaworkspace.chap_01;

public class BlackBoxRefurish {
    public String modelName;
    String resolution; // 제어자 없으면 default임
    private int price;
    protected String color;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if(resolution == null || resolution.isEmpty()) {
            return "사용자에게 문의하세요";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price < 100000){
            this.price = 100000;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "BlackBoxRefurish{" +
                "modelName='" + modelName + '\'' +
                ", resolution='" + resolution + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

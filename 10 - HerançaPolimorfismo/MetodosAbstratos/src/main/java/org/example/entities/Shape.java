package org.example.entities;

public abstract class Shape {

    private Color color;

    public Shape(){
    }

    public Shape(Color color){
        this.color = color;
    }

    public Color getColorShape() {
        return color;
    }

    public void setColorShape(Color colorShape) {
        this.color = colorShape;
    }

    public abstract double area();
}

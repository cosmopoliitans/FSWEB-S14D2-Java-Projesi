package workintech.s14d2.model;

import workintech.s14d2.model.enums.PaintColor;

public class Ceiling {

    private int height;
    private PaintColor color;

    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void create(int height, PaintColor color){
        System.out.println("Height: " + height + " PaintColor: " + color);
    }
}

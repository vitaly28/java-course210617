package ru.job4j.condition;
//y(x) = a * x + b;

public class Point {
    private int x;
    private int y;

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    public boolean isrun(int a, int b) {
        boolean result;
        if (y == a * x + b){result = true;}
        else {result = false;}
        return result;
    }
}
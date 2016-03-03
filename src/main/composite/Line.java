package main.composite;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class Line implements Shape {

    private int a;
    private int b;

    public Line(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println("drawing line with a : " + a + " and b: " + b);
    }

    @Override
    public List<Shape> explode() {
        List<Shape> shapes = Arrays.asList(this);
        return shapes;
    }
}

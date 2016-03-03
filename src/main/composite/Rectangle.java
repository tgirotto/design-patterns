package main.composite;

import java.util.List;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class Rectangle implements Shape {

    private List<Shape> shapes;

    public Rectangle(List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void draw() {
        for(Shape s : shapes)
            s.draw();
    }

    @Override
    public List<Shape> explode() {
        return this.shapes;
    }
}

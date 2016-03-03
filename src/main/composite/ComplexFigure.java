package main.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class ComplexFigure implements Shape {

    private List<Shape> shapes;

    public ComplexFigure(List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public void draw() {
        for(Shape s : shapes)
            s.draw();
    }


    //This is going to return all the shapes in the tree;
    @Override
    public List<Shape> explode() {
        List<Shape> result = new ArrayList<Shape>();

        for(Shape s : shapes)
            result.addAll(s.explode());

        return result;
    }
}

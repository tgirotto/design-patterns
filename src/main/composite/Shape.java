package main.composite;

import java.util.List;

/**
 * Created by tgirotto on 3/3/2016.
 */
public interface Shape {

    void draw();
    List<Shape> explode();
}

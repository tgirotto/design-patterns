import main.composite.ComplexFigure;
import main.composite.Line;
import main.composite.Rectangle;
import main.composite.Shape;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class CompositeTest {

    @Test
    public void example() {
        Line lineA = new Line(1, 2);
        lineA.draw();

        Line lineB = new Line(3, 4);
        lineB.draw();

        List<Shape> shapes = Arrays.asList(lineA, lineB);
        Rectangle rectangle = new Rectangle(shapes);

//        rectangle.draw();

        List<Shape> shapes1 = Arrays.asList(lineA, lineB, rectangle);
        ComplexFigure figure = new ComplexFigure(shapes1);
//        figure.draw();
        List<Shape> explosion = figure.explode();
        System.out.println(explosion);
    }
}

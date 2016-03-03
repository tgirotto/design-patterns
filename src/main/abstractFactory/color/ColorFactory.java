package main.abstractFactory.color;

import main.abstractFactory.AbstractFactory;
import main.abstractFactory.shape.Shape;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("GREEN"))
            return new Green();
        else if(color.equalsIgnoreCase("RED"))
            return new Red();

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}

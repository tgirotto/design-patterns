package main.abstractFactory;

import main.abstractFactory.color.ColorFactory;
import main.abstractFactory.shape.ShapeFactory;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class AbstractFactoryProducer {
    public static AbstractFactory getFactory(String type) {
        if(type.equalsIgnoreCase("SHAPE"))
            return new ShapeFactory();
        else if(type.equalsIgnoreCase("COLOR"))
            return new ColorFactory();

        return null;
    }
}

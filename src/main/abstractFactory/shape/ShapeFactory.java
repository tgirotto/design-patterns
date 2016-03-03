package main.abstractFactory.shape;

import main.abstractFactory.AbstractFactory;
import main.abstractFactory.color.Color;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){

        if(shapeType == null)
            return null;

        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}

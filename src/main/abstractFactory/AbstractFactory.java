package main.abstractFactory;

import main.abstractFactory.color.Color;
import main.abstractFactory.shape.Shape;

/**
 * Created by tgirotto on 3/3/2016.
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
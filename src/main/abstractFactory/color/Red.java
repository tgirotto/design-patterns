package main.abstractFactory.color;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling red");
    }
}

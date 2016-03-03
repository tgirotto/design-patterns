package main.decorator;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class SimpleWindow implements Window {
    @Override
    public void render() {
        System.out.println("Simple window");
    }
}
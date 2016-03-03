package main.decorator;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class ScrollableWindow implements Window {

    private Window window;

    public ScrollableWindow(Window window) {
        this.window = window;
    }

    @Override
    public void render() {
        createScrollBar();
        window.render();
    }

    public void createScrollBar() {
        System.out.println("Creating scroll bar");
    }
}

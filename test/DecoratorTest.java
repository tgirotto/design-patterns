import main.decorator.ScrollableWindow;
import main.decorator.SimpleWindow;
import main.decorator.Window;
import org.junit.Test;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class DecoratorTest {

    @Test
    public void example() {
        Window window = new SimpleWindow();
        window.render();

        window = new ScrollableWindow(window);
        window.render();
    }
}

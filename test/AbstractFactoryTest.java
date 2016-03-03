import main.abstractFactory.AbstractFactory;
import main.abstractFactory.AbstractFactoryProducer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tgirotto on 3/3/2016.
 */

public class AbstractFactoryTest {

    @Test
    public void example() {
        AbstractFactory shapeFactory = AbstractFactoryProducer.getFactory("SHAPE");
        Assert.assertNotNull(shapeFactory);

        AbstractFactory colorFactory = AbstractFactoryProducer.getFactory("SHAPE");
        Assert.assertNotNull(colorFactory);

        String circle = shapeFactory.getShape("CIRCLE").draw();
        Assert.assertEquals(circle.toUpperCase(), "CIRCLE");

        String rectangle = shapeFactory.getShape("RECTANGLE").draw();
        Assert.assertEquals(rectangle.toUpperCase(), "RECTANGLE");
    }
}

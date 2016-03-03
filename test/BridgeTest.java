
import main.bridge.Persistence;
import main.bridge.PersistenceImpl;
import main.bridge.implementor.DatabasePersistenceImplementor;
import main.bridge.implementor.PersistenceImplementor;
import org.junit.Test;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class BridgeTest {

    @Test
    public void example() {
        PersistenceImplementor persistenceImplementor = new DatabasePersistenceImplementor();
        Persistence persistence = new PersistenceImpl(persistenceImplementor);

        persistence.save();
    }
}
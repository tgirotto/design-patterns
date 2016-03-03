package main.bridge.implementor;

/**
 * Created by tgirotto on 3/3/2016.
 */
public interface PersistenceImplementor {
    String save();
    String delete();
    String findById(String string);
}

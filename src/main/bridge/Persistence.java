package main.bridge;

/**
 * Created by tgirotto on 3/3/2016.
 */
public interface Persistence {

    String save();
    String delete();
    String findById(String id);
}

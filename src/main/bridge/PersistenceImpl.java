package main.bridge;

import main.bridge.implementor.PersistenceImplementor;

/**
 * Created by tgirotto on 3/3/2016.
 */
public class PersistenceImpl implements Persistence {

    PersistenceImplementor persistenceImplementor;

    public PersistenceImpl(PersistenceImplementor i) {
        this.persistenceImplementor = i;
    }

    @Override
    public String save() {
        return persistenceImplementor.save();
    }

    @Override
    public String delete() {
        return persistenceImplementor.delete();
    }

    @Override
    public String findById(String id) {

        return persistenceImplementor.findById(id);
    }
}

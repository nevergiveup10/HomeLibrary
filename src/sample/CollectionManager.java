package sample;

public class CollectionManager implements IManager <Collection> {

    Collection collection = new Collection();

    public void getAllUserCollections(User user){}

    @Override
    public void create(Collection collection) {

    }

    @Override
    public <String> void delete(String str) {

    }

    @Override
    public <String, Collection> Collection get(String str) {
        return (Collection) collection;
    }

    @Override
    public void update(Collection collection) {

    }
}

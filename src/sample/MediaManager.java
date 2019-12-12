package sample;

public class MediaManager implements IManager <Media>{
    Media media = new Media();
    MediaCategory[] mediaCategory;
    Media[] media1;

    Store store = new Store();

    @Override
    public void create(Media media) {

    }

    @Override
    public <String> void delete(String str) {

    }

    @Override
    public <String, Media> Media get(String str) {
        return (Media) media;
    }

    @Override
    public void update(Media media) {

    }

    public MediaCategory[] getAllCategories(){ return  mediaCategory;}

    public Media[] getAllUserMedia(User user){return media1;}

}

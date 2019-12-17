package sample;

public class CollectionMedia implements IUnique{
    private String id;
    private int rate;
    private Accessibility accessibility;
    private Comment comments = new Comment();
    private Media media = new Media();

    public void addComment (Comment comment) {}
    public void deleteComment (String id){}


    @Override
    public Object getUnique() {
        return id;
    }
}

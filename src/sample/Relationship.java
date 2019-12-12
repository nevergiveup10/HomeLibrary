package sample;

public class Relationship implements IUnique {

    private String id;
    private RelationshipStatus status;
    private RelationshipDegree degree;
    private User sender = new User();
    private User receiver = new User();

    @Override
    public Object getUnique() {
        return id;
    }
}

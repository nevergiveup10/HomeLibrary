package sample;

public class User implements IUnique {
    private int mediaRate;
    private UserStatus status;
    private int id;
    private Profile profile = new Profile();

    @Override
    public Object getUnique() {
        return id;
    }
}

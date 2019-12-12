package sample;

public class UserManager implements IManager <User> {
    User user = new User();

    @Override
    public void update(User user){}

    @Override
    public void create(User user){}

    @Override
    public <String> void delete(String str) {

    }

    @Override
    public <String, User> User get(String str) {
        return (User) user;
    }

    public void signIn(Credentials credentials){}
    public void signOut(Credentials credentials){}

}

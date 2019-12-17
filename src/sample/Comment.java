package sample;

import java.util.Date;

public class Comment implements IUnique{
    private User sender = new User();
    private Date date;
    private String id;
    private String text;

    @Override
    public Object getUnique() {
        return id;
    }
}

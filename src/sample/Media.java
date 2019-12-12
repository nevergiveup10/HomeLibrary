package sample;

import java.io.File;

public class Media implements IUnique {
    private File file;
    private String id;
    protected String name;
    private MediaCategory category;
    private User owner = new User();

    @Override
    public Object getUnique() {
        return id;
    }



}

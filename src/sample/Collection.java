package sample;

import java.util.Set;

public class Collection implements IUnique {
    private int n;
    private String id;
    private String name;
    private User owner = new User();
    private User group = new User();
    private MediaCategory categories;
    private Accessibility accessibility;

    @Override
    public Object getUnique() {
        return id;
    }

    public void addCategory(MediaCategory category){}
    public void addMedia (Media media){}
    public void addToGroup(User user){}
    public void clearGroup(){}
    public void deleteCategory (MediaCategory category){}
    public void deleteFromGroup(User user){}
    public void deleteMediaFromCollection(String param){}



}

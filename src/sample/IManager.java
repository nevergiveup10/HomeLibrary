package sample;

public interface IManager<T extends IUnique>{
    public void create(T t);
    public <Obj> void  delete (Obj obj);
    public <Obj, T> T  get(Obj obj);
    public void update(T t);

}

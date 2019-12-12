package sample;

import java.util.Set;

public class Store <T extends IUnique> {
    Set<T> t;

    public void loadData(){}
    public Set<T> set(){return t;}
}

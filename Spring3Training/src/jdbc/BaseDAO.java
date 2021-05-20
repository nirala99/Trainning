package jdbc;

import java.util.List;

public interface BaseDAO<T> {

    public T find(Object key);

    public void add(T e);

    public List<T> findAll();

    public List<T> findEmployeeByName(String neme);

    public int getCount();
}

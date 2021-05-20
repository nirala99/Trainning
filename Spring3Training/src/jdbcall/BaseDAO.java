package jdbcall;

import java.util.List;

public interface BaseDAO<T> {

    public T find(Object key);

    public void addEmp(T e);

    public List<T> findAll();

    public int getCount();
}

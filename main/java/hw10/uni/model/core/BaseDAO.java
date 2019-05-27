package hw10.uni.model.core;

import java.io.Serializable;
import java.util.List;

public interface BaseDAO<T extends Serializable> {

    public void insert(T t);
    public void delete(String Code);
    public void update(String id, T t);
    public T find(String... args);
    public List<T> findAll(String... args);

}

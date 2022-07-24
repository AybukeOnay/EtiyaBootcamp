package dataAccess.abstracts;

import java.util.List;

public interface DataRepository<T> {
    T getById(int id);
    List<T> getAll();
    void add(T entity);
    void update(T entity);
    void delete(T entity);
}

package gameProject.dataAccess.abstracts;

import java.util.List;

public interface DataRepository<T> {

	List<T> getAll();
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	
}

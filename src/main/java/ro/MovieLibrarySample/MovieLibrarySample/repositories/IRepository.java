package ro.MovieLibrarySample.MovieLibrarySample.repositories;

import java.util.ArrayList;

/**
 * @Description: Generic Repository Class
 */
public interface IRepository {
    
    ArrayList<?> getAll();

    Object getById(int id);

    boolean delete(int id);

    boolean update(Object object);

    boolean create(Object object);
    
}

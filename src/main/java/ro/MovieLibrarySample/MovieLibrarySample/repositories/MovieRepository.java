package ro.MovieLibrarySample.MovieLibrarySample.repositories;

import ro.MovieLibrarySample.MovieLibrarySample.models.Movie;
import ro.MovieLibrarySample.MovieLibrarySample.utils.DBConnection;

import java.sql.Connection;
import java.util.ArrayList;

public class MovieRepository implements IRepository {
    @Override
    public ArrayList<?> getAll() {
        return null;
    }

    @Override
    public Object getById(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(Object object) {
        return false;
    }

    @Override
    public boolean create(Object object) {
        Movie movie = (Movie) object;
        
        Connection con = DBConnection.getConnection();
        

        
        return false;
    }
}

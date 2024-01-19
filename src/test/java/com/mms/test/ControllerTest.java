/*package com.mms.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mms.bean.Movie;
import com.mms.dao.MovieDAO;

public class ControllerTest {

	@Autowired
    MovieDAO dao;

    private Movie movie;

    @Before
    public void setUp() throws Exception {
        // Code executed before each test method
        movie = new Movie();
        movie.setId(125);
        movie.setName("GOD FATHER");
        movie.setType("Thriller");
        movie.setLanguage("English");
        movie.setDuration("2hrs");
    }

    @Test
    public void testPerformInsert() {
        // Test if the movie object is saved to the database
        dao.save(movie);
        assertNotNull(movie.getId());
    }

    @Test
    public void testGetAll() {
        // Test if the getAll() method returns a list of movies
        List<Movie> movies = (List<Movie>) dao.findAll();
        assertNotNull(movies);
    }

    @Test
    public void testPerformUpdate() {
        // Test if the movie object is updated in the database
        dao.save(movie);
        movie.setDuration("2hrs");
        dao.save(movie);
        Movie updatedMovie = dao.findById(movie.getId()).orElse(null);
        assertEquals(updatedMovie.getDuration(), "2hrs");
    }

    @Test
    public void testPerformDelete() {
        // Test if the movie object is deleted from the database
        dao.save(movie);
        dao.deleteById(movie.getId());
        Movie deletedMovie = dao.findById(movie.getId()).orElse(null);
        assertEquals(deletedMovie, null);
    }
}*/

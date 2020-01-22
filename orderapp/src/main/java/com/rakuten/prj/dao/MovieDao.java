package com.rakuten.prj.dao;

import java.util.List;

import com.rakuten.prj.entity.Movie;

public interface MovieDao {
	void addMovie(Movie movie);
	List<Movie> getMovies();
	Movie getById(int id);
	void updateMovie(Movie movie);
}

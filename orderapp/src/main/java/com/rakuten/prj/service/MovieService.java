package com.rakuten.prj.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.prj.dao.ActorDao;
import com.rakuten.prj.dao.MovieDao;
import com.rakuten.prj.entity.Actor;
import com.rakuten.prj.entity.Movie;

@Service
@Transactional
public class MovieService {
	@Autowired
	private ActorDao actorDao;
	
	@Autowired
	private MovieDao movieDao;
	
	public void addActor(Actor actor) {
		actorDao.addActor(actor);
	}

	public Actor getActor(int id) {
		return actorDao.getActor(id);
	}

	public List<Actor> getAllActors() {
		return actorDao.getAllActors();
	}
	
	public void addMovie(Movie movie) {
		movieDao.addMovie(movie);
	}

	public List<Movie> getMovies() {
		return movieDao.getMovies();
	}

	public Movie getById(int id) {
		return movieDao.getById(id);
	}

	public void updateMovie(Movie movie) {
		movieDao.updateMovie(movie);
	}
}

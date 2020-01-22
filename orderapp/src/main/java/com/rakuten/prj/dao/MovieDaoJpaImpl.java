package com.rakuten.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rakuten.prj.entity.Movie;

@Repository
public class MovieDaoJpaImpl implements MovieDao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addMovie(Movie movie) {
		em.persist(movie);
	}

	@Override
	public List<Movie> getMovies() {
		String jpql = "from Movie";
		TypedQuery<Movie> query = em.createQuery(jpql, Movie.class);
		return query.getResultList();
	}

	@Override
	public Movie getById(int id) {
		return em.find(Movie.class, id);
	}

	@Override
	public void updateMovie(Movie movie) {
		em.merge(movie);
	}

}

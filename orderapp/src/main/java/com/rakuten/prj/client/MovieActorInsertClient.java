package com.rakuten.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.ActorDaoJpaImpl;
import com.rakuten.prj.dao.MovieDaoJpaImpl;
import com.rakuten.prj.entity.Actor;
import com.rakuten.prj.entity.Movie;
import com.rakuten.prj.service.MovieService;

public class MovieActorInsertClient {

	public static void main(String[] args) {
		// creates Spring container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		ctx.register(MovieService.class);
		ctx.register(MovieDaoJpaImpl.class);
		ctx.register(ActorDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.refresh();
		
		MovieService service = ctx.getBean("movieService",MovieService.class);
		
		Movie m1 = service.getById(1);
		Actor a1 = service.getActor(2);
		m1.getActors().add(a1);
		
		Movie m2 = service.getById(2);
		Actor a2 = service.getActor(1);
		Actor a3 = service.getActor(3);
		
		m2.getActors().add(a2);
		m2.getActors().add(a3);
		
		service.updateMovie(m1);
		service.updateMovie(m2);
		
		
//		Movie m1 = new Movie();
//		m1.setName("Kill Bill 1");
//		
//		Movie m2 = new Movie();
//		m2.setName("Pulp Fiction");
//		
//		Actor a1 = new Actor();
//		a1.setName("John Travolta");
//		
//		Actor a2 = new Actor();
//		a2.setName("Uma Thruman");
//		
//		Actor a3 = new Actor();
//		a3.setName("Samuel Jackson");
//		
//		service.addActor(a1);
//		service.addActor(a2);
//		service.addActor(a3);
//		
//		service.addMovie(m1);
//		service.addMovie(m2);
	}

}

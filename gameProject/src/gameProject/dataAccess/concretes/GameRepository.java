package gameProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gameProject.dataAccess.abstracts.DataRepository;
import gameProject.entities.concretes.Game;

public class GameRepository implements DataRepository<Game> {

	List<Game> games = new ArrayList<>();
	
	@Override
	public List<Game> getAll() {
		return games;
	}

	@Override
	public void add(Game entity) {
		games.add(entity);
		System.out.println("Game added succesfully");
		
	}

	@Override
	public void update(Game entity) {
		System.out.println("Game updated succesfully");
		
	}

	@Override
	public void delete(Game entity) {
		games.remove(entity);
		System.out.println("Game deleted succesfully");
		
	}

}

package gameProject.business.abstracts;

import java.util.List;

import gameProject.entities.concretes.Game;

public interface GameService {

	List<Game> getAll();
	void add(Game game);
	void update(Game game);
	void delete(Game game);
}

package gameProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gameProject.dataAccess.abstracts.DataRepository;
import gameProject.entities.concretes.Player;

public class PlayerRepository implements DataRepository<Player> {

	List<Player> players = new ArrayList<>();

	@Override
	public List<Player> getAll() {
		return players;
	}

	@Override
	public void add(Player entity) {
		players.add(entity);
		System.out.println("Player added succesfully");

	}

	@Override
	public void update(Player entity) {
		System.out.println("Player updated succesfully");

	}

	@Override
	public void delete(Player entity) {
		players.remove(entity);
		System.out.println("Player deleted succesfully");
	}

}

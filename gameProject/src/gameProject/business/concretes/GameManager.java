package gameProject.business.concretes;

import java.util.List;

import gameProject.business.abstracts.GameService;
import gameProject.dataAccess.abstracts.DataRepository;
import gameProject.entities.concretes.Game;

public class GameManager implements GameService {

	private DataRepository dataRepository;

	public GameManager(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	@Override
	public List<Game> getAll() {
		return dataRepository.getAll();
	}

	@Override
	public void add(Game game) {
		if (!checkIfGameExist(game.getId()) && !checkIfGameNameExist(game.getName())) {
			dataRepository.add(game);
		}else {
			System.out.println("Game is already exist");
		}
		
	}

	@Override
	public void update(Game game) {
		if (checkIfGameExist(game.getId())) {
			dataRepository.update(game);
		}else {
			System.out.println("Game is not found");
		}

	}

	@Override
	public void delete(Game game) {
		if (checkIfGameExist(game.getId())) {
			dataRepository.delete(game);
		}else {
			System.out.println("Game is not found");
		}
		
	}

	private boolean checkIfGameExist(int id) {
		boolean exist = false;
		List<Game> games=getAll();
		for (Game game : games) {
			if (game.getId() ==id) {
				exist = true;
			}
		}
		return exist;
	}

	private boolean checkIfGameNameExist(String name) {
		boolean exist = false;
		List<Game> games=getAll();
		for (Game game : games) {
			if (game.getName() ==name) {
				exist = true;
			}
		}
		return exist;
	}

}

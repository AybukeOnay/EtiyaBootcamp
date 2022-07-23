package gameProject.business.concretes;

import java.util.List;

import gameProject.business.abstracts.PlayerService;
import gameProject.core.utilities.MernisService;
import gameProject.dataAccess.abstracts.DataRepository;
import gameProject.entities.concretes.Player;

public class PlayerManager implements PlayerService {

	private DataRepository dataRepository;
	private MernisService mernisService;
		
	public PlayerManager(DataRepository dataRepository, MernisService mernisService) {
		this.dataRepository = dataRepository;
		this.mernisService = mernisService;
	}

	@Override
	public List<Player> getAll() {
		return dataRepository.getAll();
	}

	@Override
	public void add(Player player) {
		if (mernisService.isPlayerValid(player)) {
			dataRepository.add(player);
		}
				
	}

	@Override
	public void update(Player player) {
		dataRepository.update(player);
		
	}

	@Override
	public void delete(Player player) {
		dataRepository.delete(player);
		
	}

}

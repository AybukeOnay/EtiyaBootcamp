package gameProject;

import java.time.LocalDate;

import gameProject.business.concretes.CampaignManager;
import gameProject.business.concretes.GameManager;
import gameProject.business.concretes.PlayerManager;
import gameProject.core.utilities.MernisAdapter;
import gameProject.core.utilities.MernisService;
import gameProject.dataAccess.concretes.CampaignRepository;
import gameProject.dataAccess.concretes.GameRepository;
import gameProject.dataAccess.concretes.PlayerRepository;
import gameProject.entities.concretes.Campaign;
import gameProject.entities.concretes.Game;
import gameProject.entities.concretes.Player;

public class Main {

	public static void main(String[] args) {
		
		GameManager gameManager = new GameManager(new GameRepository());
		Game game1 = new Game(1, "Call of Duty", 800);
		Game game2 = new Game(2, "Sims", 1000);
		gameManager.add(game1);
		gameManager.add(game2);
		
		CampaignManager campaignManager = new CampaignManager(new CampaignRepository());
		Campaign campaign1 = new Campaign(1, "Sonbahar indirimi", 0.30);
		Campaign campaign2 = new Campaign(1, "Yılbaşı indirimi", 0.40);
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		
		MernisService mernisService = new MernisAdapter();
		PlayerManager playerManager = new PlayerManager(new PlayerRepository(),new MernisAdapter());
		Player player1 = new Player(1, "Aybüke", "Onay", "01234567890", LocalDate.parse("1997-10-11"));
		Player player2 = new Player(2, "Nalan", "Onay", "11111111111", LocalDate.parse("1990-01-01"));
		playerManager.add(player1);
		playerManager.add(player2);
	}

}

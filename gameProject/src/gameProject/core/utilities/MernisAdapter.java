package gameProject.core.utilities;

import gameProject.entities.concretes.Player;

public class MernisAdapter implements MernisService{

	@Override
	public boolean isPlayerValid(Player player) {
		System.out.println(player.getFirstName()+ " "
                +player.getLastName()+ " " +player.getNationalIdentity()+ " "
                +player.getBirthDate().getYear()+ " Mernis ile doğrulama yapıldı.");
		return true;
	}

}

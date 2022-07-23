package gameProject.business.concretes;

import java.util.List;

import gameProject.business.abstracts.CampaignService;
import gameProject.dataAccess.abstracts.DataRepository;
import gameProject.entities.concretes.Campaign;

public class CampaignManager implements CampaignService{

	private DataRepository dataRepository;
	
	public CampaignManager(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	@Override
	public List<Campaign> getAll() {
		return dataRepository.getAll();
	}

	@Override
	public void add(Campaign campaign) {
		dataRepository.add(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		dataRepository.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		dataRepository.delete(campaign);
		
	}

}

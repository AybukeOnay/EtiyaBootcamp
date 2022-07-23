package gameProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gameProject.dataAccess.abstracts.DataRepository;
import gameProject.entities.concretes.Campaign;

public class CampaignRepository implements DataRepository<Campaign>{

	List<Campaign> campaigns = new ArrayList<>();
	
	@Override
	public List<Campaign> getAll() {
		return campaigns;
	}

	@Override
	public void add(Campaign entity) {
		campaigns.add(entity);
		System.out.println("Campaign added succesfully");
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println("Campaign updated succesfully");
		
	}

	@Override
	public void delete(Campaign entity) {
		campaigns.remove(entity);
		System.out.println("Campaign deleted succesfully");		
	}

}

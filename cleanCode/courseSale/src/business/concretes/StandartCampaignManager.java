package business.concretes;

import business.abstracts.CampaignService;
import entities.concretes.Course;

import java.util.List;

public class StandartCampaignManager implements CampaignService {
    @Override
    public void updatePrice(List<Course> courses) {
       for (Course course : courses){
           course.setPrice(getCurrentBasePrice());
       }
    }
    private double getCurrentBasePrice() {
        //Veritabanından alır
        return 25;
    }
}

package business.abstracts;

import entities.concretes.Course;

import java.util.List;

public interface CampaignService {
    void updatePrice(List<Course> courses);
}

package business.concretes;

import business.abstracts.CampaignService;
import business.abstracts.CourseService;
import dataAccess.abstracts.CourseDal;
import entities.concretes.Course;

import java.util.List;

public class CourseManager implements CourseService {
    CourseDal courseDal;
    CampaignService campaignService;

    public CourseManager(CourseDal courseDal, CampaignService campaignService) {
        this.courseDal = courseDal;
        this.campaignService = campaignService;
    }

    @Override
    public void add(Course course) {
        courseDal.add(course);
    }

    @Override
    public List<Course> getAll() {
      return courseDal.getCourse();

    }

    @Override
    public List<Course> getAllWithCampaign() {
        campaignService.updatePrice(courseDal.getCourse());
        return courseDal.getCourse();
    }
}

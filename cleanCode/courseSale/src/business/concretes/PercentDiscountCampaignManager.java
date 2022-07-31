package business.concretes;

import business.abstracts.CampaignService;
import entities.concretes.Course;

import java.util.List;

public class PercentDiscountCampaignManager implements CampaignService {
    @Override
    public void updatePrice(List<Course> courses) {
        for (Course course : courses) {
            course.setPrice(calculatePercentDiscount(course.getPrice(), getPercentageDiscount()));
        }
    }
    private double getPercentageDiscount() {
        return 0.90;
    }
    private double calculatePercentDiscount(double price, double percentile) {
        return price - (price * percentile);
    }
}

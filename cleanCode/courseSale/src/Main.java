import business.abstracts.CourseService;
import business.concretes.CourseManager;
import business.concretes.PercentDiscountCampaignManager;
import business.concretes.StandartCampaignManager;
import dataAccess.concretes.NhCourseDal;
import entities.concretes.Course;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1,"C# kursu",450.80);
        Course course2 = new Course(1,"Java kursu",100);
        Course course3 = new Course(1,"Pythom kursu",157.90);


        CourseService courseService = new CourseManager(new NhCourseDal(),new StandartCampaignManager());
        courseService.add(course1);
        courseService.add(course2);
        for (Course course: courseService.getAll()){
            System.out.println("Kurs adi : " + course.getName());
            System.out.println("Kurs fiyati" + course.getPrice());
        }

        System.out.println("Egitimin kampanyali fiyati:");
        for (Course course: courseService.getAllWithCampaign()){
            System.out.println(course.getName() + " = " + course.getPrice());
        }
    }
}

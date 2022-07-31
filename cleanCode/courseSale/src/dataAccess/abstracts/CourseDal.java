package dataAccess.abstracts;

import entities.concretes.Course;

import java.util.List;

public interface CourseDal  {
    void add(Course course);
    List<Course> getCourse();
}

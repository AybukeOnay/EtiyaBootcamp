package dataAccess.concretes;

import dataAccess.abstracts.CourseDal;
import entities.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class NhCourseDal implements CourseDal {
    List<Course> courses = new ArrayList<>();
    @Override
    public void add(Course course) {
        courses.add(course);
    }

    @Override
    public List<Course> getCourse() {
        return courses;
    }
}

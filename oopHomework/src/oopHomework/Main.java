package oopHomework;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ");
		Instructor instructor2 = new Instructor(2, "Akın", "Kaldıroğlu");
		
		Category category1 = new Category(1, "Yazılım");
		
		Course course1 = new Course(1, "Java + React", category1, instructor1);
		Course course2 = new Course(1, "C# + Angular", category1, instructor2);
		Course course3 = new Course(1, "Javascript", category1, instructor1);
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		for (Course course : courseManager.getAll()) {
			System.out.println(course.getName());

		}
	}

}

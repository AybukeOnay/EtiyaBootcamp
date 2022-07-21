package oopHomework;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {

	private List<Instructor> instructors;

	public InstructorManager() {
		instructors = new ArrayList<>();
	}

	public void add(Instructor instructor) {
		instructors.add(instructor);
		System.out.println("Instructor added");
	}

	public List<Instructor> getAll() {

		return instructors;
	}
}

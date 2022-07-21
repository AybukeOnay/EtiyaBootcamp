package workshop1;

public class Main {

	public static void main(String[] args) {
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Programming");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin");
		instructor1.setSurname("Demiroğ");
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Java + React");
		course1.setCategory(category1);
		course1.setInstructor(instructor1);
			
		
		System.out.println(category1.getName());
		System.out.println(course1.getName());
		System.out.println(course1.getCategory().getName());
		System.out.println(course1.getInstructor().getName());
		System.out.println(instructor1.getName());
		
	}

}

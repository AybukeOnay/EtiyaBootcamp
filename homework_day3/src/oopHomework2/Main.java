package oopHomework2;

public class Main {

	public static void main(String[] args) {

		User instructor1 = new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com", "1234");
		User instructor2 = new Instructor(2, "Akın", "Kaldıroğlu", "akinkaldiroglu@gmail.com", "12345");
		
		User student1 = new Student("deneme", "Ankara", 3, "Aybuke", "Onay", "aybuke@gmail.com", "111");
		User student2 = new Student("deneme", "Ankara", 4, "Umit", "Onay", "umite@gmail.com", "012");

		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.add(instructor2);
		userManager.add(student1);
		userManager.add(student2);
		
		//userManager.delete(student2);
	}

}

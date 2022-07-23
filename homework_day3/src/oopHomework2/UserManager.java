package oopHomework2;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

	List<User> users;
	
	public UserManager() {
		users = new ArrayList<>();
	}

	public void add(User user) {
		if (!checkIfUserExist(user.getId())) {
			users.add(user);
			System.out.println("User added");
		}else {
			System.out.println("User already exist");
		}
		
	}

	public void update(User user) {
		if (checkIfUserExist(user.getId())) {
			users.add(user);
			System.out.println("User updated");
		}else {
			System.out.println("User is not founded");
		}		
	}

	public void delete(User user) {
		if (checkIfUserExist(user.getId())) {
			users.remove(user.getId());
			System.out.println("User deleted");
		} else {
			System.out.println("User is not founded");
		}

	}

	public List<User> getAll() {
		return users;
	}

	private boolean checkIfUserExist(int id) {
		boolean exist = false;
		for (User user : users) {
			if (user.getId() == id) {
				exist = true;
			}
		}
		return exist;
	}
}

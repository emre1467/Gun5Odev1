package dataAccess.abstracts;


import Entities.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void getall();
	boolean getUserByEmail(String mail,String password);
}

package Business.Abstracts;

import Entities.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void getall();
	void login(String mail,String password);
}

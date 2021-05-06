package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Entities.User;
import dataAccess.abstracts.UserDao;

public class HibernateUserDao implements UserDao{

	List<User> users=new ArrayList<User>();
	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		
	}

	@Override
	public void getall() {
		for(User u:users) {
			System.out.println(u.getName()+" "+u.getSurName());
		}
	}

	@Override
	public boolean getUserByEmail(String mail,String password) {
		for(User u:users) {
			if(u.getEposta()==mail) {
				if(u.getParola()==password) {
					return true;
				}
				else
					System.out.println("mail doðru ama parola hatalý");
			}
		}
		
		return false;
		
	}
	
}

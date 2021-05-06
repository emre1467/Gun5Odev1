package Business.Concretes;

import Business.Abstracts.UserService;
import Entities.User;
import dataAccess.abstracts.UserDao;

public class UserManager implements UserService{

	private UserDao userDao;
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
	}
	
	
	@Override
	public void add(User user) {
		if(user.getName().length()>2) {
			if(user.getSurName().length()>2 &&user.getParola().length()>=6) {
				if(EmailKontrol.kontrol(user)&&EmailLogger.log(user)) {
					System.out.println(user.getName()+" "+user.getSurName()+" eklendi");
					this.userDao.add(user);
				}
				else 
					System.out.println("Kullan�c� eklenemedi");
			}	
		}
		else
		{
			System.out.println("Kullan�c� ad� veya soyad� hatal� girildi.");
			System.out.println("Kullan�c� eklenemedi");
		}
			
	}


	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" "+user.getSurName()+" silindi");
		this.userDao.delete(user);
		
	}


	@Override
	public void getall() {
		System.out.println("Kullan�c�lar :");
		this.userDao.getall();
		
	}


	@Override
	public void login(String mail,String password) {
		if(this.userDao.getUserByEmail(mail,password))
		{
			System.out.println("Sisteme giri� yapt�n�z");
		}
		System.out.println("Sisteme giri� yapamad�n�z");
	}

}

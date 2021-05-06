
import Business.Concretes.UserManager;
import Entities.User;
import dataAccess.concretes.HibernateUserDao;

public class Main {

    public static void main(String[] args){
        User user=new User();
        user.setEposta("emre@gmail.com");
        user.setName("emre");
        user.setParola("123456");
        user.setSurName("yiðit");
        User user2=new User();
        user2.setEposta("emre2@gmail.com");
        user2.setName("ali");
        user2.setParola("123456");
        user2.setSurName("veli");
        UserManager manager=new UserManager(new HibernateUserDao());
        manager.add(user);
        manager.getall();
        manager.login(user.getEposta(),"4654");
        manager.login(user2.getEposta(),user2.getParola());
    }
}
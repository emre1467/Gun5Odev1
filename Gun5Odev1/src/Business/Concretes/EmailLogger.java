package Business.Concretes;

import Entities.User;

public class EmailLogger extends Logger{
	public static boolean log(User user) {
		System.out.println(user.getEposta()+" epostalı kullanıcıya doğrulama maili gönderildi");
		return logKontrol(user);
	}
	private static boolean logKontrol(User user) {
		return true;
	}
}

package Business.Concretes;

import Entities.User;

public class EmailLogger extends Logger{
	public static boolean log(User user) {
		System.out.println(user.getEposta()+" epostal� kullan�c�ya do�rulama maili g�nderildi");
		return logKontrol(user);
	}
	private static boolean logKontrol(User user) {
		return true;
	}
}

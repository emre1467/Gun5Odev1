package Business.Concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Entities.User;

public class EmailKontrol {

	public static boolean kontrol(User user) {
		Pattern pattern = Pattern.compile("[abcdefgÐhýijklmnoöprsþtuüvyz]@gmail.com");  //Pattern.compile(console.readLine("%nEnter your regex: "));

        Matcher matcher = pattern.matcher(user.getEposta());  //(console.readLine("Enter input string to search: "));

        boolean found = false;
        if(matcher.find()) {

            found = true;
        }
        else if(!found){
            System.out.println(("email adresi standartlara uymuyor"));
        }
        return found;
	}
	
	
}

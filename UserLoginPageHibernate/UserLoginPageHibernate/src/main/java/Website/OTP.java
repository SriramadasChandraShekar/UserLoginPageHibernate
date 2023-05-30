package Website;
import java.util.*;
public class OTP {

	public static String getOTP(int length) {
		String s="0123456789";
		Random random=new Random();
		char[] ch=new char[length];
		for (int i = 0; i < length; i++) {
			ch[i]=s.charAt(random.nextInt(s.length()));
		}
		
		return new String(ch);
	}

}

package Website;
import java.util.*;
public class Validate {
static Scanner sc=new Scanner(System.in);
	public static boolean name(String s) {
           for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if((ch>='0'&&ch<='9')&&!((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))) {
				return false;
			}
		}

		return true;
	}

	public static boolean number(long number) {
		int c=0;
		while(number!=0) {
			c++;
			number/=10;
		}
		if(c==10) {
			int otp=Integer.parseInt(OTP.getOTP(6));
			System.out.println("Welcome to Website your OTP is "+otp+" \nUse this OTP to verify your Mobile Number ");
			int otp1=sc.nextInt();
			if(otp==otp1) {
				System.out.println("You have Successfully validated your Mobile Number");
				return true;
			}
			System.out.println("Incorrect OTP we have Re-Sending OTP");
			number(number);
		}
		
		return false;  
	}

	public static boolean Email(String email) {
		if(email.contains("@gmail.com")) {
			return true;
		}
		return false;
	}

	public static boolean password(String password) {
		
		// TODO Auto-generated method stub
		if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Check for at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Check for at least one special character
        if (!password.matches(".*[!@#$%^&*()-_=+\\|\\[{\\]};:'\",<.>/?].*")) {
            return false;
        }

        // Check for at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Password meets all requirements
        return true;
		
	}

	public static boolean UpdateNumber(long number, String s) {
		// TODO Auto-generated method stub
		int c=0;
		while(number!=0) {
			c++;
			number/=10;
		}
		if(c==10) {
			int otp=Integer.parseInt(OTP.getOTP(6));
			System.out.println("We got request to "+s+" So, the OTP is "+otp+" \nUse this OTP to verify your Mobile Number ");
			int otp1=sc.nextInt();
			if(otp==otp1) {
				System.out.println("You have Successfully validated your Mobile Number");
				return true;
			}
			System.out.println("Incorrect OTP we have Re-Sending OTP");
			UpdateNumber(number, s);
		}
		
		return false;  
	}
	
}

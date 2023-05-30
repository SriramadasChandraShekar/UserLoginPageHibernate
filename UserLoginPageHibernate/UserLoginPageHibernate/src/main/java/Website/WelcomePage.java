package Website;
import java.util.*;
public class WelcomePage {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("         Heyy User\n   Welcome to the Website ");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("Press 1 to Login to your Account\npress 2 to Singin to website");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*"); 
		System.out.println("press 3 for Forgot Password???:(\n ");
		int n=sc.nextInt();
		if(n==1) {
			LoginAcc.login();
		}
		else if(n==2) {
			Signin.singin();
		}
		else if(n==3) {
			ForgotPassword.forgot();
		}
		else {
			System.out.println("Enter a valid input:)");
			WelcomePage.main(args);
		}
	}

}

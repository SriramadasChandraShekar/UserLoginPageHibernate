package Website;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

public class ForgotPassword extends Signin {

	public static void forgot() {
		// TODO Auto-generated method stub
		Query q;
		System.out.println("You have select to change your password");
		System.out.println("Enter your Mobile Number");
		long number = sc.nextLong();
		if (Validate.UpdateNumber(number, "Forgot Password")) {
			a1.setNumber(number);
			 q= em.createQuery("select s from DTO_Data s where number='"+a1.getNumber()+"'");
			 li = q.getResultList();
			for (DTO_Data d : li) {
				if (d.getNumber() == number) {
					a1.setNumber(number);
					
				} else {
					System.out.println("you have Entered Incorrect Mobile Number\nPlease Try Again");
					forgot();
				}
			}
		} else {
			System.out.println("Mobile Number Not Valid\n Please Try Again");
			forgot();
		}
		System.out.println("Enter a New password");
		String pass = sc.next();
		System.out.println("Re-Enter New password");
		String pass1 = sc.next();
		if (Validate.password(pass) && Validate.password(pass1)) {
			if (pass.equals(pass1)) {
				a1.setPassword(pass);
			} else {
				System.out.println("Re-Entered password doesn't Match\nTry Again");
				forgot();
			}
		} else {
			System.out.println(
					"password does't match formate \npassword must contain atleast one uppercase,lowercase,special Character and Number\nPlease Try Again");
			forgot();
		}
		et.begin();
		q = em.createQuery(
				"Update DTO_Data d set password='" + a1.getPassword() + "' where number='" + a1.getNumber() + "'");
		q.executeUpdate();
		et.commit();
		System.out.println("Your Password updated successfully");
		System.out.println(
				"Do you want to update another Data??\n1=>Login to Website\n2=>Logout from Website");
		int n = sc.nextInt();
		if (n == 1) {
			Update.update(li);
		} else if (n == 2) {
			Profile.profile(li);
		} else if (n == 3) {
			WelcomePage.main(null);
		}
	}
}

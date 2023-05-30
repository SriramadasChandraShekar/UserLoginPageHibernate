package Website;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

public class LoginAcc extends Signin {

	@SuppressWarnings("unlikely-arg-type")
	public static void login() {
		DTO_Data a1 = new DTO_Data();
		System.out.println("     Login Here:)👨‍💻👨‍💻👨‍💻      ");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("Enter your Mobile Number");
		long number = sc.nextLong();
		long n = number;
		a1.setNumber(number);
		System.out.println("Enter your Password");
		String password = sc.next();
		if (Validate.password(password)) {
			a1.setPassword(password);
		} else {
			System.out.println("Incorrect password");
		}
		Query q = em.createQuery("select s from DTO_Data s where number='" + a1.getNumber() + "'");
		 li = q.getResultList();
		if (!(li.isEmpty())) {

			for (DTO_Data d : li) {
				if (d.getNumber() == number) {
					if (d.getPassword().equals(password)) {

						System.err.println("Welcome to the Website " + d.getName());
						Profile.profile(li);
					}

					else {
						System.out.println("Incorrect password");
					}
				} else {
					System.out.println("incorrect mobile number");
				}
			}

		} else {
			System.out.println("Your Details does't match our Records:)\n Please SignIn to Webiste");
			Signin.singin();
		}
	}
}

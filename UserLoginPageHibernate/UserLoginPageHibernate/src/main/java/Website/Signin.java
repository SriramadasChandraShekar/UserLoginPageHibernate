package Website;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Signin extends WelcomePage {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("magician");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();
	static DTO_Data a1 = new DTO_Data();
	static List<DTO_Data> li;

	public static void singin() {

		System.out.println("Enter your full name");
		String name = sc.next();
		if (Validate.name(name)) {
			a1.setName(name);
		} else {
			System.out.println("Enter a valid Name");
			name = sc.next();
			if (Validate.name(name)) {
				a1.setName(name);
			}
		}
		System.out.println("Enter your Dob");
		String dob = sc.next();
		a1.setDob(dob);
		System.out.println("Enter your Gender");
		String gen = sc.next();
		a1.setGen(gen);
		System.out.println("Enter your Mobile Number");
		long number = sc.nextLong();
		if (Validate.number(number)) {
			a1.setNumber(number);
		} else {
			System.out.println("Enter a Valid Mobile Number");
			number = sc.nextLong();
			if (Validate.number(number)) {
				a1.setNumber(number);
			}
		}
		System.out.println("Enter your Email");
		String email = sc.next();
		if (Validate.Email(email)) {
			a1.setEmail(email);
		} else {
			System.out.println("Invalid email Id \nEnter Valid Email Id");
			email = sc.next();
			if (Validate.Email(email)) {
				a1.setEmail(email);
			}
		}
		System.out.println(
				"Enter your Password \npassword must contain atleast one uppercase,lowercase,special Character and Number");
		String password = sc.next();
		System.out.println("Re-Enter Passowrd");
		String password1 = sc.next();
		if (password.equals(password1)) {
			if (Validate.password(password)) {
				a1.setPassword(password);
			} else {
				System.out.println("password does't match formate \npassword must contain atleast one uppercase,lowercase,special Character and Number");
				password = sc.next();
				System.out.println("Re-Enter Passowrd");
				password1 = sc.next();
				if (password.equals(password1)) {
					if (Validate.password(password)) {
						a1.setPassword(password);
					}
				}
			}
		} else {
			System.out.println("Re-entered password does't match");
			System.out.println(
					"Enter your Password \npassword must contain atleast one uppercase,lowercase,special Character and Number");
			password = sc.next();
			System.out.println("Re-Enter Passowrd");
			password1 = sc.next();
			if (password.equals(password1)) {
				if (Validate.password(password)) {
					a1.setPassword(password);
				} else {
					System.out.println(
							"password does't match formate \npassword must contain atleast one uppercase,lowercase,special Character and Number");
					password = sc.next();
					System.out.println("Re-Enter Passowrd");
					password1 = sc.next();
					if (password.equals(password1)) {
						if (Validate.password(password)) {
							a1.setPassword(password);
						}
					}
				}
			}
		}

		et.begin();
		em.persist(a1);
		et.commit();

	}

}

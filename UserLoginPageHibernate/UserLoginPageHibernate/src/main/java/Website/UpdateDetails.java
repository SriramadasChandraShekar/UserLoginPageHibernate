package Website;

import java.util.List;

import javax.persistence.Query;


public class UpdateDetails extends Signin {

	public static void UpdateName(List<DTO_Data> li) {
		// TODO Auto-generated method stub
		
		System.out.println("You have select to change your name");
		System.out.println("Enter your Mobile Number");
		long number = sc.nextLong();
		if (Validate.UpdateNumber(number, "Update your Name")) {
			for (DTO_Data d : li) {
				if (d.getNumber() == number) {
					a1.setNumber(number);
					System.out.println("Enter New Name");
					String name = sc.next();
					if (Validate.name(name)) {
						a1.setName(name);
					}
				} else {
					System.out.println("you have Entered Incorrect Mobile Number\nPlease Try Again");
					UpdateDetails.UpdateName(li);
				}
			}
		} else {
			System.out.println("Mobile Number Not Valid\n Please Try Again");
			UpdateDetails.UpdateName(li);
		}
		et.begin();
		Query q = em.createQuery("Update DTO_Data d set name='" + a1.getName() + "' where number='" + a1.getNumber() + "'");
		q.executeUpdate();
		et.commit();
		System.out.println("Your Name updated successfully");
		System.out.println(
				"Do you want to update another Data??\n1=>Update another Data\n2=>Back to Profile Page\n3=>Logout from Website");
		int n = sc.nextInt();
		if (n == 1) {
			Update.update(li);
		} else if (n == 2) {
			Profile.profile(li);
		} else if (n == 3) {
			WelcomePage.main(null);
		}
	}

	public static void UpdateDob(List<DTO_Data> li) {
		// TODO Auto-generated method stub
		
		System.out.println("You have select to change your Date of Birth");
		System.out.println("Enter your Mobile Number");
		long number = sc.nextLong();
		if (Validate.UpdateNumber(number, "Update your Date of Birth")) {
			for (DTO_Data d : li) {
				if (d.getNumber() == number) {
					a1.setNumber(number);
					System.out.println("Enter new your Date of Birth");
					String dob = sc.next();
					a1.setDob(dob);
				} else {
					System.out.println("you have Entered Incorrect Mobile Number\nPlease Try Again");
					UpdateDetails.UpdateDob(li);
				}
			}
		} else {
			System.out.println("Mobile Number Not Valid\n Please Try Again");
			UpdateDetails.UpdateDob(li);
		}
		et.begin();
		Query q = em.createQuery("Update DTO_Data d set dob='" + a1.getDob() + "' where number='" + a1.getNumber() + "'");
		q.executeUpdate();
		et.commit();
		System.out.println("Your Date of Birth updated successfully");
		System.out.println(
				"Do you want to update another Data??\n1=>Update another Data\n2=>Back to Profile Page\n3=>Logout from Website");

		int n = sc.nextInt();
		if (n == 1) {
			Update.update(li);
		} else if (n == 2) {
			Profile.profile(li);
		} else if (n == 3) {
			WelcomePage.main(null);
		}
	}

	public static void UpdateGender(List<DTO_Data> li) {
		// TODO Auto-generated method stub
		
		System.out.println("You have select to change your Gender ");
		System.out.println("Enter your Mobile Number");
		long number = sc.nextLong();
		if (Validate.UpdateNumber(number, "Update your Gender")) {
			for (DTO_Data d : li) {
				if (d.getNumber() == number) {
					a1.setNumber(number);
					System.out.println("Enter your new Gender");
					String gen = sc.next();
					a1.setGen(gen);
				} else {
					System.out.println("you have Entered Incorrect Mobile Number\nPlease Try Again");
					UpdateDetails.UpdateGender(li);
				}
			}
		} else {
			System.out.println("Mobile Number Not Valid\n Please Try Again");
			UpdateDetails.UpdateGender(li);
		}
		et.begin();
		Query q = em.createQuery("Update DTO_Data d set gen='" + a1.getGen() + "' where number='" + a1.getNumber() + "'");
		et.commit();
		System.out.println("Your Gender updated successfully");
		System.out.println(
				"Do you want to update another Data??\n1=>Update another Data\n2=>Back to Profile Page\n3=>Logout from Website");
		int n = sc.nextInt();
		if (n == 1) {
			Update.update(li);
		} else if (n == 2) {
			Profile.profile(li);
		} else if (n == 3) {
			WelcomePage.main(null);
		}
	}

	public static void UpdateEmail(List<DTO_Data> li) {
		// TODO Auto-generated method stub
		
		System.out.println("You have select to change your Email");
		System.out.println("Enter your Mobile Number");
		long number = sc.nextLong();
		if (Validate.UpdateNumber(number, "Update your Email")) {
			for (DTO_Data d : li) {
				if (d.getNumber() == number) {
					a1.setNumber(number);
					System.out.println("Enter your new Email Id");
					String emial = sc.next();
					if (Validate.Email(emial)) {
						a1.setEmail(emial);
					} else {
						System.out.println("Please Try Again, Invalid Email");
						UpdateDetails.UpdateEmail(li);
					}
				} else {
					System.out.println("you have Entered Incorrect Mobile Number\nPlease Try Again");
					UpdateDetails.UpdateEmail(li);
				}
			}
		} else {
			System.out.println("Mobile Number Not Valid\n Please Try Again");
			UpdateDetails.UpdateEmail(li);
		}
		et.begin();
		Query q = em.createQuery("Update DTO_Data d set email='" + a1.getEmail() + "' where number='" + a1.getNumber() + "'");
		q.executeUpdate();
		et.commit();
		System.out.println("Your Email updated successfully");
		System.out.println(
				"Do you want to update another Data??\n1=>Update another Data\n2=>Back to Profile Page\n3=>Logout from Website");
		int n = sc.nextInt();
		if (n == 1) {
			Update.update(li);
		} else if (n == 2) {
			Profile.profile(li);
		} else if (n == 3) {
			WelcomePage.main(null);
		}
	}

	public static void UpdatePassword(List<DTO_Data> li) {
		// TODO Auto-generated method stub
		
		System.out.println("You have select to change your password");
		System.out.println("Enter your Mobile Number");
		long number = sc.nextLong();
		if (Validate.UpdateNumber(number, "Update your Password")) {
			for (DTO_Data d : li) {
				if (d.getNumber() == number) {
					a1.setNumber(number);
				} else {
					System.out.println("you have Entered Incorrect Mobile Number\nPlease Try Again");
					UpdateDetails.UpdatePassword(li);
				}
			}
		} else {
			System.out.println("Mobile Number Not Valid\n Please Try Again");
			UpdateDetails.UpdatePassword(li);
		}
		System.out.println("Enter your Old password");
		String oldpass = sc.next();
		if (Validate.password(oldpass)) {
			for (DTO_Data d : li) {
				if (d.getPassword().equals(oldpass)) {
					System.out.println("Enter a New password");
					String pass = sc.next();
					System.out.println("Re-Enter New password");
					String pass1 = sc.next();
					if (Validate.password(pass) && Validate.password(pass1)) {
						if (pass.equals(pass1)) {
							a1.setPassword(pass);
						} else {
							System.out.println("Re-Entered password doesn't Match\nTry Again");
							UpdatePassword(li);
						}
					} else {
						System.out.println(
								"password does't match formate \npassword must contain atleast one uppercase,lowercase,special Character and Number\nPlease Try Again");
						UpdatePassword(li);
					}
				}

				else {
					System.out.println("Please Try Again, Incorrect Password");
					System.out.println("Have you forgot password??\n1=>Forgot password\n2=>Try Again");
					int n = sc.nextInt();
					if (n == 1) {
						ForgotPassword.forgot();
					} else if (n == 2) {
						UpdatePassword(li);
					}
				}
				et.begin();
				Query q = em.createQuery(
						"Update DTO_Data d set password='" + a1.getPassword() + "' where number='" + a1.getNumber() + "'");
				q.executeUpdate();
				et.commit();
				System.out.println("Your Password updated successfully");
				System.out.println(
						"Do you want to update another Data??\n1=>Update another Data\n2=>Back to Profile Page\n3=>Logout from Website");
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
	}

	public static void UpdateNumber(List<DTO_Data> li) {
		// TODO Auto-generated method stub
		
		System.out.println("You have select to change your Mobile Number");
		System.out.println("Enter your Mobile Number");
		long number = sc.nextLong();
		if (Validate.UpdateNumber(number, "Update your Mobile Number")) {
			for (DTO_Data d : li) {
				if (d.getNumber() == number) {
					a1.setNumber(number);
				} else {
					System.out.println("you have Entered Incorrect Mobile Number\nPlease Try Again");
					UpdateDetails.UpdateNumber(li);
				}
			}
		} else {
			System.out.println("Mobile Number Not Valid\n Please Try Again");
			UpdateDetails.UpdateNumber(li);
		}
		System.out.println("Enter your New Mobile Number");
		long number1 = sc.nextLong();
		if (Validate.number(number1)) {
		  
		} else {
			System.out.println("Please Try Again, Entered invalid Mobile Number");
			UpdateDetails.UpdateNumber(li);
		}
		et.begin();
		 Query q = em.createQuery(
				"Update DTO_Data d set number='" + number1 + "' where number='" + a1.getNumber() + "'");
		q.executeUpdate();
		et.commit();
		System.out.println("Your Number updated successfully");
		System.out.println(
				"Do you want to update another Data??\n1=>Update another Data\n2=>Back to Profile Page\n3=>Logout from Website");
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

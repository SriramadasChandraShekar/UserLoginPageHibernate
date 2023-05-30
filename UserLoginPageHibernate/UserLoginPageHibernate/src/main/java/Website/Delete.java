package Website;

import java.util.List;

import javax.persistence.Query;

public class Delete extends Signin {

	public static void deleteAccount(List<DTO_Data> li) {
		// TODO Auto-generated method stub
		
		System.out.println(
				"Do You Really Want to Delete your Accoount from Webiste????:(\nGive a Command 'YES' to Conform");
		String s = sc.next();
		if (s.equalsIgnoreCase("YES")) {
			System.out.println("Enter your Mobile Number");
			long number = sc.nextLong();
			if (Validate.UpdateNumber(number, "Delete your Account")) {
				for (DTO_Data d : li) {
					if (d.getNumber() == number) {
						a1.setNumber(number);

					} else {
						System.out.println("you have Entered Incorrect Mobile Number\nPlease Try Again");
						deleteAccount(li);
					}
				}
			} else {
				System.out.println("Mobile Number Not Valid\n Please Try Again");
				deleteAccount(li);
			}
			et.begin();
			Query q = em.createQuery("delete from DTO_Data d where number='" + a1.getNumber() + "'");
			q.executeUpdate();
			et.commit();
			System.out.println("Your Profile Deleted successfully");
			WelcomePage.main(null);
		}
	}

}

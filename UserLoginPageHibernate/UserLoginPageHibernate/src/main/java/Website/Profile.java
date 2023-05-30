package Website;

import java.util.List;

import javax.persistence.Query;

public class Profile extends Signin{

	public static void profile(List<DTO_Data> li) {
		// TODO Auto-generated method stub
		
		System.out.println("In this Website you can perform following operations");
		System.out.println("1=>Display Your profile Data\n2=>Update Any your Details\n3=>Delete your profile from Website\n4=>Logout from Website");
		int key=sc.nextInt();
		switch (key) {
		case 1:
			GetData.profileData(li);
			break;
		case 2:
			Update.update(li);
			break;
		case 3:
			Delete.deleteAccount(li);
			break;
		case 4:
			WelcomePage.main(null);
		default:
			System.out.println("Incorrect key Entered\nTry Again");
			Profile.profile(li);
			break;
		}
		
	}

}

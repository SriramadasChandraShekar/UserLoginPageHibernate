package Website;

import java.util.List;

import javax.persistence.Query;

public class Update extends Signin{

	public static void update(List<DTO_Data> li) {
		// TODO Auto-generated method stub
		 System.out.println("You have selected to Update your Data");
		 System.out.println("1=>update your Name\n2=>update your Number\n3=>update your Date of Birth\n4=>update your Gender\n5=>update your Email\n6=>update your Password");
		int key=sc.nextInt();
		 switch (key) {
		case 1:
			UpdateDetails.UpdateName(li);
			break;
		case 2:
			UpdateDetails.UpdateNumber(li);
			break;
		case 3:
			UpdateDetails.UpdateDob(li);
			break;
		case 4:
			UpdateDetails.UpdateGender(li);
			break;
		case 5:
			UpdateDetails.UpdateEmail(li);
			break;
		case 6:
			UpdateDetails.UpdatePassword(li);
			break;
		
		default:
			break;
		}
	}

}

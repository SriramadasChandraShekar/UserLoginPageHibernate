package Website;

import java.util.List;

import javax.persistence.Query;

public class GetData extends Signin{

	public static void profileData(List<DTO_Data> li) {
		// TODO Auto-generated method stub
		
		for (DTO_Data d : li) {
			System.out.println("Name: "+d.getName()+"\n"+"Mobile Number: "+d.getNumber()+"\n"+"Date of Birth: "+d.getDob()+"\n"+"Gender: "+d.getGen()+"\n"+"Email: "+d.getEmail());
		}
		System.out.println("1=>Back to Website\n2=>Logout");
		int n=sc.nextInt();
		if(n==1) {
			Profile.profile(li);
		}
		else if(n==2) {
			WelcomePage.main(null);
		}
		else {
			System.out.println("Selected invalid key please try Again");
			profileData(li);
		}
	}
}

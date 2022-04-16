import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		System.out.println("Username");
		Scanner sc=new Scanner(System.in);
		String userString = sc.nextLine();
		System.out.println("Password");
		String passwordString = sc.nextLine();
		System.out.println("Displayed Name");
		String nameDisplayed = sc.nextLine();
		System.out.println(" p for Producer // c for Customer ");
		String type = sc.nextLine();
		Credential credential= new Credential(userString,passwordString);
		Registration registration = new Registration(nameDisplayed,credential,type);
		System.out.println(registration.signup());
		
		
		//product addition
		System.out.println("choose (write the number next to type) a product type or write a product type system will automatically add it");
		
		

	}

}

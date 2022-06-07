package Practice;
import java.util.Scanner;

public class Ps02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter your income in lakhs ");
		float income = sc.nextFloat();
		float tax = 0;
		
		if(income<=2.5f) {
			tax =tax + 0;
		}
		else if(income>2.5f && income<=5f) {
			tax = tax + 0.05f*(income - 2.5f);
		}
		else if(income>5f && income<=10f) {
			tax = tax + 0.05f*(2.5f);
			tax = tax + 0.2f*(income - 5f);
		}
		else if(income > 10f) {
			tax = tax + 0.05f*(2.5f);
			tax = tax + 0.2f*(5f);
			tax = tax + 0.3f*(income - 10f);
		}
		System.out.println("You have to pay tax of Rs." + tax);*/
		
		System.out.println("Enter your day ");
		int day = sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		
		
		
	}

}

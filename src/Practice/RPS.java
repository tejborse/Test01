package Practice;
import java.util.Random;
import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 0 for Rock, 1 for Paper & 2 for Scissor");
		
		int You=0;
		int Pc=0;
		for(int i=1; i<=5; i++) {
			System.out.println("");
			System.out.println("Enter input for Round "+ i);
			int myTurn = sc.nextInt();
			if(myTurn !=0 && myTurn !=1 && myTurn !=2) {
				System.out.println("Invalid input");
				System.exit(1);
			}
			
			switch(myTurn) {
			case 0:
				System.out.println("You chose Rock");
				break;
			case 1:
				System.out.println("You chose Paper");
				break;
			case 2:
				System.out.println("You chose Scissor");
				break;
			}
			
			Random rand = new Random();
			int random_num = rand.nextInt(3);
			
			switch(random_num) {
			case 0:
				System.out.println("Pc chose Rock");
				break;
			case 1:
				System.out.println("Pc chose Paper");
				break;
			case 2:
				System.out.println("Pc chose Scissor");
				break;
			}
			
			
			if(myTurn == random_num) {
				System.out.println("Match is tie");
			}
			else if(myTurn ==0 && random_num ==2 || myTurn ==1 && random_num ==0 || myTurn ==2 && random_num ==1) {
				System.out.println("You won the match");
				You++;
			}
			else {
				System.out.println("Pc won the match");
				Pc++;
			}
		
		}
		
		if(You>Pc){
			System.out.println("\n\"You won "+ You +" matches out of 5 hence you won the series\"");
		}
		else if(You==Pc) {
			System.out.println("\n\"Series is tie\"");
		}
		else {
			System.out.println("\n\"Pc won "+ Pc +" matches out of 5 hence Pc won the series\"");
		}
	}

}

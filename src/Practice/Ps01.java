package Practice;
import java.util.Scanner;

public class Ps01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*int sub1,sub2,sub3;
		
		System.out.println("Enter the total marks :");
		float totmks = sc.nextInt();
		System.out.println("Enter the marks in sub1 :");
		sub1 = sc.nextInt();
		System.out.println("Enter the marks in sub1 :");
		sub2 = sc.nextInt();
		System.out.println("Enter the marks in sub1 :");
		sub3 = sc.nextInt();
		
		int sum = sub1+sub2+sub3;
		
		System.out.println("Percent you got is ");
		System.out.println(sum/totmks*100);*/
		
		
		String s = "I am good and I am having a good day";
		String [] s1 = s.split(" ");
		int c=0;
		
		for(int i=0; i<s1.length; i++) {
			c=0;
			for(int j=0; j<s1.length-1; j++) {
				String a = s1[i];
				String b = s1[j];
				
				if(j<i && b.contentEquals(a))
				{
					break;
				}
				if(b.contentEquals(a)) 
				{
					c++;
				}
				if (j == s1.length - 1)
				{
	                System.out.println(s1[i] + " is present " + c + " number of times");
	            }
			}	

		}
		
		
		
		

	}

}

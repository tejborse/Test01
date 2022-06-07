package Practice;
import java.util.Scanner;
public class FindFrequency {
	
	int [] arr = new int [10];
	int key;
	
	void getData() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.println("Enter the No ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the no whos frequency has to find ");
		key = sc.nextInt();
	}
	
	void count() {
		int count = 0;
		for(int i=0; i<10; i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		System.out.println("Frequency = " + count);
	}

	public static void main(String[] args) {
		FindFrequency aa = new FindFrequency();
		aa.getData();
		aa.count();
	}

}

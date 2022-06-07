package Practice;
import java.util.Scanner;
public class Frequently_Asked {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		/*Prime no or not
		int tot = 0;
		for(int i=1; i<=100; i++) {
			int count = 0;
			
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count ++;
				}
			}
			if(count==2) {
				System.out.print(i + " ");
				tot += 1;
			}
		}
		System.out.println("\n" + tot);*/
		
		
		/*Fibonacci series upto 55
		System.out.println("Enter the last no");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a + " " + b);
		for(int i=0; i<=99; i++) {
			c =a + b;
			System.out.print(" " + c);
			if(c== n){
				break;
			}
			a=b;
			b=c;	
		}*/
		
		/*Fibonacci series with first 10 
		int a = 0;
		int b = 1;
		int c;
		int n = 2;
		System.out.print(a + " " + b);
		for(int i=0; i<=99; i++) {
			c =a + b;
			System.out.print(" " + c);
			n++;
			if(n==10 ){
				break;
			}
			a=b;
			b=c;	
		}*/
		
		
		/*Pat1
		for(int i=0; i<4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println("");
		}*/
		
		
		/*Pat2
		System.out.println("Enter the no of rows ");
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*"+ " ");
			}
			System.out.println("");
		}*/
		
		
		/*Pat3
		System.out.println("Enter the no of rows ");
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		
		/*Reverse a no without using variable
		System.out.println("Enter the no ");
		int n = sc.nextInt();
		
		int rev = 0;
		while (n!=0) {
			rev = rev*10 + n%10;
			n = n / 10;
		}
		System.out.println(rev);*/
		
		
		/*Reverse two no's without using variable
		int a = 10;
		int b = 20;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.print(a + " " + b);*/
		
		
		/*Write a Program to copy all elements of one array into another array
		int [] arr1 = {12,10,15,8,4};
		int [] arr2 = new int[5];
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		for(int a : arr1) {
			System.out.print(a + " ");
		}
		System.out.println("");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();*/
		
		
		/*write a Program to print the duplicate elements of an array
		int [] arr = new int[8];
		for(int i=0; i<8; i++ ) {
			System.out.println("Enter the number" );
			arr[i] = sc.nextInt();
		}
		System.out.println("Duplicate elements are ");
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<8; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}*/
		
		
		/*write a program to find out smallest element in an array
        int [] arr = new int [] {25, 11, 7, 75, 56};    
        int min = arr[0];  
     
        for (int i = 0; i < arr.length; i++) {   
           if(arr[i] <min) {  
               min = arr[i]; 
           }
        }  
        System.out.println("Smallest element present in given array: " + min);*/ 
		
		
		/*write a program to find out biggest element in an array
		int [] arr = new int [] {25, 11, 7, 75, 56};    
        int max = arr[0];  
     
        for (int i = 0; i < arr.length; i++) {   
           if(arr[i] > max) {  
               max = arr[i]; 
           }
        }  
        System.out.println("Biggest element present in given array: " + max);*/
		
		
		/*write a  program to print the sum of all the items of the array
		int [] arr = new int [5];
		for(int i=0; i<5; i++) {
			System.out.println("Enter the number" );
			arr[i]= sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of no's in given array is " + sum);*/
		
		
		
		/*write a Program to count the total number of characters in a string
		String str = "Tejas Prashant Borse";
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!= ' ') {
			cnt++;
			}
		}
		System.out.println(cnt);*/
		
		
		
		/*/write a Program to count the total number of vowels in a string.
		String str = "Tejas Prashant Borse";
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
			cnt++;
			}
		}
		System.out.println("Number of vowels is " + cnt);*/
		
		
		/*write a Program to determine whether a given string is palindrome
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Given string is panlindrome");
		}
		else {
			System.out.println("Given string is not panlidrome");
		}*/
		
		
		
		/*write a program to Reverse the string
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reversed String is " + rev);*/
		
		
		/*Pat4
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j*i + " ");
			}
			System.out.println();
		}*/
		
		
		//Pat5
		
		
	}

}

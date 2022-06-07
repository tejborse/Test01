package Practice;
import java.util.Scanner;

public class interview {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*String str1 = "abc";
		String str2 = "xyz";
		String str3 = "pqr";

		//str1 = str1.concat(str2);
		//str1 = str1.concat(str3);
		str1 = str1.concat(str2).concat(str3);
		System.out.println(str1);*/
		
		
		/*String s1 = "Tejas,Prashant,Borse";
		String [] newString = s1.split(",");
		
		for(String a : newString) {
			System.out.println(a);
		}*/
		
		
		/*int a = 10;
		int b = 20;
		int largeNo = a>b?a:b;
		System.out.println(largeNo);*/
		
		
		/*String s2 = "TejasBORSE";
		int upper = 0;
		int lower = 0;
		
		for(int i=0; i<s2.length(); i++) {
			char ch = s2.charAt(i);
			if(ch>='A' && ch<='Z' ) {
				upper++;
			}
			else {
				lower++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);*/
		
		
		
		/*Factorial
		System.out.println("Enter the no ");
		int n = sc.nextInt();
		int factorial = 1;
		for(int i=1; i<=n; i++) {
			factorial = factorial * i;
		}
		System.out.println("factorial of " + n + " is " +  factorial);*/
		
		
		
		/*Reverse a No
		System.out.println("Enter the no ");
		int n = sc.nextInt();
		int reverse = 0;
		while(n != 0) {
			reverse = reverse*10 + n%10;
			n = n/10;
		}
		System.out.println(reverse);*/
		
		
		
		/*Palindrome
		System.out.println("Enter the no ");
		int n = sc.nextInt();
		int rev = 0;
		int a = n;
		while(a != 0) {
			rev = rev *10 + a%10;
			a = a/10;
		}
		if (rev == n) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number isn't Palindrome");
		}*/
		
		
		
		/*Armstrong
		System.out.println("Enter the no ");
		int n = sc.nextInt();
		int sum = 0;
		int a = n;
		while(a != 0) {
			sum = sum + (a%10) * (a%10) *(a%10);
			a = a/10;
		}
		if (sum == n) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number isn't Armstrong");
		}*/
		
		
		
		
		/*Print the Armstrong number available between 0 to 1000
		for(int i=1; i<=1000; i++) {
			int sum = 0;
			int a = i;
			while(a != 0) {
				sum = sum + (a%10) * (a%10) *(a%10);
				a = a/10;
				}
			if (sum == i) {
				System.out.println(i);
			}
		}*/
		
		
		
		
		/*To print the palindrome available between 0 to 100
		for(int i=1; i<=100; i++) {
			int rev = 0;
			int a = i;
			while(a!=0) {
				rev = rev*10 + a%10;
				a = a/10;
			}
			if(rev == i) {
				System.out.println(i);
			}
		}*/
		
		
		
		/* Print the count of the given number
		System.out.println("Enter the no ");
		int n = sc.nextInt();
		int cnt = 0;
		while(n!=0) {
			n = n/10;
			cnt++;
		}
		System.out.println("No of digits in given number is "+ cnt);*/
		
		
		
		/* Find the Sum of the digit
		System.out.println("Enter the no ");
		int n = sc.nextInt();
		int sum = 0;
		while(n!=0) {
			sum = sum + n%10;
			n = n/10;
		}
		System.out.println(sum);*/
		
		
		
		
		/*Pattern
		System.out.println("Enter the no of rows ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1; i<n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*(n-i)-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		
		
		//Fibonacci series:
		/*int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i = 1; i<10; i++) {
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}*/
		
		
		
		/*Fibonacci series: upto 100
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i = 1; i<11; i++) {
			c = a+b;
			System.out.println(c);
			if (c>=100) {
				break;
			}
			a=b;
			b=c;
		}*/
		
		
		
		
		/*Reverse a string
		System.out.print("Enter the String - ");
		String s = sc.nextLine();
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev +  s.charAt(i);
		}
		System.out.println(rev);*/
		
		
		
		
		/*Count a string
		System.out.print("Enter the String - ");
		String s = sc.nextLine();
		int c=0;
		for(int i=0; i<s.length(); i++) {
			c++;
		}
		System.out.println(c);*/
		
		
		
		
		//Count of each Word in given string
		/*String s = "I am good and I am having good day";
		String [] s1 = s.split(" ");
		
		for(int i=0; i<s1.length; i++) {
			int cnt=0;
			for(int j=0; j<s1.length; j++) {
				String a = s1[i];
				String b = s1[j];
				
				if(j<i && b.contentEquals(a))
				{
					break;
				}
				if(b.contentEquals(a)) 
				{
					cnt++;
				}
				if (j == s1.length - 1)
				{
	                System.out.println(s1[i] + " is present " + cnt + " number of times");
	            }
			}	
		}*/

		/*String input = "Table is this Table with";
	    String[] arr1 = input.split(" ");
	    int count = 0;

	    for (int i = 0; i < arr1.length; i++) {
	        count = 0;

	        for (int j = 0; j < arr1.length; j++) {
	            String temp = arr1[j];
	            String temp1 = arr1[i];

	            if (j < i && temp.contentEquals(temp1)) {
	                break;
	            }
	            if (temp.contentEquals(temp1)) {
	                count = count + 1;
	            }
	            if (j == arr1.length - 1) {
	                System.out.println(">>" + arr1[i] + "<< is present >>" + count + "<< number of times");
	            }
	        }
	    }*/
		
		
		
		
		//Count the frequency of characters in a given String
		/*String s = "I am good and having good day";
		s = s.replace(" ", "");
		char [] s1 = s.toCharArray();
		
		for(int i=0; i<s1.length; i++) {
			int cnt=0;
			for(int j=0; j<s1.length; j++) {
				char a = s1[i];
				char b = s1[j];
								
				if(j<i && (b==a))
				{
					break;
				}
				if(b==a) 
				{
					cnt++;
				}
				if (j == s1.length - 1)
				{
	                System.out.println(s1[i] + " is present " + cnt + " number of times");
	            }
			}	
		}*/
		
		
		
		//Print the numbers in array in  a ascending order in java
		/*System.out.println("Enter the no of elements you want in array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter the element No - " + i);
			arr[i] = sc.nextInt();
		}
		int temp;
		//[90,40,20,60,80]
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr [i] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		for (int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}*/

		
		
		
		//Print the numbers in array in  a Descending order in java
		/*System.out.println("Enter the no of elements you want in array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter the element No - " + i);
			arr[i] = sc.nextInt();
		}
		int temp;
		//[90,40,20,60,80]
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr [i] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		for (int i = 0; i < n; i++)
		{
			System.out.print(arr[i] + " ");
		}*/
		
		
		
		
		
		//Print the prime numbers counts available between 1 to 100
		/*int count, c = 0;
		for (int i = 1; i <= 100; i++) {
			count = 0;
			for (int j = 2; j <=i/2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				c++;
			}
		}
		System.out.println(c);*/
		
		
		
		
		//Biggest Number
		/*int a=50, b=80, c=20;
		if(a>b && a>c) {
			System.out.println(a);
		}
		else if (b>a && b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}*/
		
		
		
		
		//ThirdMax Number
		/*int a[]={-12,45,-23,64,-100,24};
		int temp;
		for(int i=0; i<6; i++) {
			for(int j=i+1; j<6; j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0; i<6; i++) {
			if(i==2) {
				System.out.println("ThirdMax number is "+ a[i]);
			}
		}*/
		
		
		
		
		
		
		//Separate reverse of each word in the string
		/*String s = "Tejas Borse";
		String a[] = s.split(" ");
		String rev="";
		for(int i=0; i<a.length; i++) {
			String temp = a[i];
			for(int j=temp.length()-1 ; j>=0; j--) {
				char ch = temp.charAt(j);
				rev = rev + ch;
			}
		rev = rev + " ";
		}
		System.out.println(rev);*/
		
		
		
		

		/*Find the duplicate count in an array
		int n,count=0;
		System.out.print("Enter no. of elements you want in array: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the numbers: ");
		for (int i = 0; i < n; i++)
		{
		a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
		for (int j = i + 1; j < n; j++)
		{
		if(a[i]==a[j]) {
		count++;
		}
		}}
		System.out.println(count);*/
		
		
		
		
		
		/*Find the duplicate count in the string
		String str = "beautiful beach";
		char[] carray = str.toCharArray();
		System.out.println("The string is:" + str);
		System.out.print("Duplicate Characters in above string are: ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (carray[i] == carray[j]) {
					System.out.print(carray[i] + " ");
					break;
				}
			}
		}*/
		
		
		
		
		
		
		//Count of the palindrome number
		/*int c=0;
		for (int i = 1; i <= 1000; i++) {
			int a=i;
			int rev = 0;
			while (a != 0) {
				rev = rev * 10 + (a % 10);
				a = a / 10;
			}
			if (rev == i) {
				c++;
			}
		}
		System.out.println(c);*/
		
		
		
		
		
		
		
		// Count of the palindrome number
		/*int c = 0;
		for (int i = 1; i <= 1000; i++) {
			int a = i;
			int sum = 0;
			while (a != 0) {
				int n = a%10;
				sum = sum + (n*n*n);
				a = a / 10;
			}
			if (sum == i) {
				c++;
			}
		}
		System.out.println(c);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	      
	 

	}
}

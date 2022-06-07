package Practice;
import java.util.Scanner;
public class Ps04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*01
		float [] marks = {12.5f,10f,15.5f,8.5f,4.2f};
		
		float sum=0;
		for(float element : marks) {
			sum = sum +element;
		}
		System.out.println("Sum of Marks is "+ sum);*/
		
		
		/*02
		int [] marks = {12,10,15,8,4};
		System.out.println("Enter the value ");
		int num = sc.nextInt();
		boolean isInArray = false;
		
		for(float element : marks) {
			if(num==element) {
				isInArray =true;
				break;
			}
		}
		if(isInArray) {
			System.out.println("Given num is present in Array");
		}
		else {
			System.out.println("Given num is not present in Array");
		}*/
		
		
		/*03
		float [] marks = {12.5f,10f,15.5f,8.5f,4.2f};
		
		float sum=0;
		for(float element : marks) {
			sum = sum +element;
		}
		System.out.println("Average of Marks is "+ sum/marks.length);*/
		
		/*04
		int [] [] mat1 = {{1,2,3},
							{4,5,6}};
		int [] [] mat2 = {{3,4,5},
							{6,7,8}};
		int [] [] result = {{0,0,0},
							{0,0,0}};
		
		for(int i=0; i<mat1.length; i++) {
			for(int j=0; j<mat1[i].length; j++) {
				result[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}*/
		
		
		/*05
		String [] str = {"a","e","i","o","u","h","k"};
		int l = str.length;
		String temp;
		
		for(int i=0; i<(l/2); i++) {
			temp = str[i];
			str[i] = str[l-1-i];
			str[l-1-i] = temp;
		}
		for(String element : str) {
			System.out.print(element + " ");
		}*/
		
		
		/*06
		float [] marks = {12.5f,10f,15.5f,8.5f,4.2f};
		float max = 0;
		for(int i=0; i<marks.length; i++) {
			if(marks[i] > max) {
			max = marks[i];}
		}
		System.out.println(max);*/
		
		
		/*07
		float [] marks = {12.5f,10f,15.5f,8.5f,4.2f};
		float min = Float.MAX_VALUE;
		for(int i=0; i<marks.length; i++) {
			if(marks[i] < min) {
			min = marks[i];}
		}
		System.out.println(min);*/
		
		
		/*08
		int [] arr = {12,10,15,8,4};
		boolean isSorted = true;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				isSorted = false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("Array is sorted");
		}
		else {
			System.out.println("Array is not sorted");
		}*/
	}

}

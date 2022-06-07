
public class NestedIfElse {
	
	public static void main(String[] args) {
		int i=10, j=20, k=30;
		
		if(i>j & i>k)                                  //& checks all the given conditions while 
			                                           //&& stops when it finds true condition  
		{
			System.out.println("i is graeter "+ i);
		}
		else if(j>i & j>k)
		{
			System.out.println("j is greater "+ j);
		}
		else
		{
			System.out.println("k is greater "+ k);
		}
	}

}

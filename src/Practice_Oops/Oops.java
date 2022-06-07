package Practice_Oops;

//OOps Special
class Employee {
	
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
}	
	
class Cellphone{
	
	public void ringing() {
		System.out.println("Ringing...");
	}
	public void vibrating() {
		System.out.println("Vibrating...");
	}
}

class Square{
	int side;
	public int getArea() {
		return side*side;
	}
	public int getPerimeter() {
		return 4*side;
	}
}

public class Oops{
	public static void main(String args[]) {
		
		Employee tej = new Employee();
		tej.setName("Tejas");
		System.out.println(tej.getName());
		
		tej.salary = 200;
		System.out.println(tej.getSalary());
		
		
		Cellphone lg = new Cellphone();
		lg.vibrating();
		lg.ringing();
		
		
		Square sq = new Square();
		sq.side = 5;
		System.out.println(sq.getArea());
		System.out.println(sq.getPerimeter());
		
		
	}
}

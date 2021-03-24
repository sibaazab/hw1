package hw1;

public class assignment1 {

	public static void main(String[] args) {
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		int z= Integer.parseInt(args[2]);
		if (x<=0 || y<=0 || z<=0)
			System.out.print("Invalid input!");
		if (x+y<z && x+z<y && y+z<x) {
			if (x*x+y*y==z*z || x*x+z*z==y*y || y*y+z*z==x*x) 
				System.out.println("The input ("+x+", "+y+", "+z+") defines avalid right triangle!");
			
			else
				System.out.println("The input ("+x+", "+y+", "+z+") defines avalid triangle!");
		}
		else 
			System.out.println("The input ("+x+", "+y+", "+z+") does not define valid right triangle!");

	}

}

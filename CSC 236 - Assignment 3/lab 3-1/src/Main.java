//Mark Pinto
//Lab 3-1
//CSC 236-62
public class Main 
{
	public static void main(String[]args)
	{
		PolynomialADT one = new Polynomial();
		one.addLast(4,3);
		one.addLast(3,2);
		one.addLast(-5,0);
		
		PolynomialADT two = new Polynomial();
		two.addLast(3,3);
		two.addLast(2,2);
		two.addLast(7,1);
		two.addLast(12,0);
		
		PolynomialADT three = new Polynomial();
		three.addPoly(one,two,three);
		
		System.out.print("Polynomial one:");
		System.out.println(one);
		System.out.print("Polynomial two:");
		System.out.println(two);
		System.out.print("Polynomial after adding one and two:");
		System.out.println(three);
	}
}

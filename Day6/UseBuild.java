/*In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods.*/

import Day5.arithmetic.Arithmetic;
import Day5.Stringutils.StringUtils;
import java.util.Scanner;

class UseBuild{

	public static void main(String[] args){
		
	Scanner scan=new Scanner(System.in);
	
	StringUtils su=new StringUtils();

	Arithmetic ar=new Arithmetic();
		System.out.println("Enter the first number");
		int a= scan.nextInt();
		System.out.println("Enter the second number");
		int b=scan.nextInt();
		System.out.println("The numbers addition: "+ ar.add(a,b));
		System.out.println("The numbers subraction: "+ ar.sub(a,b));
		System.out.println("The numbers multiply: "+ ar.mul(a,b));
		System.out.println("The numbers division: "+ ar.div(a,b));
		System.out.println("The numbers modulos: "+ ar.mod(a,b));

		System.out.println("Enter the string");	
		scan.nextLine();
		String s1=scan.nextLine();
		System.out.println(su.conCat(s1," Zoho"));
		System.out.println(su.length(s1));
		System.out.println(su.reverse(s1));

		
		
	}
}

import java.util.Scanner;

public class IT26102367Lab04Q3{
	public static void main(String[]args){
		
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter a number: ");
		int num= input.nextInt();
		
		String result=(num>0)?"Positive"
		:(num<0)?"Negative"
		:"Zero";
		
		System.out.print("The number is "+ result);
	}
}
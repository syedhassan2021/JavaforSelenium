import java.util.Scanner;

public class Inputdemo {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int overtime;
		System.out.print("Enter your hour:");
		overtime = input.nextInt();
		System.out.println("Your overtime amoutn is "+overtime*1.25);
		
		
	}
}


package fcu.iecs.oop.password;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		
		PasswordEncorder s = new PasswordEncorder();
		
		Scanner scanner  = new Scanner(System.in);
		
		int a=0;
		
		while (a==0){
			
		System.out.println("Please enter a password:");
		
		String str=scanner.next();
		
		if(str.equalsIgnoreCase("exit"))
		{
		System.out.println("end.");
		
		break;
		
		}
		System.out.println(s.encode(str));
		
		}
	}

}
package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		NissanTiida a  = new NissanTiida();
		
		Scanner scanner  = new Scanner(System.in);
		
		int T=scanner.nextInt();
		
		int y=1;
		
		for (y=1;y<=T;y++)
		{
		System.out.printf("²Ä%d¦¸©I¥s\n",y);
		a.tiida();
		}
	}

}

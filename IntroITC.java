
import java.util.Scanner;
public class IntroITC {

public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	System.out.print("Introduce el año: ");
	int a = lector.nextInt();

	if (a%400==0) {
		System.out.println("El año es bisisesto");

	} else if ((a%100==0) && (a%4==0)){
		System.out.println("El año no es bisisesto");
	}
}



}

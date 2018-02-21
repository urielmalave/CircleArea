import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of circle: ");
		int r=sc.nextInt();
		double area = Math.PI*r*r;
		double halfArea = area/2;

		System.out.println(halfArea);

	}
}		

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=s.nextInt();
		if(n%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}

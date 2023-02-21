import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter only positive numbers seperated by a space. Then press enter");
		Scanner fred = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int input = -1;
		
		input = fred.nextInt();
		while(input>=0) {
			list.add(input);
			input = fred.nextInt();
		}
		fred.close();
		System.out.println("Raw list: " + list.toString());
		
		int sum = 0;
		for(int i = 0; i < list.size(); ++i) {
			sum = sum + list.get(i);
		}
		System.out.println("Sum: " + sum);
	}
}

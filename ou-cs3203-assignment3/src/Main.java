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
		System.out.println("Raw list: " + list.toString());
		
		System.out.println("Enter 1 to find sum, 2 to find product, or 3 to find both.");
		int choice = fred.nextInt();
		if(choice == 1) {
			System.out.println("Sum: " + summation(list));
		}
		else if(choice == 2) {
			System.out.println("Product: " + product(list));
		}
		else if(choice == 3) {
			System.out.println("Sum: " + summation(list));
			System.out.println("Product: " + product(list));
		}
		
		fred.close();
	}
	
	public static int summation(ArrayList<Integer> list) {
		int sum = 0;
		for(int i = 0; i < list.size(); ++i) {
			sum = sum + list.get(i);
		}
		return sum;
	}
	
	public static int product(ArrayList<Integer> list) {
		int product = 1;
		for(int i = 0; i < list.size(); ++i) {
			product = product * list.get(i);
		}
		return product;
	}
}


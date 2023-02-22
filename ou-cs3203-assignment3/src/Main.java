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
		
		System.out.println("Enter 1 to find sum, 2 to find product, 3 to reverse array, or 4 to do all three.");
		int choice = fred.nextInt();
		if(choice == 1) {
			System.out.println("Sum: " + summation(list));
		}
		else if(choice == 2) {
			System.out.println("Product: " + product(list));
		}
		else if(choice == 3) {
			System.out.println("Reverse: " + reverse(list));
		}
		else if(choice == 4) {
			System.out.println("Sum: " + summation(list));
			System.out.println("Product: " + product(list));
			System.out.println("Reverse: " + reverse(list));
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
	
	public static ArrayList<Integer> reverse(ArrayList<Integer> list){
		ArrayList<Integer> copy = new ArrayList<Integer>();
		for(int i = list.size(); i > 0; --i) {
			copy.add(list.get(i-1));
		}
		return copy;
	}
}


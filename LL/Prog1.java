package LL;
import java.util.Scanner;
public class Prog1 
{
	public static void main(String Args[])
	{
		System.out.println("Welcome to program of Linked List");
		LinkedList list = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int opt=1,data,index;
		while(opt!=0)
		{
			System.out.println("Press 1 to insert");
			System.out.println("Enter 2 to insert at start");
			System.out.println("Enter 3 to insert in between");
			System.out.println("Enter 4 to show the linked list");
			System.out.println("Enter 5 to delete a node");
			System.out.println("Enter 0 to exit");
			opt = sc.nextInt();
			switch(opt) 
			{
				case 1:
					System.out.println("Enter the element");
					data = sc.nextInt();
					list.insert(data);
					break;
				case 2:
					System.out.println("Enter the element");
					data = sc.nextInt();
					list.insertAtStart(data);
					break;
				case 3:
					System.out.println("Enter the index and element");
					index = sc.nextInt();
					data = sc.nextInt();
					list.insertAt(index,data);
					break;
				case 4:
					list.show();
					break;
				case 5:
					System.out.println("please enter the index to be deleted");
					index = sc.nextInt();
					list.deleteAt(index);
					break;
				case 0:
					System.out.println("Thank you");
					opt = 0;
					break;
				default :
					System.out.println("Please enter a valid statement");
			}
		}
		sc.close();
	}
}

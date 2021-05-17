import java.util.Scanner;

public class Queue {
	static int queue[] = new int[5];
	static int rear, front = 0;

	public static void menu() {
		String m = "menu driven application \n";
		m += "1.insert \n";
		m += "2.delete \n";
		m += "3.display \n";
		m += "4.exit \n";
		System.out.println(m);
	}

	private static void insert(int ele) {
		if (isFull()) {
			System.out.println("queue is full");
		} else {
			queue[rear] = ele;
			System.out.println("element is inserted");
			rear++;

		}
	}

	private static boolean isFull() {
		boolean b = false;
		if (rear == queue.length) {
			b = true;
		}
		return b;
	}

	private static void delete() {
		if (isEmpty()) {
			System.out.println("queue is empty");
		} else {
			System.out.println("deleted element is " + queue[front]);
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
			rear--;
		}
	}

	private static boolean isEmpty() {
		boolean b = false;
		if (rear == front) {
			b = true;
		}
		return b;
	}

	private static void display() {
		if (isEmpty()) {
			System.out.println("queue is empty");
		} else {
			System.out.println("elements are\n");
			for (int i = front; i < rear; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			menu();
			System.out.println("choose one option");
			int option = sc.nextInt();
			switch (option) {

			case 1:
				System.out.println("enter an element to insert");
				int ele = sc.nextInt();
				insert(ele);
				break;

			case 2:
				delete();
				break;

			case 3:
				display();
				break;

			case 4:
				System.exit(0);

			default:
				System.out.println("invalid inputs");

			}
		}
	}
}

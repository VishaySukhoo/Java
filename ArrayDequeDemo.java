
//use array deque instead of stack class as deque will be faster
//deque works better than linked list for queues
import java.util.*;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		// Intializing an deque
		Deque<Integer> de_que = new ArrayDeque<Integer>();

		// add() method to insert
		de_que.offer(10); // offer returns a true or false if successful
		de_que.add(20); // add returns an exception if error is found
		de_que.add(30);
		de_que.add(40);
		de_que.add(50);
		for (Integer element : de_que) {
			System.out.println("Element : " + element);
		}

		System.out.println("Emptying deque");
		de_que.clear();
		System.out.println("Above elements are removed now");

		de_que.addFirst(564);
		de_que.addFirst(291);
		de_que.addLast(24);
		de_que.addLast(14);

		System.out.println("Elements of deque using Iterator :");
		for (Iterator itr = de_que.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}

		System.out.println("Elements of deque in reverse order :");
		for (Iterator dItr = de_que.descendingIterator(); dItr.hasNext();) {
			System.out.println(dItr.next());
		}

		System.out.println("\nHead Element using element(): " + de_que.element());

		System.out.println("Head Element using getFirst(): " + de_que.getFirst());

		System.out.println("Last Element using getLast(): " + de_que.getLast());

		Object[] arr = de_que.toArray();
		System.out.println("\nArray Size : " + arr.length);

		System.out.print("Array elements : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i]);

		System.out.println("\nHead element peek : " + de_que.peek());

		System.out.println("Head element poll : " + de_que.poll()); // removes the first element

		de_que.push(265);
		de_que.push(984);
		de_que.push(2365);

		System.out.println("Head element remove : " + de_que.remove());

		System.out.println("The final array is: " + de_que);
	}
}

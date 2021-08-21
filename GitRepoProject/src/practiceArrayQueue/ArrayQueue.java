package practiceArrayQueue;

import java.util.NoSuchElementException;

public class ArrayQueue {

	private Employee[] queue;
	private int front;
	private int back;// rear

	public ArrayQueue(int size) {
		// TODO Auto-generated constructor stub
		queue = new Employee[size];

	}

	public void add(Employee emp) {
		if (back == queue.length) {
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArray, 0, queue.length);
			queue = newArray;

		}
		queue[back] = emp;
		back++;
	}

	public Employee remove() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}
		Employee emp = queue[front];
		queue[front] = null;
		front++;
		if (size() == 0) {
			front = 0;
			back = 0;

		}
		return emp;
	}

public Employee peek()
{
	if(size()==0)
	{
		throw new NoSuchElementException();	
	}
	return queue[front];
}

	public int size() {
		return back - front;

	}
	public void printQueue() {
		for(int i=front;i<back;i++)//front to back-1
		{
			System.out.println(queue[i]);
		}
	}
}

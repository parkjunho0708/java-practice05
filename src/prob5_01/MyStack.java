package prob5_01;

public class MyStack<T> {
	private int top;
	private T[] buffer;

	@SuppressWarnings("unchecked") // 알고하는 문법이니까 warning을 보여주지 말라는 어노테이션
	public MyStack(int capacity) {
		top = -1;
		buffer = (T[])new Object[capacity];
	}
	
	// push하기 전에 size 확인을 해주어야 함.
	public void push(T t) {
		if(top == buffer.length - 1) { // stack is full
			resize();
		}
		//top += 1;
		buffer[++top] = t;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public T pop() throws MyStackException{
		if(isEmpty()) {
			throw new MyStackException();
		}
		
		T result = buffer[top];
		buffer[top] = null;
		top--;
		
		return result;
	}
	
	@SuppressWarnings({ "unchecked", "unused" })
	private void resize() {
		T[] temp = (T[])new Object[buffer.length * 2];
		
		// 이 작업을 많이하게 되면 CPU를 많이 쓰게 된다.
		for(int i = 0; i <= top; i++) {
			temp[i] = buffer[i];
		}
		
		buffer = temp;
	}
}
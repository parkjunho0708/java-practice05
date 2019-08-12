package prob5;

public class MyStack {
	private int top = -1;
	private String[] buffer;

	public MyStack(int size) {
		buffer = new String[size];
	}

	public void push(String strValue) {
		if (top >= buffer.length - 1) {// top이 buffer.length 클 때,
			String[] buffer2 = new String[buffer.length * 2];
			for (int i = 0; i < buffer.length; ++i) {
				buffer2[i] = buffer[i];
			}
			// buffer의 크기를 2배로 늘린다
			buffer = buffer2;
		}
		top++;
		buffer[top] = strValue;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public String pop() throws Exception {
		if (top < 0) {
			throw new MyStackException("Stack is empty.");
		}
		return buffer[top--];
	}
}
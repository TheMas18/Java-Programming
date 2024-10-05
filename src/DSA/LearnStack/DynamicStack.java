package DSA.LearnStack;

import java.util.Arrays;

//As we know stack can add more elements , instead of default size we can do this 

public class DynamicStack extends CustomStack {

	public DynamicStack() {
		super();
	}

	public DynamicStack(int size) {
		super(size);
	}

	@Override
	public boolean push(int item) {
		if (this.isFull()) {
			// double the array size
			int temp[] = new int[data.length * 2];

			// copy all previous items in new data
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data = temp;

		}
		return super.push(item);
	}

	public static void main(String[] args) throws StackException {
		DynamicStack stack=new DynamicStack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(52);
		stack.push(60);
		stack.push(32);
		stack.push(33);
		stack.push(35);
		stack.display();
		System.out.println("----------------");
		System.out.println("Popped Element : "+ stack.pop());
		System.out.println("----------------");
		stack.display();
		System.out.println("----------------");
		System.out.println("Peek Element : "+stack.pop());
	}
}

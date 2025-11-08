package Java8.Basic;

interface Employee {
	String getSal();
}

public class VariablesInLambdaexp {

	public static  void main(String[] args) {
		int x=10;
		Employee employee=()->{
			System.out.println(x);//we can access the instance variable
			return "100";
		};
		Employee e2=new Employee() {
			int y=5;//this is instance variable because its inner class we can access this using this
			@Override
			public String getSal() {
				System.out.println(this.y);//we can access the instance variable
				return "100";
			}
		};
		employee.getSal();
		e2.getSal();
	}
	
	
}

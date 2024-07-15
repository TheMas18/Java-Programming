package Collection.PriorityQueue;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private double cgpa;

	public Student(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	//   name      	cgpa    id                


	
	
	
	
	

	//   Samiha 	3.85    36
	//   Ashley 	3.9 	42	
	//	 Anik 		3.95  	49
	//	 Dan 		3.95  	50
    

	@Override
	public int compareTo(Student other) {
		if (this.cgpa != other.cgpa) {
			//System.out.println(this.getName()+Double.compare(other.cgpa, this.cgpa));
			return Double.compare(other.cgpa, this.cgpa);
		}
		else if(!this.name.equals(other.name)) {
			//System.out.println(this.getName()+this.name.compareTo(other.name));
			return this.name.compareTo(other.name);
		}
		else {
			//System.out.println(Integer.compare(this.id, other.id));
			return Integer.compare(this.id, other.id);
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	

}

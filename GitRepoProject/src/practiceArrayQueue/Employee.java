package practiceArrayQueue;

public class Employee {
	String fname; String lname; int s;
	
	public Employee(String fname, String lname, int s) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.s = s;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", s=" + s + "]";
	}

}

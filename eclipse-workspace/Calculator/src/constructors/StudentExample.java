package constructors;

public class StudentExample {
	
	public StudentExample() {
		System.out.println("Calling constructor");
	}
	String stName;
	int rollNumber;
	public StudentExample(String stName, int rollNumber) {
		this();
		this.stName = stName;
		this.rollNumber = rollNumber;
	}
	public static void main(String[] args) {
		StudentExample st = new StudentExample("Deepu", 444);
		System.out.println(st.stName);
		System.out.println(st.rollNumber);
		//StudentExample st1 = new StudentExample();
	}
	
}

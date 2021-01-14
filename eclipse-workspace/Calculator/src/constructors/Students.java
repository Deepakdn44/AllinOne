package constructors;

public class Students {

	private static final String Deepak = null;
	String StName;
	int RollNum;
	public Students() {
		System.out.println("Calling constructor");
	}
	
	public Students(String StName, int RollNum) {
		this();
		this.StName = StName;
		this.RollNum = RollNum;
	}
	public static void main(String[] args) {
		
		Students st = new Students("Deepak", 444);
		
		System.out.println(st.StName);
		System.out.println(st.RollNum);
		//new Students();
		
	}

}

package example;

public class Example {
	/*int i;
	public Example(int i) {
		this.i = i;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Example other = (Example) obj;
		if (i != other.i)
			return false;
		return true;
	}*/
	private static Example instance = new Example();
	private Example() {
		System.out.println("Object");
	}
	public static Example getInstance(){
		return instance;
	}




}

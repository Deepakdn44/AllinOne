package ReflectionExample;

public class Rough  {

	static {
		System.out.println("static");
		
		main(null);
	}
	public static void main(String[] args) {
		Example obj = new Example()
			{
				public void show() {
					System.out.println("Hello");
				}
			};
		obj.show();
	
		
		
	}
}

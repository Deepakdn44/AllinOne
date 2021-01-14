
public class ChildDriver extends Driver{

	public static void main(String[] args) 
	{

	}

	@Override
	public void click() {	
		System.out.println("Click");
	}

	@Override
	public void sendKeys() {
		System.out.println("SendKeys");
	}

	@Override
	public void getTitle() {
		System.out.println("Title");
	}

	@Override
	public void run() {
		System.out.println("Run");
	}
	void go()
	{
		System.out.println("go");
	}
}

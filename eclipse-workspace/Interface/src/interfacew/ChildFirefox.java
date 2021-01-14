package interfacew;

public abstract class ChildFirefox implements WebDriver, FirefoxDriver{
	
	public abstract void maximize();
	public void capturescreenshot() {
		System.out.println("Capturing screen shot");
	}
}

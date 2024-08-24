package week2.day1;

public class Browser {

	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
		
	}
	public void loadURL()
	{
		System.out.println("Application URL loaded successfully");
		
	}
	public static void main(String[] args)
	{
		Browser obj=new Browser();
		obj.launchBrowser(null);
		obj.loadURL();
		}
}

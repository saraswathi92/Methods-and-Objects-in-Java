package week2.day1;

public class EdgeBrowser {

	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched Successfully");
		return browserName;
	}
	public void loadURL()
	{
		System.out.println("URL loaded successfully");
	
	}
	public static void main(String[] args)
	{
		EdgeBrowser b=new EdgeBrowser();
		b.launchBrowser("Edge");
		b.loadURL();
	}
}



package week3.day1;

public class Safarichild  extends BrowserParent { 
	public static void main(String[] Args) {
		  
		 Safarichild s=new  Safarichild();
		System.out.println("This is from chrome");
		s.readerMode();
		s.fullScreenMode();
		s.closeBrowser();
		s.openUrl();
	}
public void readerMode()
{
	System.out.println("This is readermode");
}
public void  fullScreenMode()
{
	System.out.println("This is fullscreenmode");
}
}

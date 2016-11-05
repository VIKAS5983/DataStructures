package facebook;

import java.awt.RenderingHints.Key;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getFriendslist {

	public static void main(String args[]) throws InterruptedException, IOException{
		String userName="";
		String password="";
		 WebDriver myDriver =new FirefoxDriver();
		 WebDriverWait wait= new WebDriverWait(myDriver, 45);
		 myDriver.manage().window().maximize();
		 myDriver.get("https://www.facebook.com/");
		 myDriver.findElement(By.id("email")).sendKeys(userName);
		 myDriver.findElement(By.id("pass")).sendKeys(password);
		 myDriver.findElement(By.id("u_0_l")).sendKeys(Keys.ENTER);
		 myDriver.findElement(By.xpath("//body/div[1]/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/a")).click();
	//	 myDriver.wait(4000);
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[3]/div/div[2]/div[2]/div/div/a[3]")));

		 myDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div/div[3]/div/div[2]/div[2]/div/div/a[3]")).click();
		 												   
		 	//ul[1]/li[1]/div/div/div[2]/div/div[2]/div
		 
		 for(int i=0;i<1000;i++)		 
		 {
			 JavascriptExecutor jse = (JavascriptExecutor)myDriver;
			 jse.executeScript("window.scrollBy(0,2500)", "");
			 myDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 }
		 for(int i=0;i<1000;i++)		 
		 {
			 JavascriptExecutor jse = (JavascriptExecutor)myDriver;
			 jse.executeScript("window.scrollBy(0,2500)", "");
			 myDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 }
		 List<WebElement> element=myDriver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[3]/div/div/div[2]/div")).findElements(By.tagName("ul"));		 
		 
		 FileWriter f=new FileWriter("friendsList.csv");
		 
		for(int i=0;i<element.size();i++)
		{
			List<WebElement> lines=element.get(i).findElements(By.tagName("li"));
			
			for(int j=0;j<lines.size();j++){
			try{
				wait.until(ExpectedConditions.elementToBeClickable(lines.get(j).findElement(By.tagName("div")).findElement(By.tagName("div")).findElements(By.tagName("div")).get(9).findElement(By.tagName("a"))));
				String name=lines.get(j).findElement(By.tagName("div")).findElement(By.tagName("div")).findElements(By.tagName("div")).get(9).findElement(By.tagName("a")).getText();
				 System.out.println(name);
				f.append(name+","+"\n");
			}catch(Exception e){
				
			}
			}
		}
		f.flush();
		f.close();

		 
		 
	}
}

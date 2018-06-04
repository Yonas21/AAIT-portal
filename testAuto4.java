
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.WebElement;

 import java.lang.reflect.Executable;

 public class testAuto4 {
     public static void Auto4() {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yonet\\IdeaProjects\\autoTest\\chromedriver_win32\\chromedriver.exe");

         //instantaite web driver /create Object
         WebDriver webDriver = new ChromeDriver();
         webDriver.get("http://portal.aait.edu.et");

         try{
             Thread.sleep(1000);
         } catch (Exception e){

         }

         //finding the instance of web Elements
         WebElement userName = webDriver.findElement(By.name("UserName"));
         WebElement password = webDriver.findElement(By.name("Password"));
         WebElement login = webDriver.findElement(By.cssSelector(".btn"));
         //Enter The Value to Them
         userName.sendKeys("ATR/1017/08");
         password.sendKeys("Yonas@2010");

         //click the login Button
         login.click();


         try{
             Thread.sleep(1000);
         } catch (Exception e){

         }

         webDriver.navigate().to("http://portal.aait.edu.et/Grade/GradeReport");

         try {
             Thread.sleep(1000);
         } catch (Exception e){

         }

         WebElement average = webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/table/tbody/tr[8]"));
         System.out.println(average.getText());

         try{
             Thread.sleep(1000);
         } catch (Exception e){

         }
         webDriver.close();
     }
 }
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Element;

import java.util.List;

public class DynamicWebTable {
    public static void main(String args[]) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("//C:/Users/hp/Downloads/WbTable.html");
        driver.manage().window().maximize();
        List<WebElement> lst = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        int rcount = lst.size();
        System.out.println(rcount);
        for (int i = 3; i <= rcount; i++) {
            for (int j = 1; j < rcount; i++) {
                System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[" + i + "]/td[" + i + "]")).getText());

            }
        }
    }
}
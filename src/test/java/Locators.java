import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriverManager.edgedriver();
        WebDriver driver = new EdgeDriver();
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        driver.findElement(By.className("VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-dgl2Hf ksBjEc lKxP2d LQeN7 FliLIb uRo0Xe TrZEUc Xf9GD")).click();



    }

}


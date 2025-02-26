import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSeleum {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    @Order(1)
    public void testDangKy() {
        driver.get("https://vitimex.com.vn/dang-ky.html");
        driver.findElement(By.id("name")).sendKeys("Nguyễn quang huyjdakusudjkagdj");
        driver.findElement(By.id("phone")).sendKeys("0345635569");
        driver.findElement(By.id("email")).sendKeys("zennodeptrai@gmail.com");
        driver.findElement(By.id("pass-regis")).sendKeys("Huyyeume");
        driver.findElement(By.id("pass-confirm")).sendKeys("Huyyeume");
        driver.findElement(By.id("register-btn")).click();
    }

    @Test
    @Order(2)
    public void testDangNhap() {
       driver.get("https://vitimex.com.vn/");
       driver.findElement(By.xpath("//div[@class='li_log']//a[@data-bs-toggle='modal']//*[name()='svg']")).click();
       driver.findElement(By.xpath("//input[@id='account']")).sendKeys("0345635569");
       driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Huyyeume");
       driver.findElement(By.xpath("//a[@id='signin-btn']")).click();

    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            try {
                Thread.sleep(5000); // Chờ 5 giây trước khi đóng trình duyệt
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit(); // Đóng trình duyệt
        }
    }

}

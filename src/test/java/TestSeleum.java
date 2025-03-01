//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//class TestSeleum {
//
//    WebDriver chromeDriver;
//    WebDriverWait wait;
//
//    @BeforeEach
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        chromeDriver = new ChromeDriver();
//        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(10));
//    }
//
//    @Test
//    public void testRegisterAndLogin() {
//        // Truy cập trang đăng ký
//        chromeDriver.get("https://vitimex.com.vn/dang-ky.html");
//
//        // Điền thông tin đăng ký
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("cẩm nhung");
//        chromeDriver.findElement(By.id("phone")).sendKeys("0231223171");
//        chromeDriver.findElement(By.id("email")).sendKeys("camnhung111205@gmail.com");
//        chromeDriver.findElement(By.id("pass-regis")).sendKeys("011127");
//        chromeDriver.findElement(By.id("pass-confirm")).sendKeys("011127");
//        chromeDriver.findElement(By.id("register-btn")).click();
//
//        // Truy cập trang chủ
//        chromeDriver.get("https://vitimex.com.vn/");
//
//        // Đăng nhập
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".li_log"))).click();
//        chromeDriver.findElement(By.id("account")).sendKeys("camnhung111205@gmail.com");
//        chromeDriver.findElement(By.id("pass")).sendKeys("011127");
//        chromeDriver.findElement(By.id("signin-btn")).click();
//
//        // Kiểm tra đăng nhập thành công
//        // Bạn có thể thêm một điều kiện kiểm tra ở đây để xác nhận đăng nhập thành công
//        assertTrue(chromeDriver.getTitle().contains("Tên trang sau khi đăng nhập")); // Thay thế bằng tiêu đề trang sau khi đăng nhập
//    }
//
////    @AfterEach
////    public void tearDown() {
////        if (chromeDriver != null) {
////            chromeDriver.quit();
////        }
////    }
//}

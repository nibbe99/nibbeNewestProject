import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class newTest {

    private static WebDriver driver;

    @Test
    public void simpleTests() {
        Assert.assertTrue(true);
    }

    @Test
    public void simpleTests1() {
        Assert.assertTrue(true);
    }

    @Test
    public void simpleTests2() {
        Assert.assertTrue(true);
    }
/*
    @Test
    public void addTwoNumbers(){
        int expected = 2+5;
        int actual = 7;
        Assert.assertEquals(expected, actual);

    }

 */

    @BeforeAll
    static void setup() {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origin=*");
        option.addArguments("incognito");
        option.addArguments("headless");
        driver = new ChromeDriver(option);
    }

    @BeforeEach
    public void navigate() {
        driver.manage().deleteAllCookies();  // Clear cookies or reset session after each test
        driver.get("https://www.iths.se");
    }

    @Test
    public void testTitel() {
        String titel = driver.getTitle();
        Assert.assertEquals("IT-Högskolan – Här startar din IT-karriärs!", titel);

    }

}
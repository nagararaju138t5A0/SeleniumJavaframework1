/*
 * package dec25;
 * 
 * import java.util.Scanner;
 * 
 * public class sel {
 * 
 * public static void main(String[] args) {
 * 
 * } }
 * 
 * 
 * 
 * 
 * 
 * package dec25;
 * 
 * import java.time.Duration; import java.util.Iterator; import java.util.Set;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class Test {
 * 
 * public static void main(String[] args) throws InterruptedException { // Open
 * the Firefox browser System.setProperty("webdriver.gecko.driver",
 * "./Resources/geckodriver.exe"); WebDriver driver = new FirefoxDriver(); //
 * Use explicit wait to ensure the presence of the button
 * 
 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); //
 * Launch the Flipkart website driver.get("https://www.flipkart.com"); // Locate
 * the search box on the homepage
 * 
 * WebElement searchBox = driver.findElement(By.name("q")); // Type "iPad" into
 * the search box
 * 
 * searchBox.sendKeys("ipad"); // Press the searcb btn
 * 
 * WebElement clicksearch_btn =
 * driver.findElement(By.xpath("(//*[contains(@height,'24')])[2]"));
 * clicksearch_btn.click();
 * driver.findElement(By.xpath("(//*[contains(@class,'s1Q9rs')])[2]")).click();
 * // Get all window handles
 * 
 * Set<String>windowhandles=driver.getWindowHandles(); // Print the window
 * handles
 * 
 * System.out.println(windowhandles);
 * 
 * Iterator<String>iterator=windowhandles.iterator(); String
 * parent=iterator.next(); System.out.println(parent); String
 * child=iterator.next(); System.out.println(child);
 * 
 * driver.switchTo().window(child); // Navigate to the current page (refresh)
 * 
 * driver.navigate().refresh(); WebElement element1 =
 * driver.findElement(By.xpath("//*[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
 * element1.click(); WebElement buttonElement =
 * wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
 * "button._2KpZ6l._2ObVJD._3AWRsL"))); buttonElement.click(); // Enter the
 * phone number "8125671417" into the input field
 * 
 * driver.findElement(By.xpath("//*[@maxlength='auto']")).sendKeys("8125671417")
 * ; // Locate and click on the submit button
 * 
 * driver.findElement(By.xpath("//*[@type='submit']")).click();
 * 
 * // Close the current browser window
 * 
 * driver.close(); // Quit the WebDriver
 * 
 * driver.quit();
 * 
 * 
 * } }
 */
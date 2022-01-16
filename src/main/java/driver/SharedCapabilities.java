package driver;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;

public class SharedCapabilities {
	public static ChromeOptions setDefaultCapabilities(){
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		return chromeOptions;
	}
}


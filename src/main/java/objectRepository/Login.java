package objectRepository;

import org.openqa.selenium.By;

public class Login {
	public final By InpEmail = By.xpath("//input[@id='login']");
	public final By InpPassword = By.xpath("//input[@id='password']");
	public final By btnLogin = By.xpath("//button[text()='Log in']");
}

package myproject_clz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_with_facebook {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "F:\\new testing software\\new jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver b =new ChromeDriver();
		b.get("https://www.facebook.com/login.php?skip_api_login=1&api_key=479600889042344&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv2.10%2Fdialog%2Foauth%3Fchannel%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fconnect%252Fxd_arbiter%252Fr%252F2VRzCA39w_9.js%253Fversion%253D42%2523cb%253Df2b6cc9b151aaf%2526domain%253Dwww.jetstay.com%2526origin%253Dhttps%25253A%25252F%25252Fwww.jetstay.com%25252Ff2aab2d7703e858%2526relation%253Dopener%26redirect_uri%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fconnect%252Fxd_arbiter%252Fr%252F2VRzCA39w_9.js%253Fversion%253D42%2523cb%253Df19c7864b5101%2526domain%253Dwww.jetstay.com%2526origin%253Dhttps%25253A%25252F%25252Fwww.jetstay.com%25252Ff2aab2d7703e858%2526relation%253Dopener%2526frame%253Df178418502b4c88%26display%3Dpopup%26scope%3Dpublic_profile%252Cemail%26response_type%3Dnone%252Ctoken%252Csigned_request%26domain%3Dwww.jetstay.com%26auth_type%26ref%3DLoginButton%26origin%3D1%26client_id%3D479600889042344%26seen_revocable_perms_nux%3Dfalse%26ret%3Dlogin%26sdk%3Djoey%26logger_id%3D5c94a8f0-52f5-a7bc-5289-e3913d565e32&cancel_url=https%3A%2F%2Fstaticxx.facebook.com%2Fconnect%2Fxd_arbiter%2Fr%2F2VRzCA39w_9.js%3Fversion%3D42%23cb%3Df19c7864b5101%26domain%3Dwww.jetstay.com%26origin%3Dhttps%253A%252F%252Fwww.jetstay.com%252Ff2aab2d7703e858%26relation%3Dopener%26frame%3Df178418502b4c88%26error%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26e2e%3D%257B%257D&display=popup&locale=en_GB&logger_id=5c94a8f0-52f5-a7bc-5289-e3913d565e32");
		
		//b.get("https://www.jetstay.com/login.html");
		//b.findElement(By.xpath(".//*[@id='u_0_1']/table/tbody/tr/td[2]/span/span")).click();
		
		b.findElement(By.xpath(".//*[@id='email']")).sendKeys("sheetalmca1995@gmail.com");
		b.findElement(By.xpath(".//*[@id='pass']")).sendKeys("9992210605");
		b.findElement(By.xpath(".//*[@id='u_0_0']")).click();
		b.findElement(By.xpath(".//*[@id='u_0_4']/div[2]/div[1]/div[1]/button")).click();
	}

}

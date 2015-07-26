import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Rehaan
 * @Date 5:39:57 PM
 * @FileName TestApp.java
 * @PackageName 
 * @ProjectName Appium
 *
 **/
public class TestApp {

	//Appium to Launch on Windows
	private static Process process;

	//Path to node.exe and appium.js (files are present inside the Appium folder in Program files)
	private static String STARTSERVER = "C:\\Program Files (x86)\\Appium\\node.exe C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js";
	
	public static void startAppiumServer() throws IOException, InterruptedException{
		
		Runtime runtime = Runtime.getRuntime();
		
		process = runtime.exec(STARTSERVER);
		Thread.sleep(7000);
		
		if(process!=null){
			System.out.println("Appium server started!");
		}
		
		
	}
	
	public static void stopAppiumServer(){
		
		if(process!=null){
			System.out.println("Stopping the Appium server");
			process.destroy();
		}
	}
	
	public static void main(String[] args) throws ExecuteException, IOException, InterruptedException {

		
		
		/*System.out.println("driver being created...");
		CommandLine command = new CommandLine("cmd");
		command.addArgument("cmd");
		command.addArgument("/C");
		//You will find the below appium.js under the program files (x86 or x64)
		command.addArgument("C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js");
		//command.addArgument("C:\Users\mkarthik\Documents\selenium\Appium\node_modules\appium\bin\appium.js\");
		command.addArgument("--address");
		command.addArgument("127.0.0.1");
		command.addArgument("--bootstrap-port");
		command.addArgument("4723");
		command.addArgument("--no-reset");
		command.addArgument("--log");
		command.addArgument("C:\\Selenium\\workspace3\\Appium\\appiumLogs.txt");
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		executor.execute(command, resultHandler);*/
		
		//Starting Appium Server through Java code
		//stopAppiumServer();
		startAppiumServer();
		
		File classpathRoot = new File(System.getProperty("user.dir"));
		//File appDir = new File(classpathRoot, "/WordPress_2_8_1.apk");
		File app = new File(classpathRoot, "WordPress_2_8_1.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("automationName", "Appium");
		cap.setCapability("deviceName", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1.1");
		//wordpress package - org.wordpress.android
		cap.setCapability("app", app);
		cap.setCapability("appPackage", "org.wordpress.android");
		cap.setCapability("appActivity", ".ui.accounts.WelcomeActivity");
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.findElement(By.id("org.wordpress.android:id/nux_username")).sendKeys("hello");
		
		Thread.sleep(10000);
		driver.quit();
		stopAppiumServer();
	}

}

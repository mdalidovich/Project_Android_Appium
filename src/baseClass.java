import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseClass {

	public static void main(String[] args) throws MalformedURLException {
		
		//create object where the source of the demo file is
		File appDir = new File("src");
		//create object with the parent file and its name
		File app = new File(appDir, "ApiDemos-debug.apk");
		//create object for capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//set up the device name and the path to the app
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2XL_Emulator");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		//uiautomator2 android testing framework
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		//give port number 4723
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wb/hub"), cap);
		
	}

}


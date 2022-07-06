import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseClass {

	public static void main(String[] args) {
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
		
		
	}

}


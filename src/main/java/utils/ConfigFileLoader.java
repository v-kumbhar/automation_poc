package utils;

import java.util.Properties;



public class ConfigFileLoader {
	
private final Properties properties;
	
	private static ConfigFileLoader configFileLoader;
	
	private ConfigFileLoader() {
		properties = PropertyFileReader.propertyLoader(System.getProperty("user.dir")+"/src/test/resources/TestData/config.properties");
	}
	
	public static ConfigFileLoader getInstance() {
		if(configFileLoader == null) {
			configFileLoader = new ConfigFileLoader();
		}
		
		return configFileLoader;
	}
	
	public String getproperty(String key) {
		String prop= properties.getProperty(key);
		if(prop != null) {
			return prop;
		}else {
			throw new RuntimeException("Property bas url is not mentioned in config.properties");
		}
	}
	

}

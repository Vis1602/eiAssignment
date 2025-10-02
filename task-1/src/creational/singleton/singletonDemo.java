package creational.singleton;

public class singletonDemo {
    public static void main(String[] args) {
        // First access: creates the instance
        configurationManager config1 = configurationManager.getInstance();
        System.out.println("API Key: " + config1.getApiKey());
        System.out.println("DB Connection: " + config1.getDbConnectionString());
        System.out.println("File Storage Path: " + config1.getFileStoragePath());

        // Second access: reuses the same instance
        configurationManager config2 = configurationManager.getInstance();
        config2.setApiKey("NEW_API_KEY"); // changing the API key

        // Showing that config1 and config2 are the same instance
        System.out.println("API Key from config1: " + config1.getApiKey());
        System.out.println("API Key from config2: " + config2.getApiKey());
    }
}

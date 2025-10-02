package creational.singleton;

import java.util.logging.Logger;

import log.util.LoggerUtil;

public class configurationManager {
    private static final Logger logger = LoggerUtil.getLogger();

    // Static variable to hold the single instance
    private static configurationManager instance;

    // Example global configurations
    private String apiKey;
    private String dbConnectionString;
    private String fileStoragePath;

    // Private constructor to prevent instantiation
    private configurationManager() {
        // Initialize default configurations
        apiKey = "API_KEY";
        dbConnectionString = "jdbc:mysql://localhost:3306/DB";
        fileStoragePath = "/data/Files";
        logger.info("Default configurations initialized.");
    }

    // Public method to provide access to the single instance
    public static configurationManager getInstance() {
        if (instance == null) {
            instance = new configurationManager();
            logger.info("ConfigurationManager instance created.");
        } else {
            logger.info("ConfigurationManager instance already exists.");
        }
        return instance;
    }

    // Getters and setters for configuration
    public String getApiKey() {
        logger.fine("Getting API key.");
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
        logger.info("API key updated.");
    }

    public String getDbConnectionString() {
        logger.fine("Getting DB connection string.");
        return dbConnectionString;
    }

    public void setDbConnectionString(String dbConnectionString) {
        this.dbConnectionString = dbConnectionString;
        logger.info("DB connection string updated.");
    }

    public String getFileStoragePath() {
        logger.fine("Getting file storage path.");
        return fileStoragePath;
    }

    public void setFileStoragePath(String fileStoragePath) {
        this.fileStoragePath = fileStoragePath;
        logger.info("File storage path updated.");
    }
}

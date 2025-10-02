package log.util;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {
    private static Logger logger;

    static {
        try {
            // Configure a single logger for all classes in task-1
            logger = Logger.getLogger("Task1Logger");
            FileHandler fileHandler = new FileHandler("task-1/task1.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false); // Disable console logging
        } catch (Exception e) {
            System.err.println("Failed to set up logger: " + e.getMessage());
        }
    }

    public static Logger getLogger() {
        return logger;
    }
}
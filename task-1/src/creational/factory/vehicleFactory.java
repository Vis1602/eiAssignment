package creational.factory;

import java.util.logging.Logger;

import log.util.LoggerUtil;

public class vehicleFactory {
    private static final Logger logger = LoggerUtil.getLogger();

    public vehicle createVehicle(String vehicleType) {
        logger.info("Creating vehicle of type: " + vehicleType);
        try {
            switch(vehicleType.toLowerCase()) {
                case "car":
                    logger.info("Created a car.");
                    return new car();
                case "motorcycle":
                    logger.info("Created a motorcycle.");
                    return new motorcycle();
                case "truck":
                    logger.info("Created a truck.");
                    return new truck();
                default:
                    logger.warning("Unknown vehicle type requested: " + vehicleType);
                    throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
            }
        } catch (Exception e) {
            logger.severe("Error creating vehicle: " + e.getMessage());
            throw e;
        }
    }
}

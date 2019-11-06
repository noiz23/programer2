package by.iba.app;

import by.iba.logging.InfoLogger;
import java.util.logging.Logger;

public class App {

    public static void main(String... args) {
        InfoLogger.log("Application started ...");
        Logger logger = InfoLogger.getLog();
        logger.info("Application finished.");
    }    
}

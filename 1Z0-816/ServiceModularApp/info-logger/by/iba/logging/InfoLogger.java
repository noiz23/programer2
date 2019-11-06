package by.iba.logging;

import java.util.logging.Logger;

public class InfoLogger {
    
    private static final Logger LOG = Logger.getLogger(InfoLogger.class.getName());
    
    public static void log(String msg) {
        LOG.info(msg);
    }

    public static Logger getLog() {
        return LOG;
    }
}

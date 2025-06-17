public class Context {
    private ILogging logger;


    public void setLogger(ILogging logger) {
        this.logger = logger;
    }


    public void performLogging(String message) {
        if (logger != null) {
            logger.Log(message);
        }
    }
}
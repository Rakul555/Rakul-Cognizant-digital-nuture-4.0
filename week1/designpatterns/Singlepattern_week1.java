package week1.designpatterns;
class Logger {
    private static Logger uniqueLogger;
    private Logger() {
        System.out.println("Logger object initialized.");
    }
    public static Logger getInstance() {
        if (uniqueLogger == null) {
            uniqueLogger = new Logger();
        }
        return uniqueLogger;
    }
    public void log(String msg) {
        System.out.println("Log Message: " + msg);
    }
}
public class Singlepattern_week1 {
    public static void main(String[] args) {
        Logger logRef1 = Logger.getInstance();
        Logger logRef2 = Logger.getInstance();
        logRef1.log("Logging first info.");
        logRef2.log("Logging second info.");
        if (logRef1 == logRef2) {
            System.out.println("Both references point to the same Logger instance.");
        } else {
            System.out.println("Logger instances are different.");
        }
    }
}

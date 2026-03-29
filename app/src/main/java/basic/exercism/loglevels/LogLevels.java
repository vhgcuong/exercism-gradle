package basic.exercism.loglevels;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {
    
    public static String message(String logLine) {
        Matcher m = Pattern.compile("\\[(\\w+)]\\:(.+)").matcher(logLine);
        if (m.find()) {
            return m.group(2).trim();
        }
        return "";
    }

    public static String logLevel(String logLine) {
        Matcher m = Pattern.compile("\\[(\\w+)]\\:(.+)").matcher(logLine);
        if (m.find()) {
            return m.group(1).toLowerCase();
        }
        return "";
    }

    public static String reformat(String logLine) {
        Matcher m = Pattern.compile("\\[(\\w+)]\\:(.+)").matcher(logLine);
        if (m.find()) {
            return m.group(2).trim() + " (" + m.group(1).toLowerCase() + ")";
        }
        return "";
    }
}

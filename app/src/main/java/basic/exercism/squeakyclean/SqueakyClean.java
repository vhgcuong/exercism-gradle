package basic.exercism.squeakyclean;

import java.util.regex.Pattern;

public class SqueakyClean {
    public static String clean(String identifier) {
        return Pattern.compile("-(\\p{IsAlphabetic})")
            .matcher(identifier)
            .replaceAll(m -> m.group().toUpperCase())
            .replaceAll("\s", "_")
            .replaceAll("\\p{Cntrl}", "CTRL")
            .replaceAll("[^_\\p{IsAlphabetic}]", "")
            .replaceAll("[α-ω]", "");
    }
}



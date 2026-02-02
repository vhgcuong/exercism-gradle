package basic.exercism.squeakyclean;

import java.lang.Character;

public class SqueakyClean {
    public static String clean(String identifier) {
        final char[] asArr = identifier.toCharArray();
        final StringBuffer result = new StringBuffer();

        boolean isUpcase = false;
        for (char ch: asArr) {
            if (Character.isWhitespace(ch)) {
                result.append('_');
            } else if (isUpcase && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                isUpcase = false;
            } else if (ch == '-') {
                isUpcase = true;
            } else if (Character.isDigit(ch)) {
                switch (ch) {
                    case '4':
                        result.append('a');
                        break;
                    case '3':
                        result.append('e');
                        break;
                    case '0':
                        result.append('o');
                        break;
                    case '1':
                        result.append('l');
                        break;
                    case '7':
                        result.append('t');
                        break;
                    default:
                        result.append(ch);
                        break;
                }
            } else if (Character.isAlphabetic(ch) || Character.isLetter(ch)) {
                result.append(ch);
            } else {
                continue;
            }
        }

        return result.toString();
    }
}


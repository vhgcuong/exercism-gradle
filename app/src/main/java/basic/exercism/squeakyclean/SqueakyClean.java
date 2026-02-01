package basic.exercism.squeakyclean;

import java.lang.Character;

class SqueakyClean {
    static String clean(String identifier) {
        final char[] asArr = identifier.toCharArray();
        final StringBuffer result = new StringBuffer();

        for (char ch: asArr) {
            if (Character.isWhitespace(ch)) {
                result.append('_');
                continue;
            }

            if (Character.isDigit(ch)) {
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
                continue;
            }

            if (!Character.isAlphabetic(ch)) {
                if (!Character.isLetter(ch)) {
                    continue;
                }
            }
            result.append(ch);
        }


        return result.toString();
    }
}


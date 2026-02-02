package util;

import java.util.HashSet;
import java.util.Set;

public class Validator {
    private static final String ERROR_PREFIX = "[ERROR] ";
    private static final int INPUT_LENGTH = 3;
    private static final String RESTART_CODE = "1";
    private static final String EXIT_CODE = "2";

    public static String guessError(String input) {
        if (input.length() != INPUT_LENGTH) {
            return errorMessage(INPUT_LENGTH + "자여야 합니다.");
        }
        return validateCharacters(input);
    }

    private static String validateCharacters(String input) {
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : input.toCharArray()) {
            String error = numberError(c);
            if (error != null) {
                return error;
            }
            if (!uniqueChars.add(c)) {
                return errorMessage("중복된 숫자는 사용할 수 없습니다.");
            }
        }
        return null;
    }

    public static String numberError(char c) {
        if (!Character.isDigit(c)) {
            return errorMessage("숫자만 입력해야 합니다.");
        }
        if (c == '0') {
            return errorMessage("0은 사용할 수 없습니다.");
        }
        return null;
    }

    public static String restartError(String input) {
        if (RESTART_CODE.equals(input) || EXIT_CODE.equals(input)) {
            return null;
        }
        return errorMessage(String.format("%s(재시작), %s(종료)만 입력 가능합니다.", RESTART_CODE, EXIT_CODE));
    }

    private static String errorMessage(String message) {
        return ERROR_PREFIX + message;
    }
}

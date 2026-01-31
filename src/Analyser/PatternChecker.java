package PasswordAnalyser.src.Analyser;

public class PatternChecker {

    public static boolean hasSequentialPattern(String password) {
        
        String lower = password.toLowerCase();

        String[] commonSeq = {
            "123",
            "1234",
            "12345",
            "123456",
            "1234567",
            "12345678",
            "123456789",
            "abc",
            "abcd",
            "abcde",
            "abcdef",
            "qwerty",
            "qwerty123",
            "qwerty1234",
            "qwerty12345",
            "password",
            "pass",
            "password1",
            "letmein",
            "admin",
            "user",
            "default",
            "welcome",
            "111",
            "000",
            "222",
            "333",
            "444",
            "555",
            "666",
            "777",
            "888",
            "999"
        };

        for (String seq : commonSeq) {
            if (lower.contains(seq)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasRepeatedChars(String password) {
        for (int i = 1; i < password.length() - 2; i++) {
            char a = password.charAt(i);
            char b = password.charAt(i + 1);
            char c = password.charAt(i + 2);

            if (a == b && b == c) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasYearPattern(String password) {
    // looking for any 4 digit number between 1900 and 2026
    for (int i = 0; i < password.length() - 3; i++) {
        String chunk = password.substring(i, i + 4);

        if (chunk.matches("\\d{4}")) {
            int year = Integer.parseInt(chunk);

            if (year >= 1900 && year <= 2026) {
                return true;
            }
        }
    }
    return false;
}

}
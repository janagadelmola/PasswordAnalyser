package PasswordAnalyser.src.Analyser;

public class PasswordAnalyser {

    public PasswordScore analyse(String password) {
        PasswordScore score = new PasswordScore();

        if (password.length() >= 8) {
            score.addScore(20);
        } else {
            score.addSuggestion("Use at least 8 characters in your password.");
        }

        if (password.matches(".*[A-Z].*")) {
            score.addScore(15);
        } else {
            score.addSuggestion("Add uppercase letters to your password.");
        }

        if (password.matches(".*[a-z].*")) {
            score.addScore(15);
        } else {
            score.addSuggestion("Add lowercase letters to your password.");
        }

        if (password.matches(".*\\d.*")) {
            score.addScore(15);
        } else {
            score.addSuggestion("Add numbers to your password.");
        }

        if (password.matches(".*[!@#$%^&*(),.?\\\":{}|<>].*")) {
            score.addScore(15);
        } else {
            score.addSuggestion("Add special characters to your password.");
        }

        if (!PatternChecker.hasSequentialPattern(password)) {
            score.addScore(10);
        } else {
            score.addSuggestion("Avoid common patterns in your password.");
        }

        if (!PatternChecker.hasRepeatedChars(password)) {
            score.addScore(5);
        } else {
            score.addSuggestion("Avoid using repeated characters in your password.");
        }

        if (!PatternChecker.hasYearPattern(password)) {
            score.addScore(5);
        } else {
            score.addSuggestion("Avoid using years.");
        }

        return score;
    }
    
}

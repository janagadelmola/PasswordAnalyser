package PasswordAnalyser.src.Analyser;
import java.util.ArrayList;
import java.util.List;

public class PasswordScore {

    private int score;
    private List<String> suggestions;

    public PasswordScore() {
        this.score = 0;
        this.suggestions = new ArrayList<>();
    }

    public void addScore(int value) {
        this.score += value;
    }

    public void addSuggestion(String suggestion) {
        this.suggestions.add(suggestion);
    }

    public int getScore() {
        return score;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public String getRating() {
        if (score < 30) return "Weak";
        if (score < 60) return "Medium";
        if (score < 80) return "Strong";
        return "Very Strong";
    }
    
}
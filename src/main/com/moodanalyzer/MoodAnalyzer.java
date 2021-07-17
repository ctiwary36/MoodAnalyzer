package main.com.moodanalyzer;

public class MoodAnalyzer {
    private String message;

    // Default Constructor
    public MoodAnalyzer() {
        this.message = null;

    }

    // Parameterised Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    // Check Sad or Happy Mood
    public String analyseMood() {

        if (message.toLowerCase().contains("sad"))
            return "SAD";

        return "HAPPY";

    }
}


package main.com.moodanalyzer;

public class MoodAnalyzer {
    private String message;

    public String getMessage() {
        return message;
    }

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
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";

            return "HAPPY";
        } catch (NullPointerException e) {
            throw new NullPointerException("Invalid Name");

        }

    }

}


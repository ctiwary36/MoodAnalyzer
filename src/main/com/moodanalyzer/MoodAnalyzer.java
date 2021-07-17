package main.com.moodanalyzer;

public class MoodAnalyzer {
    //Check
    public String analyseMood(String message) {

        if (message.toLowerCase().contains("sad"))
            return "SAD";

        return "HAPPY";

    }

}


package Test.com.moodanalyzer;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    // Test-Case for SadMood
    @Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actual = moodAnalyzer.analyseMood("I am Sad");
        String expected = "SAD";
        Assert.assertEquals(expected, actual);

    }

    // Test-Case for HappyMood
    @Test
    public void givenMessage_whenHappy_ShouldReturnHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actual = moodAnalyzer.analyseMood("I am Happy");
        String expected = "HAPPY";
        Assert.assertEquals(expected, actual);

    }

}


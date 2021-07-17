package Test.com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

    public class MoodAnalyzerTest {
        // Test-Case for SadMood
        @Test
        public void givenMessage_whenSad_ShouldReturnSad() {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Sad");
            String actual = moodAnalyzer.analyseMood();
            String expected = "SAD";
            Assert.assertEquals(expected, actual);

        }

        // Test-Case for HappyMood
        @Test
        public void givenMessage_whenHappy_ShouldReturnHappy() {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Happy");
            String actual = moodAnalyzer.analyseMood();
            String expected = "HAPPY";
            Assert.assertEquals(expected, actual);

        }
    }


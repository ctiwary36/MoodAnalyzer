package Test.com.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

    public class MoodAnalyzerTest {
        // Test-Cases for Sad Mood
        @Test
        public void givenMessage_whenSad_ShouldReturnSad() throws MoodAnalysisException {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am Sad Mood");
            String actual = moodAnalyzer.analyseMood();
            String expected = "SAD";
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void givenMessage_whenSAD_ShouldReturnSAD() throws MoodAnalysisException {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in SAD Mood");
            String actual = moodAnalyzer.analyseMood();
            String expected = "SAD";
            Assert.assertEquals(expected, actual);
        }

        // Test-Cases for Happy Mood
        @Test
        public void givenMessage_whenHappy_ShouldReturnHappy() throws MoodAnalysisException {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
            String actual = moodAnalyzer.analyseMood();
            String expected = "HAPPY";
            Assert.assertEquals(expected, actual);
        }

        // Test-Cases for Null
        @Test
        public void givenMessage_whenNull_ShouldThrowMoodAnalysisException() {
            try {
                MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
                moodAnalyzer.analyseMood();
            } catch (MoodAnalysisException e) {
                Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.exceptionType);
            }
        }

        // Test-Cases for Empty
        @Test
        public void givenMessage_whenEmpty_ShouldThrowMoodAnalysisException() {
            try {
                MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
                moodAnalyzer.analyseMood();
            } catch (MoodAnalysisException e) {
                System.out.println("here");
                Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
            }
        }
    }


package units;

import org.junit.Assert;
import org.junit.Test;
import untilities.StringUtility;

public class ShortestStringUnitTests {

    @Test
    public void unitTestShortest() {
        String sentence = "Can I have some coffee, please?";
        String expected = "I";
        Assert.assertEquals(expected, StringUtility.shortestWord(sentence));
    }

    @Test
    public void unitTestShortest2() {
        String sentence = "One design goal of Java is portability";
        String expected = "of";
        Assert.assertEquals(expected, StringUtility.shortestWord(sentence));
    }

    @Test
    public void unitTestShortest3() {
        String sentence = "The syntax of Java is largely influenced by C++.";
        String expected = "of";
        Assert.assertEquals(expected, StringUtility.shortestWord(sentence));
    }

}

package units;

import org.junit.Assert;
import org.junit.Test;
import untilities.StringUtility;

public class LongestStringUnitTests {
    @Test
    public void unitTest(){
        String sentence = "Can I have some coffee, please?";
        String expected = "coffee";
        Assert.assertEquals(expected, StringUtility.longestWord(sentence));
    }

    @Test
    public void unitTest2(){
        String sentence = "One design goal of Java is portability";
        String expected = "portability";
        Assert.assertEquals(expected, StringUtility.longestWord(sentence));
    }

    @Test
    public void unitTest3(){
        String sentence = "The syntax of Java is largely influenced by C++.";
        String expected = "influenced";
        Assert.assertEquals(expected, StringUtility.longestWord(sentence));
    }

}

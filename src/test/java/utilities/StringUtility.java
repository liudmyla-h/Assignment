package utilities;

public class StringUtility {

    public static String shortestWord(String sentence) {
        if(sentence == null){
            throw new RuntimeException("Phrase cannot be null!");
        }else  if(sentence.isEmpty()){
            throw new RuntimeException("Phrase cannot be empty!");
        }
        String[] word = sentence.replaceAll("[!@#$%^&*()=<>?\".,:;{}]", "").split(" ");
        String shortest = word[0];
        for (String s : word) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }
        System.out.printf("Shortest string is %s, and length of it is %s", shortest, shortest.length());
        return shortest;
    }

    public static String longestWord(String sentence) {
        if(sentence == null){
            throw new RuntimeException("Phrase cannot be null!");
        }else  if(sentence.isEmpty()){
            throw new RuntimeException("Phrase cannot be empty!");
        }
        String[] word = sentence.replaceAll("[!@#$%^&*()=<>?\":;{},]", "").split(" ");
        String longest = "";
        for (String s : word) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.printf("Longest string is %s, and length of it is %s", longest, longest.length());
        return longest;
    }
}

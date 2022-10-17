package practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitText {

  public static void main(String[] args) {


  }

  public static String splitTextIntoWords(String text) {
    String regex = "[^0-9.\\s-;,]+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    String txt = "";
    while (matcher.find()) {
      int start = matcher.start();
      int end = matcher.end();
      txt += text.substring(start, end) + System.lineSeparator();
    }
    //TODO реализуйте метод
    return txt.trim();
  }

}
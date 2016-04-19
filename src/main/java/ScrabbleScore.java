import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class ScrabbleScore {
  public static void main(String[] args) {}

  public static Integer calculateScore(String word) {
    char[] inputArray = word.toUpperCase().toCharArray();
    HashMap <Character, Integer> scrabbleArray = new HashMap <Character, Integer>();

    scrabbleArray.put('A', 1);

    Integer value = 0;
    for (char letter : inputArray){
      value += scrabbleArray.get(letter);
      }
      return value;
  }
}

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class ScrabbleScore {
  public static void main(String[] args) {}

  public static Integer calculateScore(String word) {
    char[] inputArray = word.toUpperCase().toCharArray();
    HashMap <Character, Integer> scrabbleArray = new HashMap <Character, Integer>();
    Integer value = 0;

    scrabbleArray.put('A', 1);
    scrabbleArray.put('E', 1);
    scrabbleArray.put('I', 1);
    scrabbleArray.put('O', 1);
    scrabbleArray.put('U', 1);
    scrabbleArray.put('L', 1);
    scrabbleArray.put('N', 1);
    scrabbleArray.put('R', 1);
    scrabbleArray.put('S', 1);
    scrabbleArray.put('T', 1);
    scrabbleArray.put('D', 2);
    scrabbleArray.put('G', 2);
    scrabbleArray.put('B', 3);

    for (char letter : inputArray){
      value += scrabbleArray.get(letter);
      }
      return value;
  }
}

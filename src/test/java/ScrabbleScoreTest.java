import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScoreTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("A"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_2() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("D"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_3() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("B"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_4() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("F"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_5() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("K"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_8() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateScore("J"));
  }
  @Test
  public void calculateScore_returnsScoreForSingleLetter_10() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("Q"));
  }
  @Test
  public void calculateScore_returnsScoreForMultipleLetters_2() {
    ScrabbleScore testScrabble = new ScrabbleScore();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("TO"));
  }
}

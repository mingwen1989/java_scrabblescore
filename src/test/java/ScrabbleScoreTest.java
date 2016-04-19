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
}

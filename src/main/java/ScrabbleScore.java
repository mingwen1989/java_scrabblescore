import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import static spark.Spark.*;
import spark.template.velocity.VelocityTemplateEngine;
import spark.ModelAndView;


public class ScrabbleScore {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
       Map<String, Object> model = new HashMap<String, Object>();
       model.put("template", "templates/form.vtl");
       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

     get("/results", (request, response) -> {
       Map<String, Object> model = new HashMap<String, Object>();
       model.put("template", "templates/results.vtl");

       String inputWord = request.queryParams("inputtedWord");
      //  String countMyScore = Integer.parseInt(inputWord);
       Integer calculateScore = calculateScore(inputWord);
       calculateScore = ScrabbleScore.calculateScore(inputWord);

       model.put("calculateScore", calculateScore);
       model.put("inputWord", inputWord);

       return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());
   }

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
    scrabbleArray.put('C', 3);
    scrabbleArray.put('M', 3);
    scrabbleArray.put('P', 3);
    scrabbleArray.put('F', 4);
    scrabbleArray.put('H', 4);
    scrabbleArray.put('V', 4);
    scrabbleArray.put('W', 4);
    scrabbleArray.put('Y', 4);
    scrabbleArray.put('K', 5);
    scrabbleArray.put('J', 8);
    scrabbleArray.put('X', 8);
    scrabbleArray.put('Q', 10);
    scrabbleArray.put('Z', 10);

    for (char letter : inputArray){
      value += scrabbleArray.get(letter);
      }
      return value;
  }
}

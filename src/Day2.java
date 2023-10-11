package src;

import java.util.Arrays;

public class Day2 {
  public static void main(String[] args) {
    FileReader fileReader = new FileReader();
    String data = fileReader.readFile("src/data/input2.txt");
    String[] rounds = data.split(System.lineSeparator());
    Day2 day2 = new Day2();
    day2.partOne(rounds);
    day2.partTwo(rounds);
  }

  private void partOne (String[] rounds) {
    int score = 0;
    String[] draw = {"A X", "B Y", "C Z"};
    String[] win = {"A Y", "B Z", "C X"};
  
    for (String round : rounds) {
      score += (int)round.charAt(2) - 87;

      if (Arrays.asList(draw).contains(round)) {
        score += 3;
      } else if (Arrays.asList(win).contains(round)) {
        score += 6;
      } 
    }

    System.out.println(score);
  }

  private void partTwo (String[] rounds) {
    int score = 0;
    String[] one = {"A Y", "B X", "C Z"};
    String[] two = {"A Z", "B Y", "C X"};
    String[] three = {"A X", "B Z", "C Y"};
  
    for (String round : rounds) {
      char play = round.charAt(2);
      
      if (play == 'Y') {
        score += 3;
      } else if (play == 'Z') {
        score += 6;
      } 

      if (Arrays.asList(one).contains(round)) {
        score += 1;
      } else if (Arrays.asList(two).contains(round)) {
        score += 2;
      } else if (Arrays.asList(three).contains(round)) {
        score += 3;
      }
    }

    System.out.println(score);
  }
}

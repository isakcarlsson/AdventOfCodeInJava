package src;

import java.util.ArrayList;

public class Day5 extends Day {
  private ArrayList<ArrayList<Character>> stacks = new ArrayList<ArrayList<Character>>();
  private ArrayList<int[]> moves = new ArrayList<int[]>();

  Day5() {
    super(5);
    this.unit = "";
    
    parseInput();
  }

  public String partOne() {
    return "";
  }

  public String partTwo() {
    return "";
  }

  private void parseInput() {
    String[] parts = data.split("1   2   3   4   5   6   7   8   9 ");
    parts[0] = "t" + parts[0];
    parts[0] = parts[0].trim();
    parts[0] = parts[0].replace("t", "");
    parts[1] = parts[1].trim();

    
    for (int i = 0; i < 9; i++) {
      stacks.add(new ArrayList<Character>());
    }

    String[] stackLevels = parts[0].split(System.lineSeparator());

    for (int i = 0; i < stackLevels.length; i++) {
      String[] line = stackLevels[i].split("(?<=\\G.{4})");

      for (int j = 0; j < line.length; j++) {
        Character box = line[j].charAt(1);
        stacks.get(j).add(0, box);
      }
    }
   
    String[] moveLines = parts[1].split(System.lineSeparator());

    for (String line : moveLines) {
      line = line.replaceAll("move ", "");
      String[] temp1 = line.split(" from | to ");
      int[] temp2 = new int[3];
 
      for (int i = 0; i < temp1.length; i++) {
        temp2[i] = Integer.parseInt(temp1[i]);
      }

      moves.add(temp2);
    }
  }
}

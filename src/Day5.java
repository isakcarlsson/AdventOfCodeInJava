package src;

import java.util.ArrayList;
import java.util.List;

public class Day5 extends Day {
  private ArrayList<ArrayList<Character>> stacks;
  private ArrayList<int[]> moves;

  Day5() {
    super(5);
    this.unit = "";
  }

  public String partOne() {
    parseInput();

    for (int i = 0; i < moves.size(); i++) {
      int[] move = moves.get(i);

      for (int j = 0; j < move[0]; j++) {
        stacks.get(move[2] - 1).add(stacks.get(move[1] - 1).remove(stacks.get(move[1] - 1).size() - 1));
      }
    }

    return getTopBoxes();
  }

  public String partTwo() {
    parseInput();
    
    for (int i = 0; i < moves.size(); i++) {
      int[] move = moves.get(i);

      if (i == 10) {
        int j = 1;
      }
      
      List<Character> temp = stacks.get(move[1] - 1).subList(stacks.get(move[1] - 1).size() - move[0], stacks.get(move[1] - 1).size());
      stacks.get(move[2] - 1).addAll(temp);
      stacks.get(move[1] - 1).removeAll(temp);
    }

    return getTopBoxes();
  }

  private String getTopBoxes() {
    String result = "";

     for (ArrayList<Character> stack : stacks) {
      result += stack.get(stack.size() - 1);
    }

    return result;
  }

  private void parseInput() {
    stacks = new ArrayList<ArrayList<Character>>();
    moves = new ArrayList<int[]>();

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
        
        if (box != ' ') {
          stacks.get(j).add(0, box);
        }
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

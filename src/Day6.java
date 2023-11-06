package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day6 extends Day {
  Day6() {
    super(6);
    this.unit = "";
  }

  public String partOne() {
    return String.valueOf(getIndexOfFirstNonRepeatingChar(4));
  }

  public String partTwo() {
    return String.valueOf(getIndexOfFirstNonRepeatingChar(14));
  }

  private int getIndexOfFirstNonRepeatingChar(int windowSize) {
    List<Character> window = new ArrayList<>();

    for (int i = 0; i < windowSize; i++) {
      window.add(data.charAt(i));
    }
    
    for (int i = windowSize; i < data.length(); i++) {
      Set<Character> set = new HashSet<>(window);
      
      if (set.size() == windowSize) {
        return i;
      }

      window.remove(0);
      window.add(data.charAt(i));
    }
    return -1;
  }
}

package src;

import java.util.Arrays;

public class Day4 extends Day {
  private String[] lines;

  Day4() {
    super(4);
    this.lines = data.split(System.lineSeparator());
    this.unit = "ranges";
  }

  public String partOne() {
    int sumFullyCovered = 0;

    for (String line : lines) {
      String[] ranges = line.split(",");
      int[] first = Arrays.stream(ranges[0].split("-")).mapToInt(Integer::parseInt).toArray();
      int[] second = Arrays.stream(ranges[1].split("-")).mapToInt(Integer::parseInt).toArray();
      
      if (first[0] <= second[0] && first[1] >= second[1]) {
        sumFullyCovered++;
      } else if (second[0] <= first[0] && second[1] >= first[1]) {
        sumFullyCovered++;
      }
    }

    return String.valueOf(sumFullyCovered);
  }

  public String partTwo() {
    int sumFullyCovered = 0;

    for (String line : lines) {
      String[] ranges = line.split(",");
      int[] first = Arrays.stream(ranges[0].split("-")).mapToInt(Integer::parseInt).toArray();
      int[] second = Arrays.stream(ranges[1].split("-")).mapToInt(Integer::parseInt).toArray();
      
      if (first[0] <= second[1] && first[1] >= second[0]) {
        sumFullyCovered++;
      } else if (second[0] <= first[1] && second[1] >= first[0]) {
        sumFullyCovered++;
      }
    }

    return String.valueOf(sumFullyCovered);
  }
}

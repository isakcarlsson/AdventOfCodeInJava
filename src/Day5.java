package src;

public class Day5 extends Day {

  Day5() {
    super(5);
    this.unit = "";
    String[] parts = data.split("1   2   3   4   5   6   7   8   9 ");
    parts[0] = "t" + parts[0];
    parts[0] = parts[0].trim();
    parts[0] = parts[0].replace("t", "");
    parts[1] = parts[1].trim();

    String[] secondLines = parts[1].split(System.lineSeparator());
    System.out.println("Hej:" + secondLines[0]);
  }

  public String partOne() {
    return "";
  }

  public String partTwo() {
    return "";
  }
}

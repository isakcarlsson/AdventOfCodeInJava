package src;

public abstract class Day {
  FileReader fileReader = new FileReader();
  String data;
  int dayNumber;
  String unit;

  Day (int dayNumber) {
    data = fileReader.readFile("src/data/input" + dayNumber + ".txt");
    this.dayNumber = dayNumber;
  };

  void run() {
    System.out.print("Day " + dayNumber);
    System.out.print(" part one: " + partOne() + " " + unit + ",");
    System.out.println(" part two: " + partTwo() + " " + unit + ".");
  };
  
  abstract String partOne();
  
  abstract String partTwo();
}

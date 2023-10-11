package src;

public abstract class Day {
  FileReader fileReader = new FileReader();
  String dataFile;
  int dayNumber;

  Day (int dayNumber) {
    dataFile = "src/data/input" + dayNumber + ".txt"; 
    this.dayNumber = dayNumber;
  };

  void run() {
    String data = fileReader.readFile(dataFile);
    System.out.print("Day " + dayNumber);
    System.out.print(" part one: " + partOne(data));
    System.out.println(" part two: " + partTwo(data));
  };
  
  abstract String partOne(String data);
  
  abstract String partTwo(String data);
}

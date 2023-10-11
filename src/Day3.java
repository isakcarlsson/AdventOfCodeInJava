package src;

public class Day3 extends Day {
  private String[] rucksacks;

  Day3() {
    super(3);
    this.rucksacks = data.split(System.lineSeparator());
    this.unit = "priortized items";
  }

  public String partOne() {
    int sumOfPriorities = 0;
    
    for (String rucksack : rucksacks) {
      char[] firstCompartment = rucksack.substring(0, rucksack.length() / 2).toCharArray();
      String secondCompartment = rucksack.substring(rucksack.length() / 2);

      for (char c : firstCompartment) {
        if (secondCompartment.contains(String.valueOf(c))) {
          if ((int)c > 96) {
            sumOfPriorities += (int)c - 96;
          } else {
            sumOfPriorities += (int)c - 38;
          }
          break;
        }
      }
    }

    return String.valueOf(sumOfPriorities);
  }

  public String partTwo() {
    int sumOfPriorities = 0;
    
    for (int i = 0; i < rucksacks.length; i+=3) {
      for (char c : rucksacks[i].toCharArray()) {
        if (rucksacks[i+1].contains(String.valueOf(c)) && rucksacks[i+2].contains(String.valueOf(c))) {
          if ((int)c > 96) {
            sumOfPriorities += (int)c - 96;
          } else {
            sumOfPriorities += (int)c - 38;
          }
          break;
        }
      }
    }

    return String.valueOf(sumOfPriorities);
  }
}

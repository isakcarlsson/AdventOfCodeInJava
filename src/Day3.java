package src;

import java.util.Arrays;


public class Day3 {

  public static void main(String[] args) {
    FileReader fileReader = new FileReader();
    String data = fileReader.readFile("src/data/input3.txt");
    String[] rucksacks = data.split(System.lineSeparator());
    Day3 day3 = new Day3();
    day3.partTwo(rucksacks);
    
  }

  private void partOne(String[] rucksacks) {
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

    System.out.println(sumOfPriorities);
  }

  private void partTwo(String[] rucksacks) {
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

    System.out.println(sumOfPriorities);
  }
}

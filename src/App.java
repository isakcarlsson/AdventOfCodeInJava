package src;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
  private ArrayList<Day> days = new ArrayList<Day>();
  private Scanner scanner = new Scanner(System.in);

  App () {
    days.add(new Day4());
  }

  public void startMenu() {
    System.out.println("Welcome to Advent of Code 2022!");
    System.out.println("1. Run all days.");
    System.out.println("2. Run a specific day.");
    System.out.println("q. Exit.");

    String input = scanner.nextLine();

    switch (input) {
      case "1":
        runAllDays();
        break;
      case "2":
        runSpecificDay();
        break;
      case "q":
        System.exit(0);
        break;
      case "Q":
        System.exit(0);
        break;
      default:
        System.out.println("Invalid input.");
        startMenu();
        break;
    }
  }

  public void runAllDays() {
    for (Day day : days) {
      day.run();
    }

    startMenu();
  }

  public void runSpecificDay() {
    System.out.println("Which day would you like to run?");

    String input = scanner.nextLine();

    try {
      int dayNumber = Integer.parseInt(input);
      days.get(dayNumber - 1).run();
    } catch (Exception e) {
      System.out.println("Invalid input.");
      runSpecificDay();
    }

    startMenu();
  }
}

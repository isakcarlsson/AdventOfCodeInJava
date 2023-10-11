package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

  public String readFile(String fileName) {
    String data = "";
    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);

      while (myReader.hasNextLine()) {
        data += myReader.nextLine() + System.lineSeparator();
      }

      myReader.close();

    } catch (FileNotFoundException e) {

      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    return data;
  }
}
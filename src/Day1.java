package src;

import java.util.ArrayList;

public class Day1 extends Day {

    Day1() {
        super(1);
    }

    public String partOne () {
        
    }
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        String data = fileReader.readFile("src/data/input1.txt");
        String[] elfs = data.split(System.lineSeparator() + System.lineSeparator());
        ArrayList<Integer> foodList = new ArrayList<Integer>();
        
        for (String elf : elfs) {
            String[] foods = elf.split(System.lineSeparator());
            int totalFood = 0;

            for (String food : foods) {
                totalFood += Integer.parseInt(food);
            }

            foodList.add(totalFood);
        }

        foodList.sort(null);

        System.out.println(foodList.get(foodList.size() - 1) + foodList.get(foodList.size() - 2) + foodList.get(foodList.size() - 3));
    }
}

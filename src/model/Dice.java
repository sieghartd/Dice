package model;

import java.util.*;

public class Dice {

    Random random = new Random();
    private int low = 1;
    private int high = 6;
    private LinkedList<Integer> resultTotal = new LinkedList<>();

    public void changeTheRangeOfTheDice(int newLow, int newHigh) {
        low = newLow;
        high = newHigh;
        System.out.println("New low range is now " + newLow );
        System.out.println("New high range is now " + newHigh);

    }

    public void rollTheDice(int numberOfRolls) {
        int i;
        for (i =1; i <= numberOfRolls; i++){
            int result = random.nextInt(high - low) + low;
            resultTotal.add(result);
            System.out.println(result + " was rolled and added");
        }
    }

    public void countInstancesOfRolls() {
        int occurrences1 = Collections.frequency(resultTotal, 1);
        int occurrences2 = Collections.frequency(resultTotal, 2);
        int occurrences3 = Collections.frequency(resultTotal, 3);
        int occurrences4 = Collections.frequency(resultTotal, 4);
        int occurrences5 = Collections.frequency(resultTotal, 5);
        int occurrences6 = Collections.frequency(resultTotal, 6);

        System.out.println("There were " + occurrences1 + " occurances of 1");
        System.out.println("There were " + occurrences2 + " occurances of 2");
        System.out.println("There were " + occurrences3 + " occurances of 3");
        System.out.println("There were " + occurrences4 + " occurances of 4");
        System.out.println("There were " + occurrences5 + " occurances of 5");
        System.out.println("There were " + occurrences6 + " occurances of 6");

    }

    public LinkedList getResultTotal() {
        return resultTotal;
    }
}

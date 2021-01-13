package main;

import model.Dice;

public class Demo {

    public static void main(String[] args) {
        Dice dice = new Dice();
//        dice.changeTheRangeOfTheDice(2,10);
        dice.rollTheDice(5);
        System.out.println();
        System.out.println(dice.getResultTotal());
        System.out.println();
        dice.countInstancesOfRolls();


    }
}

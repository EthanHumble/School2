package Homework;

public class ExerciseTwo {
    public static void main(String[] args) {
        double number = 10;
        double multiplier = 0.7, count = 0;
        do
        {
            double distance = number += number *= multiplier;
            System.out.println(number);
            count = number += distance;

        }
        while (number >= 0.1);

        System.out.println(" Distance today " + count);

    }
}


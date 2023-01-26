package Quizzes;

import java.util.Scanner;

public class Quiz1 {
    //Problem 1

    //Problem 2
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Input number of credit hours: ");
    int Grade = input.nextInt();
        input.close();
        switch(Grade) {
            case int <30:
                System.out.println("Freshman");
                break;
            case int <60:
                System.out.println("Sophomore");
                break;
            case int <90:
                System.out.println("Junior");
                break;
            default:
                System.out.println("Senior");
        }

    }
    //Problem 3
}

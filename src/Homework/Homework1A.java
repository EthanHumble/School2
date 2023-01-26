//package Homework;

//import java.util.Scanner;

//public class Homework1A {
    //            Problem 2
//    public static void main(String[] args) {
//        double x = 1;
//        double y = 4;
//        double z = 3;
//        double average = (x + y + z) / 3;
//        System.out.println("Average is " + average);
//    }
    //            Problem 4
//    public static void main(String[] args) {
//        int d = 14;
//        double r = d / 2;
//        double a = Math.pow(r, 2) * Math.PI;
//        System.out.println(a/8);
//    }
////            Problem 5
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println(" Input diameter: ");
//        int diameter = input.nextInt();
//        System.out.println(" Input number of slices: ");
//        int slices = input.nextInt();
//        input.close();
//        double r = diameter / 2;
//        double a = Math.pow(r, 2) * Math.PI;
//        System.out.println(a / slices);
//    }

//    Problem 6
//public static void main(String[] args) {
//    int x = 1;
//    if (x > 0) System.out.print(x);
//
//    int x = 1;
//    int y = 3;
//    if (1 + x > Math.pow(x, Math.sqrt(2))) {y = y + x;}
//
//    int x = 1;
//    int y = 5;
//    if (x == 1) {y++;}
//
//    String letterGrade = "F";
//    int grade = 75;  //Note this must work for all values of grade
//    if (grade >= 90) {
//        letterGrade = "A";
//    }
//    else if (grade >= 80) {
//        letterGrade = "B";
//    }
//    else if (grade >= 70) {
//        letterGrade = "C";
//    }
//    else if (grade >= 60) {
//        letterGrade = "D";
//    }
//    System.out.println(letterGrade);
//}
//}


    //          Problem 7
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println(" Input temperature: ");
//        int Temperature = input.nextInt();
//        input.close();
//        if (Temperature < 30) System.out.println(" Cold " + Math.abs(Temperature - 30));
//        else System.out.println(" Not bad ");
//    }
//    Problem 8
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println(" Input grade: ");
//    String Grade = input.nextLine();
//        input.close();
//        switch(Grade) {
//            case "A":
//                System.out.println("4");
//                break;
//            case "B":
//                System.out.println("3");
//                break;
//            case "C":
//                System.out.println("2");
//                break;
//            case "D":
//                System.out.println("1");
//                break;
//            case "F":
//                System.out.println("0");
//                break;
//            default:
//                System.out.println("Invalid choice.");
//        }
//
//    }
// Problem 9
//    public static void main(String[] args) {
//        for (int i = 817; i > 9; i-= 2) {
//            System.out.print(i + " ");
//        }    }
// Problem 10
//    public static void main(String[] args) {
//            for (int i = 0; i < 101; i+= 10) {
//                System.out.println(i + " Degrees Celsius equals");
//                System.out.println((i* 9/5 +32) + " Degrees Fahrenheit " + " ");
//                System.out.println();
//            }    }
//Problem 11
//    public static void main(String[] args) {
//        String Finish = "Finish";
//        int total = 0;
//        while (Finish.equals("Finish")) {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Input a word. Type Finish when you're done: ");
//            String randomWord = input.next();
//            int length = randomWord.length();
//            total += length;
//            if (randomWord.equals("Finish")) {
//                Finish = "Correct";
//                System.out.println(total - 6);
//            }
//        }


        //Problem 12
//    public static void main(String[] args) {
//        int a = 3;
//        int b = 1;
//        System.out.println(b = (a == b++) ? b - 1 : a + 1);
//    }

//}

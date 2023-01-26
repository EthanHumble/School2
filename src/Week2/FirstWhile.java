package Week2;

public class FirstWhile {
    public static void main(String[] args) {
        int number = 0;
        while (number <= 5) {
            System.out.println(number + " ");
            number ++;
        }
        System.out.println();
        number = 0;
        do {
            System.out.println(number + " ");
            number++;
        }while(number <=5);
    }
}

package Week2;

public class PairProgramming {
    public static void main(String[] args) {
        double total = 10;
        double distance = 10;
        int day = 1;
        do {
            System.out.println("Day " + day + " distance today = " + distance + " total = " + total);
            distance = distance * 0.7;
            day++;
            total = total += distance;
        }while(distance > 0.1);
    }
}

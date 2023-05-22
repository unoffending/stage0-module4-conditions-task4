package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if(first == second) {
            System.out.println(first);
        } else {
            int max = first > second ? first : second;
            System.out.println(max);
        }
    }
}

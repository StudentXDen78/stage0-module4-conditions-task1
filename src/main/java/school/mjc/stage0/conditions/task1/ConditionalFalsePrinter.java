package school.mjc.stage0.conditions.task1;

public class ConditionalFalsePrinter {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        boolean c;
        if (a == b) {
            c = true;
            System.out.println(c);
        }
        else {
            c = false;
            System.out.println(c);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        System.out.println("Before: a = " + a + ", b = " + b);

        a = swapNumber(b, b = a);

        System.out.println("After: a = " + a + ", b = " + b);
    }

    public static int swapNumber(int a, int b) {
        return a;
    }
}

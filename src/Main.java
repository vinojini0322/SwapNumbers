public class Main {
    public static void main(String[] args) {
        System.out.println("Swap using a 3rd variable");
        swapWithThirdVar(10, 15);
        System.out.println("Swap without using a 3rd variable");
        swapWithoutThirdVar(10, 15);
    }

    private static void swapWithThirdVar(int a, int b) {
        System.out.println("Value before swapping: \nA = " + a + "\nB = " + b);
        int c = b;
        b = a;
        a = c;
        System.out.println("Value after swapping: \nA = " + a + "\nB = " + b);

    }

    private static void swapWithoutThirdVar(int a, int b) {
        System.out.println("Value before swapping: \nA = " + a + "\nB = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value after swapping: \nA = " + a + "\nB = " + b);

    }
}

public class BugsInForLoop {
    public static void main(String args[]) {
        int i = 0;
        int sum = 0;

        for (i = 8; i > 0; i-=2) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}

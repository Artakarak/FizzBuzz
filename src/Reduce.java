public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;
        while (n > 0) {
            boolean even = n % 2 == 0;
            boolean odd = n % 2 != 0;

            if (even) {
                n = n / 2;
                steps++;
            } else if (odd) {
                n = n - 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}

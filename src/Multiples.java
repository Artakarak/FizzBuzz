public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int j = 1; j < 1000; j++) {
            boolean multipleofthree = j%3 == 0;
            boolean multipleoffive = j%5 == 0;

            if (multipleofthree) {
                count++;
            } else if (multipleoffive) {
                count++;
            }


        }
        System.out.println(count);
    }

}

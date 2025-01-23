public class Array {


    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 7, 3, 1, 9, 5, 0, 1};

        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            min = Math.min(min, number);
        }

        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            max = Math.max(max, number);
        }
    }

}
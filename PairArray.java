public class PairArray {

    public static void printPairs(int numbers[]) {
        int tp = 0; //total pairs kai liye hai
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + ", " + numbers[j] + ") ");
            }
            System.out.println();
            tp++;  //total pairs print karne kai liye hai
        }
        System.out.println("Total pairs = " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}

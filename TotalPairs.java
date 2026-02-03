public class TotalPairs {
    public static void printTotalPairs(int numbers[]) {
        int n = numbers.length;
        int totalPairs = (n * (n - 1) / 2) ;
        System.out.println("Total pairs = " + totalPairs);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8,10};
        printTotalPairs(numbers);
    }
}

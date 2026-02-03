public class BinarySearch {

    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }

            if (number[mid] < key) { // right side
                start = mid + 1;
            } else { // left side
                end = mid - 1;
            }
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 14;

        int index = binarySearch(number, key);
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index : " + index);
        }
    }
}

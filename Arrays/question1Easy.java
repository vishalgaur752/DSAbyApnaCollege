
public class question1Easy {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arr[] = {3, 2, 1, 56, 10000, 167};
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Value : " + max + ", Minimum Value : " + min);
    }
}

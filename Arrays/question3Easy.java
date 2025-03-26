
public class question3Easy {

    public static void printSubArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(max);
    }

    public static void maxSubArr(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                    if (maxSum < currSum) {
                        maxSum = currSum;
                    }
                }
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        printSubArray(arr);
    }
}

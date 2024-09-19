public class DiverseArray {

    // Method 1 - arraySum
    public static int arraySum(int[] arr1D) {
        int sum = 0;

        for (int x : arr1D) {
            sum += x;
        }

        return sum;
    }


    // Method 2 - rowSums
    public static int[] rowSums(int[][] arr2D) {
        int[] sum = new int[arr2D.length];

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                sum[i] += arr2D[i][j];
            }
        }

        return sum;
    }


    // Method 3 - isDiverse
    public static boolean isDiverse(int[][] arr2D) {
        int[] rowSums = rowSums(arr2D);

        for (int i = 0; i < rowSums.length; i++) {
            for (int j = i + 1; j < rowSums.length; j++) {
                if (rowSums[i] == rowSums[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}

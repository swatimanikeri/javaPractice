// public class linearMin {
//     public static void main(String[] args) {
//         int[] arr = {4, 8, 90, 5, 7, 85};
//         System.out.println(findMin(arr));
//     }

//     static int findMin(int[] arr) {
//         int min = arr[0];  // Assume the first element is minimum
//         for (int i = 1; i < arr.length; i++) { 
//             if (arr[i] < min) {   // Check if current element is smaller
//                 min = arr[i];
//             }
//         }
//         return min;
//     }
// }
public class linearMin {
    public static void main(string[] args) {
        int[] arr = {4, 8, 90, 5, 7, 85};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr) {
        int min = arr[0];  // Assume the first element is minimum
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] > min) {   // Check if current element is smaller
                min = arr[i];
            }
        }
        return min;
    }
}


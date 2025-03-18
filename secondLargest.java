public class secondLargest {
    public static void main(string[] args) {
        int[] arr = {4, 8, 90, 5, 7, 85};
        System.out.println(findMax(arr));
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        int Secmax = arr[0];  // Assume the first element is minimum
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] > max) {   // Check if current element is smaller
                max= arr[i];
            }
            }
    for (int i = 1; i < arr.length; i++) { 
        if (arr[i] > Secmax && arr[i] != max) {   // Check if current element is smaller
            Secmax= arr[i];
        }
}
return Secmax;
    
}}



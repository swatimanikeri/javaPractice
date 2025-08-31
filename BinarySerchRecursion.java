package DAY3;

public class BinarySerchRecursion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=4;
        int start=0;
        int end=arr.length-1;
        System.out.println(FindMe(arr,0,end,target));

    }
    public static int FindMe(int arr[], int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {
            return FindMe(arr, start, mid - 1, target);
        } else {
            return FindMe(arr, mid + 1, end, target);
        }
    }
}//coolllllllll

public class insertionsort {
    public static void main(string[] args) {
        int[] arr={5,3,4,1,2};
        insertion(arr);
        printArray(arr);
        
    }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for( int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }

            }

        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}


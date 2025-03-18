public class Binary {
    public static void main(string[] args) {
        int[] arr={5,6,7,8,3,87};
        int target=7;
        System.out.println(binary(arr,target));

    }
    static int binary(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    
    while(start<=end){
        int mid=start+(end-start)/2;
        if(target<arr[mid]){
            end=mid-1;
        }
        else if(target>arr[mid]){
           start=mid+1;
        }
        else{
            return mid;
        }
    }
    return -1;
}
    }
    



public class linearSearch {
    public static void main(string[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=5;
        System.out.println(linear(arr,target));

    }
    static int linear(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i <arr.length; i++) {
           int element=arr[i];
           if(element==target){
            return i;
           }
            
        }
        return -1;
    }
}

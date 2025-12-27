public class ZerosAtFront {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,0,4,0,3};
        for(int i:returnMe(arr)){
            System.out.print(i+" ");
        }
    }
    public static int[] returnMe(int[] arr){
        int p1=arr.length-1;
        int p2=arr.length-1;
        int temp=0;
     
        while (p2 >= 0) {
            if (arr[p2] != 0) {
                 temp = arr[p2];
                arr[p2] = arr[p1];
                arr[p1] = temp;
                p1--;
            }
            p2--;
        }

        return arr;
    }}
